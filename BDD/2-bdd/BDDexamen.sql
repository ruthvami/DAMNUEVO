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


-- Dumping database structure for examen2
CREATE DATABASE IF NOT EXISTS `examen2` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `examen2`;

-- Dumping structure for table examen2.Especialidades
CREATE TABLE IF NOT EXISTS `Especialidades` (
  `esp_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `esp_hos_id` int(10) unsigned NOT NULL,
  `esp_nombre` varchar(50) NOT NULL,
  PRIMARY KEY (`esp_id`),
  KEY `FK_Especialidades_Hospital` (`esp_hos_id`),
  CONSTRAINT `FK_Especialidades_Hospital` FOREIGN KEY (`esp_hos_id`) REFERENCES `Hospital` (`hos_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;

-- Dumping data for table examen2.Especialidades: ~4 rows (approximately)
INSERT INTO `Especialidades` (`esp_id`, `esp_hos_id`, `esp_nombre`) VALUES
	(1, 1, 'trauma'),
	(2, 2, 'odontologia'),
	(3, 3, 'pediatria'),
	(4, 4, 'conocer');

-- Dumping structure for table examen2.Hospital
CREATE TABLE IF NOT EXISTS `Hospital` (
  `hos_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `hos_nombre` varchar(50) NOT NULL,
  PRIMARY KEY (`hos_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;

-- Dumping data for table examen2.Hospital: ~4 rows (approximately)
INSERT INTO `Hospital` (`hos_id`, `hos_nombre`) VALUES
	(1, 'hosp1'),
	(2, 'hosp2'),
	(3, 'hosp3'),
	(4, 'hosp4');

-- Dumping structure for table examen2.Medico
CREATE TABLE IF NOT EXISTS `Medico` (
  `med_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `med_esp_id` int(10) unsigned NOT NULL,
  `med_nombre` varchar(50) NOT NULL,
  PRIMARY KEY (`med_id`),
  KEY `FK_Medico_Especialidades` (`med_esp_id`),
  CONSTRAINT `FK_Medico_Especialidades` FOREIGN KEY (`med_esp_id`) REFERENCES `Especialidades` (`esp_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;

-- Dumping data for table examen2.Medico: ~4 rows (approximately)
INSERT INTO `Medico` (`med_id`, `med_esp_id`, `med_nombre`) VALUES
	(1, 1, 'agustin'),
	(2, 2, 'antonio'),
	(3, 3, 'raul'),
	(4, 4, 'marta');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
