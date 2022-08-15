create database indigitalxp;

use indigitalxp;

CREATE TABLE customer (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `lastname` varchar(30) NOT NULL,
  `email` varchar(20) NOT NULL,
  `dni` CHAR(8) NOT NULL,
  `birthdate` date DEFAULT NULL,
  `createdate` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  `updatedate` TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (id)
); 

insert into customer (name, lastname, email, dni, birthdate) values ('Gustavo', 'Quispe', 'yako@gmail.com', '12345678', '1999-7-20');