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
CREATE TABLE IF NOT EXISTS `planner`.`administrateur` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nom` VARCHAR(20) NOT NULL,
  `prenom` VARCHAR(20) NOT NULL,
  `email` VARCHAR(255) NOT NULL,
  `password` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci;

-- -----------------------------------------------------
-- Table `planner`.`Utilisateur`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `planner`.`utilisateurs` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nom` VARCHAR(20) NOT NULL,
  `prenom` VARCHAR(20) NOT NULL,
  `email` VARCHAR(255) NOT NULL,
  `telephone` VARCHAR(10),
  `password` VARCHAR(20) NOT NULL,
  `bio` LONGTEXT,
  `photo` VARCHAR(20),
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci;

-- -----------------------------------------------------
-- Table `planner`.`Evenement`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `planner`.`evenements` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nom` VARCHAR(45) NOT NULL,
  `lieux` VARCHAR(45) NOT NULL,
  `debut` DATE NOT NULL,
  `fin` date NOT NULL,
  `description` LONGTEXT,
  `photoEvent` VARCHAR(20),
  `categorie` VARCHAR(50) NOT NULL,
  `public` BOOLEAN NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci;

-- -----------------------------------------------------
-- Table `planner`.`ToDo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `planner`.`ToDo` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nom` VARCHAR(45) NULL,
  `date` VARCHAR(45) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX id_UNIQUE (`id` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci;

-- -----------------------------------------------------
-- Table `planner`.`Organisateur`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `planner`.`organisateurs` (
  `id` INT NOT NULL,
  `id` INT NOT NULL,
  PRIMARY KEY (`id`, `id`),
  FOREIGN KEY (`id`) REFERENCES projetsession.utilisateurs (`id`),
  FOREIGN KEY (`id`) REFERENCES projetsession.evenements (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci;

-- -----------------------------------------------------
-- Table `planner`.`Participant`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `planner`.`participants` (
  `id` INT NOT NULL,
  `id` INT NOT NULL,
  PRIMARY KEY (`id`, `id`),
  FOREIGN KEY (`id`) REFERENCES projetsession.utilisateurs (`id`),
  FOREIGN KEY (`id`) REFERENCES projetsession.evenements (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci;



SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
