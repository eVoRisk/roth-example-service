DROP TABLE IF EXISTS rothexample.credit_card;

CREATE TABLE rothexample.credit_card (
    `id` INTEGER AUTO_INCREMENT NOT NULL PRIMARY KEY,
    `cardNumber` VARCHAR(19) UNIQUE NOT NULL,
    `securityCode` VARCHAR(3) NOT NULL,
    `expirationDate` DATE NOT NULL,
    `personId` INTEGER NOT NULL,
    FOREIGN KEY (personId)
        REFERENCES person (id)
)  ENGINE=INNODB DEFAULT CHARSET=UTF8;

insert into rothexample.credit_card (cardNumber, securityCode, expirationDate, personId) values ('1212 4563 8123 1231', '173', '2020-10-12', 1);

insert into rothexample.credit_card (cardNumber, securityCode, expirationDate, personId) values ('4664 4989 0900 1200', '892', '2021-09-23', 2);

insert into rothexample.credit_card (cardNumber, securityCode, expirationDate, personId) values ('8267 8172 0099 8762', '177', '2019-08-17', 3);

insert into rothexample.credit_card (cardNumber, securityCode, expirationDate, personId) values ('7636 8627 9287 8172', '291', '2020-11-30', 4);

insert into rothexample.credit_card (cardNumber, securityCode, expirationDate, personId) values ('8122 9182 0901 9122', '812', '2020-12-31', 5);

insert into rothexample.credit_card (cardNumber, securityCode, expirationDate, personId) values ('8766 4563 8123 5532', '899', '2024-01-25', 6);

insert into rothexample.credit_card (cardNumber, securityCode, expirationDate, personId) values ('8172 0922 8220 1224', '901', '2021-04-19', 7);

insert into rothexample.credit_card (cardNumber, securityCode, expirationDate, personId) values ('9480 0012 7722 9223', '542', '2022-02-27', 8);

insert into rothexample.credit_card (cardNumber, securityCode, expirationDate, personId) values ('2349 0033 8822 8123', '721', '2021-06-23', 9);

insert into rothexample.credit_card (cardNumber, securityCode, expirationDate, personId) values ('2149 1102 9900 9201', '532', '2020-07-19', 10);

insert into rothexample.credit_card (cardNumber, securityCode, expirationDate, personId) values ('1212 3553 4412 8666', '912', '2020-08-12', 11);

insert into rothexample.credit_card (cardNumber, securityCode, expirationDate, personId) values ('9902 9982 8822 7666', '601', '2020-02-18', 12);