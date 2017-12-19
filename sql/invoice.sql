DROP TABLE IF EXISTS rothexample.invoice;

CREATE TABLE rothexample.invoice (
    `id` INTEGER AUTO_INCREMENT NOT NULL PRIMARY KEY,
    `invoiceNumber` VARCHAR(255) NOT NULL UNIQUE,
    `totalAmount` DECIMAL(10 , 2 ) NOT NULL,
    `paid` TINYINT NOT NULL DEFAULT 0,
    `personId` INTEGER NOT NULL,
    FOREIGN KEY (personId)
        REFERENCES person (id)
)  ENGINE=INNODB DEFAULT CHARSET=UTF8;

insert into rothexample.invoice (invoiceNumber, totalAmount, paid, personId) values ('34553', 55, 1, 1);
insert into rothexample.invoice (invoiceNumber, totalAmount, paid, personId) values ('85643', 85, 1, 1);
insert into rothexample.invoice (invoiceNumber, totalAmount, personId) values ('45647', 120, 1);

insert into rothexample.invoice (invoiceNumber, totalAmount, paid, personId) values ('56885', 150, 1, 2);
insert into rothexample.invoice (invoiceNumber, totalAmount, paid, personId) values ('12523', 25, 1, 2);

insert into rothexample.invoice (invoiceNumber, totalAmount, paid, personId) values ('23475', 250, 1, 3);
insert into rothexample.invoice (invoiceNumber, totalAmount, paid, personId) values ('97634', 300, 1, 3);
insert into rothexample.invoice (invoiceNumber, totalAmount, paid, personId) values ('87213', 50, 1, 3);
insert into rothexample.invoice (invoiceNumber, totalAmount, paid, personId) values ('12341', 85, 1, 3);

insert into rothexample.invoice (invoiceNumber, totalAmount, personId) values ('78678', 220, 4);
insert into rothexample.invoice (invoiceNumber, totalAmount, personId) values ('78966', 100, 4);
insert into rothexample.invoice (invoiceNumber, totalAmount, personId) values ('90980', 40, 4);

insert into rothexample.invoice (invoiceNumber, totalAmount, paid, personId) values ('90092', 135, 1, 5);
insert into rothexample.invoice (invoiceNumber, totalAmount, paid, personId) values ('52232', 135, 1, 5);

insert into rothexample.invoice (invoiceNumber, totalAmount, personId) values ('12900', 400, 6);

insert into rothexample.invoice (invoiceNumber, totalAmount, paid, personId) values ('23665', 150, 1, 7);
insert into rothexample.invoice (invoiceNumber, totalAmount, paid, personId) values ('90034', 340, 1, 7);
insert into rothexample.invoice (invoiceNumber, totalAmount, paid, personId) values ('85789', 250, 1, 7);
insert into rothexample.invoice (invoiceNumber, totalAmount, paid, personId) values ('12588', 185, 1, 7);

insert into rothexample.invoice (invoiceNumber, totalAmount, personId) values ('17992', 400, 8);
insert into rothexample.invoice (invoiceNumber, totalAmount, personId) values ('12020', 70, 8);
insert into rothexample.invoice (invoiceNumber, totalAmount, personId) values ('98652', 120, 8);

insert into rothexample.invoice (invoiceNumber, totalAmount, paid, personId) values ('87709', 80, 1, 9);
insert into rothexample.invoice (invoiceNumber, totalAmount, paid, personId) values ('98772', 85, 1, 9);
insert into rothexample.invoice (invoiceNumber, totalAmount, personId) values ('97623', 130, 9);
insert into rothexample.invoice (invoiceNumber, totalAmount, personId) values ('12920', 90, 9);

insert into rothexample.invoice (invoiceNumber, totalAmount, paid, personId) values ('67896', 180, 1, 10);
insert into rothexample.invoice (invoiceNumber, totalAmount, paid, personId) values ('78512', 90, 1, 10);
insert into rothexample.invoice (invoiceNumber, totalAmount, paid, personId) values ('97403', 150, 1, 10);
insert into rothexample.invoice (invoiceNumber, totalAmount, paid, personId) values ('97354', 285, 1, 10);

insert into rothexample.invoice (invoiceNumber, totalAmount, paid, personId) values ('67006', 700, 1, 11);
insert into rothexample.invoice (invoiceNumber, totalAmount, personId) values ('12967', 400, 11);

insert into rothexample.invoice (invoiceNumber, totalAmount, paid, personId) values ('19233', 240, 1, 12);
insert into rothexample.invoice (invoiceNumber, totalAmount, paid, personId) values ('92726', 50, 1, 12);


