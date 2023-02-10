CREATE TABLE `users` (
`id` INT NOT NULL auto_increment,
`username` VARCHAR(45) NOT NULL,
`password` VARCHAR(45) NOT NULL,
`enabled` INT NOT NULL,
PRIMARY KEY (`id`)
);

CREATE TABLE `authorities` (
`id` int NOT NULL AUTO_INCREMENT,
`username` varchar(45) NOT NULL,
`authority` varchar(45) NOT NULL,
PRIMARY KEY (`id`));

INSERT IGNORE INTO `users` VALUES(NULL, 'happy', '12345', '1');
INSERT IGNORE INTO `authorities` VALUES(NULL, 'happy', 'write');

CREATE TABLE `customer` (
`id` int NOT NULL auto_increment,
`email` varchar(45),
`pwd` varchar(200) NOT NULL,
`role` varchar(45) NOT NULL,
PRIMARY KEY (`id`));

INSERT INTO `customer` (`email`, `pwd`, `role`)
VALUES ('JOHNDOE@EXAMPLE.COM', '12345', 'admin');