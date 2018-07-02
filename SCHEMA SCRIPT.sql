-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Tablespace`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Tablespace` (
  `idTablespace` INT NOT NULL,
  `MaximumSize` VARCHAR(45) NULL,
  `Size` VARCHAR(45) NULL,
  `Name` VARCHAR(45) NULL,
  `Type` VARCHAR(45) NULL,
  `Autoextend` VARCHAR(45) NULL,
  `FreeSpace` VARCHAR(45) NULL,
  PRIMARY KEY (`idTablespace`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Privilege`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Privilege` (
  `idPrivilege` INT NOT NULL,
  `Privilege` VARCHAR(45) NULL,
  `Name` VARCHAR(45) NULL,
  `Property` VARCHAR(45) NULL,
  PRIMARY KEY (`idPrivilege`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`User`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`User` (
  `idUser` INT NOT NULL,
  `Name` VARCHAR(45) NULL,
  `ExpirationDate` VARCHAR(45) NULL,
  `CreationDate` VARCHAR(45) NULL,
  `Common` VARCHAR(45) NULL,
  `AccountStatus` VARCHAR(45) NULL,
  `Profile` VARCHAR(45) NULL,
  PRIMARY KEY (`idUser`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Datafile`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Datafile` (
  `idDatafile` INT NOT NULL,
  `FreeSpace` VARCHAR(45) NULL,
  `Autoextend` VARCHAR(45) NULL,
  `Name` VARCHAR(45) NULL,
  `Type` VARCHAR(45) NULL,
  `MaximumSize` VARCHAR(45) NULL,
  `Size` VARCHAR(45) NULL,
  `Tablespace_idTablespace` INT NOT NULL,
  PRIMARY KEY (`idDatafile`),
  INDEX `fk_Datafile_Tablespace_idx` (`Tablespace_idTablespace` ASC),
  CONSTRAINT `fk_Datafile_Tablespace`
    FOREIGN KEY (`Tablespace_idTablespace`)
    REFERENCES `mydb`.`Tablespace` (`idTablespace`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Session`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Session` (
  `idSession` INT NOT NULL,
  `RESOURCE_CONSUMER_GROUP` VARCHAR(45) NULL,
  `Command` VARCHAR(45) NULL,
  `Module` VARCHAR(45) NULL,
  `Action` VARCHAR(45) NULL,
  `Machine` VARCHAR(45) NULL,
  `OSUser` VARCHAR(45) NULL,
  `Status` VARCHAR(45) NULL,
  `SQL_ID` VARCHAR(45) NULL,
  `SQL_CHILD_NUMBER` VARCHAR(45) NULL,
  `INSTID` VARCHAR(45) NULL,
  `Serial` VARCHAR(45) NULL,
  `CLIENT_INFO` VARCHAR(45) NULL,
  `SID` VARCHAR(45) NULL,
  `SECS_IN_WAIT` VARCHAR(45) NULL,
  `User_idUser` INT NOT NULL,
  PRIMARY KEY (`idSession`),
  INDEX `fk_Session_User1_idx` (`User_idUser` ASC),
  CONSTRAINT `fk_Session_User1`
    FOREIGN KEY (`User_idUser`)
    REFERENCES `mydb`.`User` (`idUser`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Role`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Role` (
  `idRole` INT NOT NULL,
  `Implicit` VARCHAR(45) NULL,
  `Role` VARCHAR(45) NULL,
  `Inherited` VARCHAR(45) NULL,
  `PASSWORD_REQUIRED` VARCHAR(45) NULL,
  `Common` VARCHAR(45) NULL,
  `ORACLE_MAINTAINED` VARCHAR(45) NULL,
  `AUTHENTICATION_TYPE` VARCHAR(45) NULL,
  PRIMARY KEY (`idRole`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`CPU`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`CPU` (
  `idCPU` INT NOT NULL,
  `DBID` VARCHAR(45) NULL,
  `CPU_CORE_COUNT` VARCHAR(45) NULL,
  `CPU_COUNT` VARCHAR(45) NULL,
  `TimeStamp` VARCHAR(45) NULL,
  `Version` VARCHAR(45) NULL,
  `CPU_SOCKET_COUNT` VARCHAR(45) NULL,
  PRIMARY KEY (`idCPU`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Memory`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Memory` (
  `idMemory` INT NOT NULL,
  `Statistic` VARCHAR(45) NULL,
  `SGAPool` VARCHAR(45) NULL,
  `Bytes` VARCHAR(45) NULL,
  PRIMARY KEY (`idMemory`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Tablespace_has_User`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Tablespace_has_User` (
  `Tablespace_idTablespace` INT NOT NULL,
  `User_idUser` INT NOT NULL,
  PRIMARY KEY (`Tablespace_idTablespace`, `User_idUser`),
  INDEX `fk_Tablespace_has_User_User1_idx` (`User_idUser` ASC),
  INDEX `fk_Tablespace_has_User_Tablespace1_idx` (`Tablespace_idTablespace` ASC),
  CONSTRAINT `fk_Tablespace_has_User_Tablespace1`
    FOREIGN KEY (`Tablespace_idTablespace`)
    REFERENCES `mydb`.`Tablespace` (`idTablespace`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Tablespace_has_User_User1`
    FOREIGN KEY (`User_idUser`)
    REFERENCES `mydb`.`User` (`idUser`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Privilege_has_User`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Privilege_has_User` (
  `Privilege_idPrivilege` INT NOT NULL,
  `User_idUser` INT NOT NULL,
  PRIMARY KEY (`Privilege_idPrivilege`, `User_idUser`),
  INDEX `fk_Privilege_has_User_User1_idx` (`User_idUser` ASC),
  INDEX `fk_Privilege_has_User_Privilege1_idx` (`Privilege_idPrivilege` ASC),
  CONSTRAINT `fk_Privilege_has_User_Privilege1`
    FOREIGN KEY (`Privilege_idPrivilege`)
    REFERENCES `mydb`.`Privilege` (`idPrivilege`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Privilege_has_User_User1`
    FOREIGN KEY (`User_idUser`)
    REFERENCES `mydb`.`User` (`idUser`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Privilege_has_Role`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Privilege_has_Role` (
  `Privilege_idPrivilege` INT NOT NULL,
  `Role_idRole` INT NOT NULL,
  PRIMARY KEY (`Privilege_idPrivilege`, `Role_idRole`),
  INDEX `fk_Privilege_has_Role_Role1_idx` (`Role_idRole` ASC),
  INDEX `fk_Privilege_has_Role_Privilege1_idx` (`Privilege_idPrivilege` ASC),
  CONSTRAINT `fk_Privilege_has_Role_Privilege1`
    FOREIGN KEY (`Privilege_idPrivilege`)
    REFERENCES `mydb`.`Privilege` (`idPrivilege`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Privilege_has_Role_Role1`
    FOREIGN KEY (`Role_idRole`)
    REFERENCES `mydb`.`Role` (`idRole`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`User_has_Role`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`User_has_Role` (
  `User_idUser` INT NOT NULL,
  `Role_idRole` INT NOT NULL,
  PRIMARY KEY (`User_idUser`, `Role_idRole`),
  INDEX `fk_User_has_Role_Role1_idx` (`Role_idRole` ASC),
  INDEX `fk_User_has_Role_User1_idx` (`User_idUser` ASC),
  CONSTRAINT `fk_User_has_Role_User1`
    FOREIGN KEY (`User_idUser`)
    REFERENCES `mydb`.`User` (`idUser`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_User_has_Role_Role1`
    FOREIGN KEY (`Role_idRole`)
    REFERENCES `mydb`.`Role` (`idRole`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
