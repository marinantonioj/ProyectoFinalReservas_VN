CREATE TABLE `agencia_viajes`.`hotel` (
  `id_hotel` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `categoria` INT NULL,
  `precio` DOUBLE NULL,
  `disponible` TINYINT(1) NULL,
  PRIMARY KEY (`id_hotel`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_unicode_ci;