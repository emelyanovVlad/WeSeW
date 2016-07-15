CREATE TABLE `user_role` (
  `id_user_role`    INT         NOT NULL UNIQUE,
  `value_name`      VARCHAR(50) NOT NULL UNIQUE,
  `creation_time` BIGINT NOT NULL,
  `update_time` BIGINT NULL,
  PRIMARY KEY (`id_user_role`)
);

CREATE TABLE `entity_status` (
  `id_entity_status` INT NOT NULL UNIQUE,
  `value_name` VARCHAR(100) NOT NULL UNIQUE,
  `creation_time` BIGINT NOT NULL,
  `update_time` BIGINT NULL,
  PRIMARY KEY (`id_entity_status`)
);

CREATE TABLE `country` (
  `id_country` INT NOT NULL UNIQUE,
  `title` VARCHAR(100) NOT NULL UNIQUE,
  `abr` VARCHAR(10) NOT NULL UNIQUE,
  `logo_path` VARCHAR(255) NOT NULL,
  `creation_time` BIGINT NOT NULL,
  `update_time` BIGINT NULL,
  PRIMARY KEY (`id_country`)
);

CREATE TABLE `address` (
  `id_address` BIGINT NOT NULL UNIQUE,
  `address` VARCHAR(255) NOT NULL,
  `id_country` INT NOT NULL,
  PRIMARY KEY (`id_address`),
  FOREIGN KEY (`id_country`) REFERENCES country (`id_country`)
);

CREATE TABLE `site_user` (
  `id_site_user`   VARCHAR(100) NOT NULL,
  `email` VARCHAR(255) NOT NULL UNIQUE,
  `password` VARCHAR(255) NOT NULL,
  `first_name` VARCHAR(255) NOT NULL,
  `last_name` VARCHAR(255) NOT NULL,
  `birth_date` BIGINT NULL,
  `last_login` BIGINT NULL,
  `cell_number` VARCHAR(40) NULL,
  `gender` TINYINT(1) NULL,
  `creation_time` BIGINT NOT NULL,
  `update_time` BIGINT NULL,
  `id_address` BIGINT NULL,
  `id_user_role` INT NOT NULL,
  `id_status` INT NOT NULL,
  PRIMARY KEY (`id_site_user`),
  FOREIGN KEY (`id_address`) REFERENCES address (`id_address`),
  FOREIGN KEY (`id_user_role`) REFERENCES user_role (`id_user_role`),
  FOREIGN KEY (`id_status`) REFERENCES entity_status (`id_address`),
);