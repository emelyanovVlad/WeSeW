CREATE TABLE `entity_status` (
  `id`                        INT(11)           NOT NULL  UNIQUE,
  `value_name`                VARCHAR(100)      NOT NULL  UNIQUE,
  `creation_time`             BIGINT(20)        NOT NULL,
  `update_time`               BIGINT(20)        NULL,
  PRIMARY KEY (`id`)
) DEFAULT CHARSET=utf8;

CREATE TABLE `image` (
  `id`                        VARCHAR(255)      NOT NULL  UNIQUE,
  `title`                     VARCHAR(255)      NULL      DEFAULT '',
  `data`                      BLOB              NOT NULL,
  `creation_time`             BIGINT(20)        NOT NULL,
  `update_time`               BIGINT(20)        NULL,
  `id_entity_status`          INT(11)           NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`id_entity_status`) REFERENCES `entity_status` (`id`)
) DEFAULT CHARSET=utf8;

CREATE TABLE `employee` (
  `id`                        VARCHAR(255)      NOT NULL UNIQUE,
  `name`                      VARCHAR(255)      NOT NULL,
  `surname`                   VARCHAR(255)      NOT NULL,
  `full_name`                 VARCHAR(255)      NOT NULL,
  `cell_number`               VARCHAR(255)      NOT NULL,
  `description`               VARCHAR(255)      NOT NULL,
  `id_avatar`                 VARCHAR(255)      NOT NULL,
  `creation_time`             BIGINT(20)        NOT NULL,
  `update_time`               BIGINT(20)        NULL,
  `id_entity_status`          INT(11)           NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`id_entity_status`) REFERENCES `entity_status` (`id`),
  FOREIGN KEY (`id_avatar`) REFERENCES `image` (`id`)
) DEFAULT CHARSET=utf8;

INSERT INTO entity_status (id, value_name, creation_time, update_time) VALUE (-1, 'ACTIVE', 0, 0);
INSERT INTO entity_status (id, value_name, creation_time, update_time) VALUE (-2, 'DELETED', 0, 0);
INSERT INTO entity_status (id, value_name, creation_time, update_time) VALUE (-3, 'REGISTERED', 0, 0);