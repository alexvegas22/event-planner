SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE=ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION;

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema projetsession
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS projetsession DEFAULT CHARACTER SET utf8mb4 COLLATE = utf8mb4_unicode_ci ;
USE projetsession ;

-- -----------------------------------------------------
-- Table projetsession.utilisateurs
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS projetsession.utilisateurs (
  id INT NOT NULL AUTO_INCREMENT,
  email VARCHAR(150) NOT NULL,
  nom VARCHAR(25) NOT NULL,
  password VARCHAR(25) NOT NULL,
  photo VARCHAR(150) NULL,
  prenom VARCHAR(25) NOT NULL,
  PRIMARY KEY (id),
  UNIQUE INDEX id_UNIQUE (id ASC) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table projetsession.evenements
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS projetsession.evenements (
  id INT NOT NULL AUTO_INCREMENT,
  nom VARCHAR(50) NOT NULL,
  lieux VARCHAR(100) NOT NULL,
  debut date NOT NULL,
  fin date NOT NULL,
  description LONGTEXT NULL,
  PRIMARY KEY (id),
  UNIQUE INDEX id_UNIQUE (id ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci;

-- -----------------------------------------------------
-- Table projetsession.utilisateurs_evenements
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS projetsession.utilisateurs_evenements (
  id INT NOT NULL,
  id INT NOT NULL,
  PRIMARY KEY (id, id),
  FOREIGN KEY (id) REFERENCES projetsession.utilisateurs (id),
  FOREIGN KEY (id) REFERENCES projetsession.evenements (id))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

INSERT INTO projetsession.utilisateurs
(id, email, nom, prenom, password, photoProfil)
VALUES
(1,'aimen@gmail.com','aimen','essaie','aimen123','essaie.png'),
(2,'alex@gmail.com','alex','exemple','alex123','exemple.png'),
(3,'mely@gmail.com','mely','test','melyse123','test.png');




INSERT INTO projetsession.evenements
(id, nom, lieux, debut, fin, description)
VALUES
(1,'feteAimen', 'Montreal','2023-10-18 07:59:14','2023-10-18 20:00:14','La fête de Aimen'),
(2,'MariageLola', 'Laval','2023-06-18 11:00:00','2023-06-18 22:00:00','Le mariage de Lola'),
(3,'GraduationImed', 'Longueil','2023-06-20 12:59:14','2023-06-21 00:00:00','La graduation de Imed');


INSERT INTO projetsession.utilisateurs_evenements VALUES (1,1),(2,1),(3,2);
