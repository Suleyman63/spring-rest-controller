DROP TABLE IF EXISTS todo;
CREATE TABLE `todo`
(
    `id`       int(11) NOT NULL AUTO_INCREMENT,
    `deadline` date         DEFAULT NULL,
    `state`    varchar(255) DEFAULT NULL,
    `description`     varchar(255) DEFAULT NULL,
    `task`    varchar(255) DEFAULT NULL,
    PRIMARY KEY (`id`)
);

--
-- Daten für Tabelle `todo`
--

INSERT INTO `todo` (`deadline`,  `state`, `description`, `task`)
VALUES ( '2021-07-01',  'NEW', 'Nudeln', 'einkauf'),
       ( '2021-07-07',  'IN_PROGRESS', 'Eier', 'einkaufen'),
       ( '2021-07-01',  'DONE', 'laufen', 'sport'),
       ( '2021-07-09',  'NEW', 'an den See fahren', 'baden');
COMMIT;
