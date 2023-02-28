SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema planner
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema planner
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `planner` DEFAULT CHARACTER SET utf8 ;
USE `planner` ;
ALTER DATABASE `planner` CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

-- -----------------------------------------------------
-- Table `planner`.`Utilisateur`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `planner`.`Utilisateur` (
  `idUser` INT NOT NULL,
  `nom` VARCHAR(16) NOT NULL,
  `prenom` VARCHAR(16) NOT NULL,
  `password` VARCHAR(32) NOT NULL,
  `email` VARCHAR(255) NULL,
  `photoProfil` VARCHAR(10) NULL,
  
  PRIMARY KEY (`idUser`),
  UNIQUE INDEX `idUser_UNIQUE` (`idUser` ASC) );


-- -----------------------------------------------------
-- Table `planner`.`Evenement`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `planner`.`Evenement` (
  `idEvent` INT NOT NULL,
  `nomEvent` VARCHAR(45) NULL,
  `lieu` VARCHAR(45) NULL,
  `heureDebut` VARCHAR(45) NULL,
  `heureFin` VARCHAR(45) NULL,
  `dateDebut` VARCHAR(45) NULL,
  `dateFin` VARCHAR(45) NULL,
  `description` LONGTEXT NULL,
  PRIMARY KEY (`idEvent`),

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

use mydb;
insert into utilisateur values (0,"admi","nistrateur","admin@server.com","5145555555","password");
