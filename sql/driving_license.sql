DROP TABLE IF EXISTS rothexample.driving_license;

CREATE TABLE rothexample.driving_license (
    `id` INTEGER AUTO_INCREMENT NOT NULL PRIMARY KEY,
    `licenseNumber` VARCHAR(20) UNIQUE NOT NULL,
    `issueDate` DATE NOT NULL,
    `personId` INTEGER NOT NULL,
    FOREIGN KEY (personId)
        REFERENCES person (id)
)  ENGINE=INNODB DEFAULT CHARSET=UTF8;

insert into rothexample.driving_license(licenseNumber, issueDate, personId) values ('1234567', '2006-02-12', 1);

insert into rothexample.driving_license(licenseNumber, issueDate, personId) values ('1526735', '2000-07-22', 3);

insert into rothexample.driving_license(licenseNumber, issueDate, personId) values ('7238423', '2012-09-07', 5);

insert into rothexample.driving_license(licenseNumber, issueDate, personId) values ('9128312', '2000-03-19', 6);

insert into rothexample.driving_license(licenseNumber, issueDate, personId) values ('8122452', '2008-02-15', 7);

insert into rothexample.driving_license(licenseNumber, issueDate, personId) values ('8123512', '2003-12-02', 8);

insert into rothexample.driving_license(licenseNumber, issueDate, personId) values ('1238123', '2008-07-21', 10);

insert into rothexample.driving_license(licenseNumber, issueDate, personId) values ('3450343', '2000-10-29', 12);