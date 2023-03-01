SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
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
  `idUser` INT NOT NULL AUTO_INCREMENT,
  `nom` VARCHAR(25) NOT NULL,
  `prenom` VARCHAR(25) NOT NULL,
  `password` VARCHAR(25) NOT NULL,
  `email` VARCHAR(150) NOT NULL,
  `photoProfil` VARCHAR(150) NULL,
  PRIMARY KEY (`idUser`),
  UNIQUE INDEX `idUser_UNIQUE` (`idUser` ASC) )
DEFAULT CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `planner`.`Evenement`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `planner`.`Evenement` (
  `idEvent` INT NOT NULL AUTO_INCREMENT,
  `nomEvent` VARCHAR(50) NOT NULL,
  `lieu` VARCHAR(100) NOT NULL,
  `heureDebut` VARCHAR(5) NOT NULL,
  `heureFin` VARCHAR(5) NOT NULL,
  `dateDebut` DATE NULL,
  `dateFin` DATE NOT NULL,
  `description` LONGTEXT NULL,
  PRIMARY KEY (`idEvent`),
  UNIQUE INDEX `idEvent_UNIQUE` (`idEvent` ASC))
DEFAULT CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci;

-- -----------------------------------------------------
-- Table `planner`.`utilisateurs_evenement`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `planner`.`utilisateurs_evenements` (
  `idUser` INT NOT NULL,
  `idEvent` INT NOT NULL,
  PRIMARY KEY (`idUser`, `idEvent`),
  FOREIGN KEY (`idUser`) REFERENCES `planner`.`utilisateurs` (`idUser`),
  FOREIGN KEY (`idEvent`) REFERENCES `planner`.`evenements` (`idEvent`))
DEFAULT CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
