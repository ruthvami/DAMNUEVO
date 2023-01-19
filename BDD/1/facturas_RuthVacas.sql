-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versió del servidor:          10.4.24-MariaDB - Source distribution
-- SO del servidor:              Linux
-- HeidiSQL Versió:              12.1.0.6537
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for facturas_RuthVacas
CREATE DATABASE IF NOT EXISTS `facturas_RuthVacas` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `facturas_RuthVacas`;

-- Dumping structure for table facturas_RuthVacas.articulo
CREATE TABLE IF NOT EXISTS `articulo` (
  `art_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `cod_articulo` int(11) unsigned NOT NULL,
  `descripcion_art` text DEFAULT NULL,
  `precio_unitario` int(11) unsigned DEFAULT NULL,
  PRIMARY KEY (`art_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

-- Dumping data for table facturas_RuthVacas.articulo: ~3 rows (approximately)
INSERT INTO `articulo` (`art_id`, `cod_articulo`, `descripcion_art`, `precio_unitario`) VALUES
	(1, 1, 'tejas de color amarillo', 24),
	(2, 15, 'mesa rosa', 1),
	(3, 3, NULL, NULL);

-- Dumping structure for table facturas_RuthVacas.cliente
CREATE TABLE IF NOT EXISTS `cliente` (
  `cli_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `codigo_cliente` int(10) unsigned NOT NULL,
  `nombre_cliente` char(50) NOT NULL,
  `domicilio_cliente` char(50) DEFAULT NULL,
  `localidad` char(50) DEFAULT NULL,
  `codigo_postal` int(10) unsigned DEFAULT NULL,
  `posicion_iva` int(10) unsigned NOT NULL,
  `foto_carnet` blob DEFAULT NULL,
  PRIMARY KEY (`cli_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

-- Dumping data for table facturas_RuthVacas.cliente: ~3 rows (approximately)
INSERT INTO `cliente` (`cli_id`, `codigo_cliente`, `nombre_cliente`, `domicilio_cliente`, `localidad`, `codigo_postal`, `posicion_iva`, `foto_carnet`) VALUES
	(1, 1234, 'ruben', NULL, NULL, NULL, 29, NULL),
	(2, 121, 'ignacia', NULL, NULL, NULL, 3, NULL),
	(3, 129, 'ruben', NULL, NULL, NULL, 8, _binary 0x6148523063484d364c7939745a575270595335324d69357a6158646c5969356c63793931634778765957526c5a46393061485674596c39745a575270645730764e4441355a4445325a5452695a6d526b4f5751314e6d4a695932526c5a4755774d5449344f444e6b5a446b764e7a67314d7a557a4d31396a59584a755a585266614335716347633d);

-- Dumping structure for table facturas_RuthVacas.detalle_factura
CREATE TABLE IF NOT EXISTS `detalle_factura` (
  `det_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nro_factura` int(11) unsigned NOT NULL,
  `cod_articulo` int(11) unsigned NOT NULL,
  `cantidad_vendida` int(10) unsigned NOT NULL,
  PRIMARY KEY (`det_id`),
  KEY `FK_detalle_factura_factura` (`nro_factura`),
  KEY `FK_detalle_factura_articulo` (`cod_articulo`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

-- Dumping data for table facturas_RuthVacas.detalle_factura: ~2 rows (approximately)
INSERT INTO `detalle_factura` (`det_id`, `nro_factura`, `cod_articulo`, `cantidad_vendida`) VALUES
	(1, 1, 1, 3),
	(2, 2, 2, 98);

-- Dumping structure for table facturas_RuthVacas.factura
CREATE TABLE IF NOT EXISTS `factura` (
  `fac_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `nro_factura` int(10) unsigned NOT NULL,
  `fecha_factura` date DEFAULT NULL,
  `codigo_vendedor` int(11) unsigned NOT NULL,
  `codigo_cliente` int(11) unsigned NOT NULL,
  `importe_neto_factura` int(11) DEFAULT NULL,
  PRIMARY KEY (`fac_id`),
  KEY `FK_factura_vendedor` (`codigo_vendedor`),
  KEY `FK_factura_cliente` (`codigo_cliente`),
  CONSTRAINT `FK_factura_cliente` FOREIGN KEY (`codigo_cliente`) REFERENCES `cliente` (`cli_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_factura_vendedor` FOREIGN KEY (`codigo_vendedor`) REFERENCES `vendedor` (`ven_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

-- Dumping data for table facturas_RuthVacas.factura: ~2 rows (approximately)
INSERT INTO `factura` (`fac_id`, `nro_factura`, `fecha_factura`, `codigo_vendedor`, `codigo_cliente`, `importe_neto_factura`) VALUES
	(1, 29, '2022-07-19', 1, 2, NULL),
	(2, 8, '2002-12-07', 2, 1, NULL);

-- Dumping structure for table facturas_RuthVacas.vendedor
CREATE TABLE IF NOT EXISTS `vendedor` (
  `ven_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `cod_vendedor` int(11) unsigned NOT NULL,
  `nombre_vendedor` char(50) NOT NULL,
  PRIMARY KEY (`ven_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

-- Dumping data for table facturas_RuthVacas.vendedor: ~3 rows (approximately)
INSERT INTO `vendedor` (`ven_id`, `cod_vendedor`, `nombre_vendedor`) VALUES
	(1, 2, 'manolo'),
	(2, 1256, 'antonio'),
	(3, 45, 'rigoberto');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
