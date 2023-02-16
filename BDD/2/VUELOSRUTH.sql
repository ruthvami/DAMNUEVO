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


-- Dumping database structure for VUELOS
CREATE DATABASE IF NOT EXISTS `VUELOS` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `VUELOS`;

-- Dumping structure for table VUELOS.AEROPUERTOS
CREATE TABLE IF NOT EXISTS `AEROPUERTOS` (
  `AER_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `AER_CODIGO` int(10) unsigned DEFAULT NULL,
  `AER_NOMBRE` varchar(50) DEFAULT NULL,
  `AER_COD_CIUDAD` int(11) unsigned DEFAULT NULL,
  PRIMARY KEY (`AER_ID`),
  KEY `FK_AEROPUERTOS_CIUDADES` (`AER_COD_CIUDAD`),
  CONSTRAINT `FK_AEROPUERTOS_CIUDADES` FOREIGN KEY (`AER_COD_CIUDAD`) REFERENCES `CIUDADES` (`CIU_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- Dumping data for table VUELOS.AEROPUERTOS: ~1 rows (approximately)
INSERT INTO `AEROPUERTOS` (`AER_ID`, `AER_CODIGO`, `AER_NOMBRE`, `AER_COD_CIUDAD`) VALUES
	(1, 423, 'ngfh', NULL);

-- Dumping structure for table VUELOS.CIUDADES
CREATE TABLE IF NOT EXISTS `CIUDADES` (
  `CIU_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `CIU_NOMBRE` varchar(50) DEFAULT NULL,
  `CIU_COD_PAIS` int(11) unsigned DEFAULT NULL,
  PRIMARY KEY (`CIU_ID`),
  KEY `FK_CIUDADES_PAISES` (`CIU_COD_PAIS`),
  CONSTRAINT `FK_CIUDADES_PAISES` FOREIGN KEY (`CIU_COD_PAIS`) REFERENCES `PAISES` (`PAI_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- Dumping data for table VUELOS.CIUDADES: ~1 rows (approximately)
INSERT INTO `CIUDADES` (`CIU_ID`, `CIU_NOMBRE`, `CIU_COD_PAIS`) VALUES
	(1, 'hgj', NULL);

-- Dumping structure for table VUELOS.ESCALA
CREATE TABLE IF NOT EXISTS `ESCALA` (
  `ESC_ID` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `ESC_COD_AER` int(11) unsigned DEFAULT NULL,
  `ESC_COD_PLAN` int(11) unsigned DEFAULT NULL,
  `DIA_HORA_DESPEGUE` datetime DEFAULT NULL,
  `DIA_HORA_ATERRIZAJE` datetime DEFAULT NULL,
  PRIMARY KEY (`ESC_ID`),
  KEY `FK_ESCALA_PLAN DE VUELO` (`ESC_COD_PLAN`),
  CONSTRAINT `FK_ESCALA_PLAN DE VUELO` FOREIGN KEY (`ESC_COD_PLAN`) REFERENCES `PLAN DE VUELO` (`PLAN_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- Dumping data for table VUELOS.ESCALA: ~1 rows (approximately)
INSERT INTO `ESCALA` (`ESC_ID`, `ESC_COD_AER`, `ESC_COD_PLAN`, `DIA_HORA_DESPEGUE`, `DIA_HORA_ATERRIZAJE`) VALUES
	(1, 23, NULL, '2010-02-16 21:18:29', '2003-02-16 21:19:18');

-- Dumping structure for table VUELOS.FABRICANTES
CREATE TABLE IF NOT EXISTS `FABRICANTES` (
  `FAB_ID` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `FAB_NOMBRE` varchar(50) DEFAULT NULL,
  `FAB_CODIGO` int(11) unsigned DEFAULT NULL,
  PRIMARY KEY (`FAB_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- Dumping data for table VUELOS.FABRICANTES: ~1 rows (approximately)
INSERT INTO `FABRICANTES` (`FAB_ID`, `FAB_NOMBRE`, `FAB_CODIGO`) VALUES
	(1, 'ruth', 3);

-- Dumping structure for table VUELOS.LINEAS AERIAS
CREATE TABLE IF NOT EXISTS `LINEAS AERIAS` (
  `LIN_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `LIN_NOMBRE` varchar(50) DEFAULT NULL,
  `LIN_COD_PAIS` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`LIN_ID`),
  KEY `FK_LINEAS AERIAS_PAISES` (`LIN_COD_PAIS`),
  CONSTRAINT `FK_LINEAS AERIAS_PAISES` FOREIGN KEY (`LIN_COD_PAIS`) REFERENCES `PAISES` (`PAI_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- Dumping data for table VUELOS.LINEAS AERIAS: ~1 rows (approximately)
INSERT INTO `LINEAS AERIAS` (`LIN_ID`, `LIN_NOMBRE`, `LIN_COD_PAIS`) VALUES
	(1, 'gfd', NULL);

-- Dumping structure for table VUELOS.MODELO AVION
CREATE TABLE IF NOT EXISTS `MODELO AVION` (
  `MOD_ID` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `MOD_NUM_PLAZAS` int(11) unsigned DEFAULT NULL,
  `MOD_FABRICANTE` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`MOD_ID`),
  KEY `FK_MODELO AVION_FABRICANTES` (`MOD_FABRICANTE`),
  CONSTRAINT `FK_MODELO AVION_FABRICANTES` FOREIGN KEY (`MOD_FABRICANTE`) REFERENCES `FABRICANTES` (`FAB_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- Dumping data for table VUELOS.MODELO AVION: ~1 rows (approximately)
INSERT INTO `MODELO AVION` (`MOD_ID`, `MOD_NUM_PLAZAS`, `MOD_FABRICANTE`) VALUES
	(1, 34, 1);

-- Dumping structure for table VUELOS.PAISES
CREATE TABLE IF NOT EXISTS `PAISES` (
  `PAI_ID` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `PAI_NOMBRE` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`PAI_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- Dumping data for table VUELOS.PAISES: ~1 rows (approximately)
INSERT INTO `PAISES` (`PAI_ID`, `PAI_NOMBRE`) VALUES
	(1, 'rui');

-- Dumping structure for table VUELOS.PLAN DE VUELO
CREATE TABLE IF NOT EXISTS `PLAN DE VUELO` (
  `PLAN_ID` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `PLAN_CODIGO` int(11) unsigned DEFAULT NULL,
  `PLAN_COD_LINEAAERIA` int(10) unsigned DEFAULT NULL,
  `PLAN_L` time DEFAULT NULL,
  `PLAN_M` time DEFAULT NULL,
  `PLAN_X` time DEFAULT NULL,
  `PLAN_J` time DEFAULT NULL,
  `PLAN_V` time DEFAULT NULL,
  `PLAN_S` time DEFAULT NULL,
  `PLAN_D` time DEFAULT NULL,
  PRIMARY KEY (`PLAN_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- Dumping data for table VUELOS.PLAN DE VUELO: ~1 rows (approximately)
INSERT INTO `PLAN DE VUELO` (`PLAN_ID`, `PLAN_CODIGO`, `PLAN_COD_LINEAAERIA`, `PLAN_L`, `PLAN_M`, `PLAN_X`, `PLAN_J`, `PLAN_V`, `PLAN_S`, `PLAN_D`) VALUES
	(1, 4, 4, '03:20:30', '-02:39:27', '30:20:36', '33:20:38', '13:20:41', '11:20:43', '41:20:46');

-- Dumping structure for table VUELOS.VUELO
CREATE TABLE IF NOT EXISTS `VUELO` (
  `VUE_ID` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `VUE_COD_MODELO` int(11) unsigned DEFAULT NULL,
  `VUE_COD_PLAN` int(10) unsigned DEFAULT NULL,
  `VUE_FECHA` date DEFAULT NULL,
  `VUE_PLAZASLIBRES` int(11) unsigned DEFAULT NULL,
  PRIMARY KEY (`VUE_ID`),
  KEY `FK_VUELO_MODELO AVION` (`VUE_COD_MODELO`),
  CONSTRAINT `FK_VUELO_MODELO AVION` FOREIGN KEY (`VUE_COD_MODELO`) REFERENCES `MODELO AVION` (`MOD_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- Dumping data for table VUELOS.VUELO: ~1 rows (approximately)
INSERT INTO `VUELO` (`VUE_ID`, `VUE_COD_MODELO`, `VUE_COD_PLAN`, `VUE_FECHA`, `VUE_PLAZASLIBRES`) VALUES
	(1, 1, 543, '2015-02-16', NULL);

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
