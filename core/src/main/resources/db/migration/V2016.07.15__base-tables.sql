CREATE TABLE `user_role` (
  `id_user_role`              INT(11)           NOT NULL  UNIQUE,
  `value_name`                VARCHAR(50)       NOT NULL  UNIQUE,
  `creation_time`             BIGINT(20)        NOT NULL,
  `update_time`               BIGINT(20)        NULL,
  PRIMARY KEY (`id_user_role`)
) DEFAULT CHARSET=utf8;

CREATE TABLE `entity_status` (
  `id_entity_status`          INT(11)           NOT NULL  UNIQUE,
  `value_name`                VARCHAR(100)      NOT NULL  UNIQUE,
  `creation_time`             BIGINT(20)        NOT NULL,
  `update_time`               BIGINT(20)        NULL,
  PRIMARY KEY (`id_entity_status`)
) DEFAULT CHARSET=utf8;

CREATE TABLE `country` (
  `id_country`                INT(11)           NOT NULL  UNIQUE,
  `title`                     VARCHAR(100)      NOT NULL  UNIQUE,
  `abr`                       VARCHAR(10)       NOT NULL  UNIQUE,
  `logo_path`                 VARCHAR(255)      NOT NULL,
  `creation_time`             BIGINT(20)        NOT NULL,
  `update_time`               BIGINT(20)        NULL,
  PRIMARY KEY (`id_country`)
) DEFAULT CHARSET=utf8;

CREATE TABLE `address` (
  `id_address`                BIGINT(20)        NOT NULL  UNIQUE,
  `address`                   VARCHAR(255)      NOT NULL,
  `id_country`                INT(11)           NOT NULL,
  PRIMARY KEY (`id_address`),
  FOREIGN KEY (`id_country`)  REFERENCES        country         (`id_country`)
) DEFAULT CHARSET=utf8;

CREATE TABLE `site_user` (
  `id_site_user`              VARCHAR(100)      NOT NULL,
  `email`                     VARCHAR(255)      NOT NULL  UNIQUE,
  `password`                  VARCHAR(255)      NOT NULL,
  `first_name`                VARCHAR(255)      NOT NULL,
  `last_name`                 VARCHAR(255)      NOT NULL,
  `birth_date`                BIGINT(20)        NULL,
  `last_login`                BIGINT(20)        NULL,
  `cell_number`               VARCHAR(40)       NULL,
  `gender`                    TINYINT(1)        NULL,
  `creation_time`             BIGINT(20)        NOT NULL,
  `update_time`               BIGINT(20)        NULL,
  `id_address`                BIGINT(20)        NULL,
  `id_user_role`              INT(11)           NOT NULL,
  `id_status`                 INT(11)           NOT NULL,
  PRIMARY KEY (`id_site_user`),
  FOREIGN KEY (`id_address`)  REFERENCES        address         (`id_address`),
  FOREIGN KEY (`id_user_role`) REFERENCES       user_role       (`id_user_role`),
  FOREIGN KEY (`id_status`)   REFERENCES        entity_status   (`id_entity_status`)
) DEFAULT CHARSET=utf8;

INSERT INTO user_role (id_user_role, value_name, creation_time, update_time) VALUE (-100, 'ROLE_CLIENT', 0 , 0);
INSERT INTO user_role (id_user_role, value_name, creation_time, update_time) VALUE (-200, 'ROLE_ADMIN', 0 , 0);
INSERT INTO user_role (id_user_role, value_name, creation_time, update_time) VALUE (-999, 'ROLE_HEADADMIN', 0 , 0);

INSERT INTO entity_status (id_entity_status, value_name, creation_time, update_time) VALUE (-1, 'ACTIVE', 0, 0);
INSERT INTO entity_status (id_entity_status, value_name, creation_time, update_time) VALUE (-2, 'DELETED', 0, 0);
INSERT INTO entity_status (id_entity_status, value_name, creation_time, update_time) VALUE (-3, 'REGISTERED', 0, 0);