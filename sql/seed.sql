CREATE DATABASE rothexample;
USE rothexample;

CREATE TABLE rothexample.person
(
  `id` INTEGER AUTO_INCREMENT NOT NULL PRIMARY KEY,
  `firstName` VARCHAR(255) NOT NULL,
  `lastName` VARCHAR(255) NOT NULL,
  `phone` VARCHAR(255) DEFAULT NULL,
  `email` VARCHAR(255) DEFAULT NULL,
  `active` TINYINT NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into rothexample.person (firstName, lastName, phone, email, active) VALUES ('Jaci S.','Warren','3112548670','jamesbond@nowhere.com',1);
insert into rothexample.person (firstName, lastName, phone, email, active) VALUES ('Suresh','Adduri','8045129444','yo@diggity.com',1);
insert into rothexample.person (firstName, lastName, phone, email, active) VALUES ('Miron','Goldgeil','4177776340','',1);
insert into rothexample.person (firstName, lastName, phone, email, active) VALUES ('Tara K.','Kelly','2134643308','',1);
insert into rothexample.person (firstName, lastName, phone, email, active) VALUES ('Shane','Wethers','','',1);
insert into rothexample.person (firstName, lastName, phone, email, active) VALUES ('Isabel','Monego Borghetti','1234567890','',1);
insert into rothexample.person (firstName, lastName, phone, email, active) VALUES ('John','McCauley','','',1);
insert into rothexample.person (firstName, lastName, phone, email, active) VALUES ('Allen','Laychak','3234693777','',1);
insert into rothexample.person (firstName, lastName, phone, email, active) VALUES ('Julia','Cunningham','8183390148','fdfsd@fdsfd.com',0);
insert into rothexample.person (firstName, lastName, phone, email, active) VALUES ('Keith','Bernstein','','',1);
insert into rothexample.person (firstName, lastName, phone, email, active) VALUES ('Sara','Hickey','3033697622','',1);
insert into rothexample.person (firstName, lastName, phone, email, active) VALUES ('Regina','Woods','3102287382','fdsafds@fdsa.com',0);

