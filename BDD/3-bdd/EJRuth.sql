-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.4.24-MariaDB - Source distribution
-- SO del servidor:              Linux
-- HeidiSQL Versión:             12.1.0.6537
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Volcando estructura de base de datos para Ventas
CREATE DATABASE IF NOT EXISTS `Ventas` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `Ventas`;

-- Volcando estructura para procedimiento Ventas. BorroAlumno
DELIMITER //
CREATE PROCEDURE ` BorroAlumno`(
	IN `_AlumID` INT
)
    MODIFIES SQL DATA
BEGIN
DELETE FROM Alumnos WHERE Alumno_ID=_AlumID;
END//
DELIMITER ;

-- Volcando estructura para tabla Ventas.Alumnos
CREATE TABLE IF NOT EXISTS `Alumnos` (
  `Alumno_ID` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `Alumno_Nombre` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Alumno_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla Ventas.Alumnos: ~4 rows (aproximadamente)
INSERT INTO `Alumnos` (`Alumno_ID`, `Alumno_Nombre`) VALUES
	(1, 'Clara'),
	(2, 'Alejandro'),
	(3, 'Sofia'),
	(4, 'Mateo'),
	(5, 'Valentina'),
	(6, 'ASDASD');

-- Volcando estructura para función Ventas.GananciaVentas
DELIMITER //
CREATE FUNCTION `GananciaVentas`(`_Mes` INT,
	`_Ano` INT
) RETURNS decimal(10,0)
    MODIFIES SQL DATA
BEGIN
DECLARE Ganancia DECIMAL(10,2);
DECLARE Precio DECIMAL(10,2);
DECLARE Cantidad MEDIUMINT;
DECLARE Costo DECIMAL(10,2);
DECLARE Final TinyInt DEFAULT 0;
DECLARE CV CURSOR FOR
SELECT VD_Precio, VD_Costo, VD_Cantidad FROM Ventas_detalle
JOIN Ventas ON VD_VentasId=Ventas_ID
WHERE VD_Costo>0 AND YEAR(Ventas_Fecha)=_Ano AND MONTH(Ventas_Fecha)=_Mes;
DECLARE CONTINUE HANDLER FOR NOT FOUND SET Final=1;
SET Ganancia=0;
OPEN CV;
WHILE Final=0 DO
FETCH CV INTO Precio, Costo, Cantidad;
IF Final=0 THEN
SET Ganancia=Ganancia + ((Precio - Costo)*Cantidad);
END IF;
END WHILE;
CLOSE CV;
RETURN Ganancia;
END//
DELIMITER ;

-- Volcando estructura para procedimiento Ventas.InsertoAlumnos
DELIMITER //
CREATE PROCEDURE `InsertoAlumnos`(
	IN `_AlumnoID` INT,
	IN `_AlumnoNombre` VARCHAR(50)
)
    MODIFIES SQL DATA
BEGIN
DECLARE CONTINUE HANDLER FOR 1062 SELECT 'Clave Duplicada' AS Mensaje;
INSERT INTO Alumnos (Alumno_Id,Alumno_Nombre) VALUES(_AlumnoID,_AlumnoNombre);
END//
DELIMITER ;

-- Volcando estructura para tabla Ventas.listadeproductos
CREATE TABLE IF NOT EXISTS `listadeproductos` (
  `ProductoID` int(11) NOT NULL,
  `NombreProducto` varchar(100) DEFAULT NULL,
  `Precio` decimal(10,2) DEFAULT NULL,
  `Stock` int(11) DEFAULT NULL,
  PRIMARY KEY (`ProductoID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla Ventas.listadeproductos: ~3 rows (aproximadamente)
INSERT INTO `listadeproductos` (`ProductoID`, `NombreProducto`, `Precio`, `Stock`) VALUES
	(1, 'Producto 1', 10.99, 100),
	(2, 'Producto 2', 15.99, 50),
	(3, 'Producto 3', 24.99, 200);

-- Volcando estructura para procedimiento Ventas.MaximaVenta
DELIMITER //
CREATE PROCEDURE `MaximaVenta`()
    MODIFIES SQL DATA
BEGIN
DECLARE ValorMaximo DECIMAL(10,2);
SET ValorMaximo=0;
SELECT MAX(Ventas_Total) INTO ValorMaximo FROM Ventas;
IF ValorMaximo > 1000 THEN
SELECT 'Se superaron los 1000€ !!' AS Mensaje;
ELSE
SELECT 'Aun no superamos los 1000€ !!' AS Mensaje;
END IF;
END//
DELIMITER ;

-- Volcando estructura para tabla Ventas.productos
CREATE TABLE IF NOT EXISTS `productos` (
  `Prod_Id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `Prod_Precio` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`Prod_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla Ventas.productos: ~0 rows (aproximadamente)

-- Volcando estructura para tabla Ventas.productos_historial
CREATE TABLE IF NOT EXISTS `productos_historial` (
  `PH_Id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `PH_ProdId` mediumint(8) unsigned NOT NULL,
  `PH_PrecioANT` decimal(10,0) unsigned NOT NULL,
  `PH_PrecioNEW` decimal(10,0) unsigned NOT NULL,
  `PH_Fecha` timestamp NOT NULL DEFAULT current_timestamp(),
  `PH_Usuario` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`PH_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla Ventas.productos_historial: ~0 rows (aproximadamente)

-- Volcando estructura para función Ventas.ProveedorID
DELIMITER //
CREATE FUNCTION `ProveedorID`() RETURNS int(11)
    DETERMINISTIC
BEGIN
return @ParamProvID;
END//
DELIMITER ;

-- Volcando estructura para tabla Ventas.Ventas
CREATE TABLE IF NOT EXISTS `Ventas` (
  `Ventas_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `Ventas_Fecha` date DEFAULT NULL,
  `Ventas_Total` int(255) unsigned DEFAULT NULL,
  PRIMARY KEY (`Ventas_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla Ventas.Ventas: ~3 rows (aproximadamente)
INSERT INTO `Ventas` (`Ventas_ID`, `Ventas_Fecha`, `Ventas_Total`) VALUES
	(1, '2023-05-24', 34),
	(2, '2023-05-24', 5615),
	(3, NULL, 30);

-- Volcando estructura para tabla Ventas.Ventas_detalle
CREATE TABLE IF NOT EXISTS `Ventas_detalle` (
  `VD_Id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `VD_Precio` int(10) unsigned DEFAULT NULL,
  `VD_Costo` int(10) unsigned DEFAULT NULL,
  `VD_Cantidad` int(10) unsigned DEFAULT NULL,
  `VD_VentasID` int(11) unsigned DEFAULT NULL,
  PRIMARY KEY (`VD_Id`) USING BTREE,
  KEY `FK_Ventas_detalle_Ventas` (`VD_VentasID`),
  CONSTRAINT `FK_Ventas_detalle_Ventas` FOREIGN KEY (`VD_VentasID`) REFERENCES `Ventas` (`Ventas_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla Ventas.Ventas_detalle: ~0 rows (aproximadamente)

-- Volcando estructura para vista Ventas.Vista
-- Creando tabla temporal para superar errores de dependencia de VIEW
CREATE TABLE `Vista` (
	`ProductoID` INT(11) NOT NULL,
	`NombreProducto` VARCHAR(100) NULL COLLATE 'utf8mb4_general_ci',
	`Precio` DECIMAL(10,2) NULL,
	`Stock` INT(11) NULL
) ENGINE=MyISAM;

-- Volcando estructura para disparador Ventas.NombreMayusculas
SET @OLDTMP_SQL_MODE=@@SQL_MODE, SQL_MODE='STRICT_TRANS_TABLES,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION';
DELIMITER //
CREATE TRIGGER `NombreMayusculas` BEFORE INSERT ON `Alumnos` FOR EACH ROW BEGIN
SET NEW.Alumno_Nombre = UCASE(NEW.Alumno_Nombre);
END//
DELIMITER ;
SET SQL_MODE=@OLDTMP_SQL_MODE;

-- Volcando estructura para disparador Ventas.NoNegativo
SET @OLDTMP_SQL_MODE=@@SQL_MODE, SQL_MODE='STRICT_TRANS_TABLES,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION';
DELIMITER //
CREATE TRIGGER `NoNegativo` BEFORE INSERT ON `Ventas` FOR EACH ROW BEGIN
IF NEW.Ventas_Total <0 THEN 
UPDATE calls SET Ventas_Total =0;
END IF;
END//
DELIMITER ;
SET SQL_MODE=@OLDTMP_SQL_MODE;

-- Volcando estructura para disparador Ventas.productos_after_update
SET @OLDTMP_SQL_MODE=@@SQL_MODE, SQL_MODE='STRICT_TRANS_TABLES,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION';
DELIMITER //
CREATE TRIGGER `productos_after_update` AFTER UPDATE ON `productos` FOR EACH ROW BEGIN
IF NEW.Prod_Precio <> OLD.Prod_Precio THEN
INSERT INTO productos_historial (PH_ProdId,PH_PrecioANT,PH_PrecioNEW,PH_Usuario) VALUES (NEW.Prod_Id, OLD.Prod_Precio, NEW.Prod_Precio, CURRENT_USER);
END IF;
END//
DELIMITER ;
SET SQL_MODE=@OLDTMP_SQL_MODE;

-- Volcando estructura para vista Ventas.Vista
-- Eliminando tabla temporal y crear estructura final de VIEW
DROP TABLE IF EXISTS `Vista`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `Vista` AS select `listadeproductos`.`ProductoID` AS `ProductoID`,`listadeproductos`.`NombreProducto` AS `NombreProducto`,`listadeproductos`.`Precio` AS `Precio`,`listadeproductos`.`Stock` AS `Stock` from `listadeproductos`;

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
