-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema planner
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS 'planner' DEFAULT CHARACTER SET utf8mb4 ;
USE 'planner' ;

-- -----------------------------------------------------
-- Table 'planner'.'utilisateur'
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS 'planner'.'utilisateurs' (
  'id' INT NOT NULL AUTO_INCREMENT,
  'nom' VARCHAR(65) NOT NULL,
  'prenom' VARCHAR(65) NOT NULL,
  'email' VARCHAR(255) NOT NULL,
  'telephone' VARCHAR(65),
  'password' VARCHAR(65) NOT NULL,
  'bio' LONGTEXT,
  'photo' VARCHAR(255),
  PRIMARY KEY ('id'),
  UNIQUE INDEX 'id_UNIQUE' ('id' ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4 ;

-- -----------------------------------------------------
-- Table 'planner'.'evenement'
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `planner`.`evenements` (
`id` INT NOT NULL auto_increment,
  `idUser` INT NOT NULL,
  `nom` VARCHAR(65) NOT NULL,
  `lieux` VARCHAR(65) NOT NULL,
  `debut` DATE NOT NULL,
  `fin` DATE NOT NULL,
  `description` LONGTEXT,
  `photoEvent` VARCHAR(65),
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4 ;

-- -----------------------------------------------------
-- Table 'planner'.'todo'
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS 'planner'.'todo' (
  'id' INT NOT NULL AUTO_INCREMENT,
  'tache' VARCHAR(255) NOT NULL,
  'fait' BOOLEAN,
  PRIMARY KEY ('id'),
  UNIQUE INDEX 'id_UNIQUE' ('id' ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4 ;



SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;