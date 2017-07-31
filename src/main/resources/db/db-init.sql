SET FOREIGN_KEY_CHECKS = 0;
SET @OLD_SQL_MODE = @@SQL_MODE, SQL_MODE = 'TRADITIONAL,ALLOW_INVALID_DATES';
/*!40101 SET NAMES utf8 */;
/*!40103 SET TIME_ZONE = '+00:00' */;

-- -----------------------------------------------------
-- Schema facultative
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `facultativeSpring`;

-- -----------------------------------------------------
-- Schema facultative
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `facultativeSpring`
  CHARACTER SET utf8mb4
  COLLATE utf8mb4_unicode_ci;
-- -----------------------------------------------------
-- Schema new_schema1
-- -----------------------------------------------------
USE `facultativeSpring`;
SET FOREIGN_KEY_CHECKS = 1;
-- -----------------------------------------------------
-- Table `facultative`.`course`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `facultativeSpring`.`courses` (
  `id`          INT         NOT NULL AUTO_INCREMENT,
  `title`       VARCHAR(45) NOT NULL,
  `description` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`)
)

-- -----------------------------------------------------
-- Table `facultative`.`users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `facultativeSpring`.`users` (
  `id`       INT             NOT NULL AUTO_INCREMENT,
  `name`     VARCHAR(20)     NOT NULL,
  `email`    VARCHAR(45)     NULL,
  `password` VARCHAR(20)     NOT NULL,
  `male`     ENUM ('m', 'w') NOT NULL DEFAULT 'm',
  PRIMARY KEY (`id`),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC)
)
  ENGINE = InnoDB;
