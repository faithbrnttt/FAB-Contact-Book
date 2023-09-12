use cbdb;

CREATE TABLE contacts (
	contactID INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    contactName VARCHAR(100) NOT NULL,
    contactPhone VARCHAR(100) NOT NULL
);

SELECT * FROM contacts;