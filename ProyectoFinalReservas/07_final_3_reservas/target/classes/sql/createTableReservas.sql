CREATE TABLE `agencia_viajes`.`reservas` (
  `id_reserva` INT NOT NULL AUTO_INCREMENT,
  `nombre_cliente` VARCHAR(45) NULL,
  `dni` VARCHAR(45) NULL,
  `id_hotel` INT NULL,
  `id_vuelo` INT NULL,
  PRIMARY KEY (`id_reserva`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_unicode_ci;