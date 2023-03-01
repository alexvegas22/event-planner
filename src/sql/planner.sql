SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema planner
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS 'planner' DEFAULT CHARACTER SET utf8 ;
USE 'planner' ;
ALTER DATABASE 'planner' CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

-- -----------------------------------------------------
-- Table 'planner'.'Utilisateur'
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS 'planner'.'Utilisateur' (
  'idUser' INT NOT NULL AUTO_INCREMENT,
  'nom' VARCHAR(25) NOT NULL,
  'prenom' VARCHAR(25) NOT NULL,
  'password' VARCHAR(25) NOT NULL,
  'email' VARCHAR(150) NOT NULL,
  'photoProfil' VARCHAR(150) NULL,
  PRIMARY KEY ('idUser'),
  UNIQUE INDEX 'idUser_UNIQUE' ('idUser' ASC) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table 'planner'.'Evenement'
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS 'planner'.'Evenement' (
  'idEvent' INT NOT NULL AUTO_INCREMENT,
  'nomEvent' VARCHAR(50) NOT NULL,
  'lieu' VARCHAR(100) NOT NULL,
  'heureDebut' VARCHAR(5) NOT NULL,
  'heureFin' VARCHAR(5) NOT NULL,
  'dateDebut' DATE NULL,
  'dateFin' DATE NOT NULL,
  'description' LONGTEXT NULL,
  PRIMARY KEY ('idEvent'),
  UNIQUE INDEX 'idEvent_UNIQUE' ('idEvent' ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci;

-- -----------------------------------------------------
-- Table 'planner'.'utilisateurs_evenement'
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS 'planner'.'utilisateurs_evenements' (
  'idUser' INT NOT NULL,
  'idEvent' INT NOT NULL,
  PRIMARY KEY ('idUser', 'idEvent'),
  FOREIGN KEY ('idUser') REFERENCES 'planner'.'utilisateurs' ('idUser'),
  FOREIGN KEY ('idEvent') REFERENCES 'planner'.'evenements' ('idEvent'))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

INSERT INTO 'projetsession'.'utilisateurs'
('idUser', 'nom', 'prenom', 'password', 'email', 'photoProfil')
VALUES
(1,'aimen@gmail.com','aimen','essaie','aimen123','essaie.png'),
(2,'alex@gmail.com','alex','exemple','alex123','exemple.png'),
(3,'mely@gmail.com','mely','test','melyse123','test.png');




INSERT INTO 'projetsession'.'evenements'
('idEvent', 'nomEvent', 'lieux', 'heureDebut', 'heureFin', 'dateDebut', 'dateFin', 'description')
VALUES
(1,'feteAimen', 'Montreal','2023-10-18 07:59:14','2023-10-18 20:00:14','La fête de Aimen'),
(2,'MariageLola', 'Laval','2023-06-18 11:00:00','2023-06-18 22:00:00','Le mariage de Lola'),
(3,'GraduationImed', 'Longueil','2023-06-20 12:59:14','2023-06-21 00:00:00','La graduation de Imed');


INSERT INTO 'projetsession'. 'utilisateurs_evenement' VALUES (1,1),(2,1),(3,2);
