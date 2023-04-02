-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE=`ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION`;

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema planner
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `planner` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `planner` ;

-- -----------------------------------------------------
-- Table `planner`.`Administrateur`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `planner`.`Administrateur` (
  `idAdmin` INT NOT NULL AUTO_INCREMENT,
  `nomAdmin` VARCHAR(20) NOT NULL,
  `prenomAdmin` VARCHAR(20) NOT NULL,
  `emailAdmin` VARCHAR(255) NOT NULL,
  `passwordAdmin` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`idAdmin`),
  UNIQUE INDEX `idAdmin_UNIQUE` (`idAdmin` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci;

-- -----------------------------------------------------
-- Table `planner`.`Utilisateur`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `planner`.`Utilisateur` (
  `idUser` INT NOT NULL AUTO_INCREMENT,
  `nomUser` VARCHAR(20) NOT NULL,
  `prenomUser` VARCHAR(20) NOT NULL,
  `email` VARCHAR(255) NOT NULL,
  `telephone` VARCHAR(10),
  `password` VARCHAR(20) NOT NULL,
  `bio` LONGTEXT,
  `photoProfil` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`idUser`),
  UNIQUE INDEX `idUser_UNIQUE` (`idUser` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci;

-- -----------------------------------------------------
-- Table `planner`.`Organisateur`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `planner`.`Organisateur` (
  `idUser` INT NOT NULL,
  `idEvent` INT NOT NULL,
  PRIMARY KEY (`idUser`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci;

-- -----------------------------------------------------
-- Table `planner`.`Participant`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `planner`.`Participant` (
  `idUser` INT NOT NULL,
  `idEvent` INT NOT NULL,
  PRIMARY KEY (`idUser`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci;

-- -----------------------------------------------------
-- Table `planner`.`Evenement`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `planner`.`Evenement` (
  `idEvent` INT NOT NULL AUTO_INCREMENT,
  `nomEvent` VARCHAR(45) NOT NULL,
  `lieu` VARCHAR(45) NOT NULL,
  `debut` VARCHAR(45) NOT NULL,
  `fin` VARCHAR(45) NOT NULL,
  `description` LONGTEXT,
  `photoEvent` VARCHAR(20),
  `categorie` VARCHAR(20) NOT NULL,
  `visibilite` VARCHAR(20) NOT NULL,
  `idVisibilite` INT NOT NULL,
  PRIMARY KEY (`idEvent`),
  UNIQUE INDEX `idEvent_UNIQUE` (`idEvent` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci;
  
-- -----------------------------------------------------
-- Table `planner`.`Public`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `planner`.`Public` (
  `idVisibilite` INT NOT NULL,
  PRIMARY KEY (`idVisibilite`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci;

-- -----------------------------------------------------
-- Table `planner`.`Prive`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `planner`.`Prive` (
  `idVisibilite` INT NOT NULL,
  PRIMARY KEY (`idVisibilite`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci;

-- -----------------------------------------------------
-- Table `planner`.`ToDo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `planner`.`ToDo` (
  `idTodo` INT NOT NULL AUTO_INCREMENT,
  `nomTodo` VARCHAR(45) NULL,
  `date` VARCHAR(45) NULL,
  PRIMARY KEY (`idTodo`),
  UNIQUE INDEX idTodo_UNIQUE (idTodo ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
