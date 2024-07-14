-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema EduDB
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema EduDB
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `EduDB` DEFAULT CHARACTER SET utf8mb4 ;
USE `EduDB` ;

-- -----------------------------------------------------
-- Table `EduDB`.`STUDENTS`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `EduDB`.`STUDENTS` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `FIRSTNAME` VARCHAR(45) NOT NULL,
  `LASTNAME` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`ID`),
  INDEX `LASTNAME_IDX` (`LASTNAME` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `EduDB`.`TEACHERS`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `EduDB`.`TEACHERS` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `FIRSTNAME` VARCHAR(45) NOT NULL,
  `LASTNAME` VARCHAR(45) NOT NULL,
  INDEX `LASTNAME_IDX` (`LASTNAME` ASC) VISIBLE,
  PRIMARY KEY (`ID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `EduDB`.`TEACHERS_STUDENTS`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `EduDB`.`TEACHERS_STUDENTS` (
  `TEACHER_ID` INT NOT NULL,
  `STUDENT_ID` INT NOT NULL,
  PRIMARY KEY (`TEACHER_ID`, `STUDENT_ID`),
  INDEX `STUDENT_ID_FK_idx` (`STUDENT_ID` ASC) INVISIBLE,
  INDEX `TEACHER_ID_FK_IDX` (`TEACHER_ID` ASC) VISIBLE,
  CONSTRAINT `TEACHER_ID_FK`
    FOREIGN KEY (`TEACHER_ID`)
    REFERENCES `EduDB`.`TEACHERS` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `STUDENT_ID_FK`
    FOREIGN KEY (`STUDENT_ID`)
    REFERENCES `EduDB`.`STUDENTS` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE USER 'Kanellos' IDENTIFIED BY 'Kanellos!1312';

GRANT ALL ON `EduDB`.* TO 'Kanellos';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
