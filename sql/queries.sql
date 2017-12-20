/*
	1. Select persons with license issue date in 2000 and license number doesn't contain '0'
*/
SELECT 
    p.firstname,
    p.lastname,
    p.phone,
    dl.issueDate,
    dl.licenseNumber
FROM
    person p
        INNER JOIN
    driving_license dl ON p.id = dl.personid
WHERE
    EXTRACT(YEAR FROM dl.issueDate) = '2000'
        AND dl.licenseNumber NOT LIKE '%0%';
        
 /*
	2. For which persons the credit card expires in less than 3 years
 */       
SELECT 
    p.firstname, p.lastname, cc.cardNumber, cc.expirationDate
FROM
    person p
        INNER JOIN
    credit_card cc ON p.id = cc.personid
WHERE
    FLOOR(DATEDIFF(cc.expirationDate, NOW()) / 365) < 3;
      
 /*
	3. How many invoices a person has
 */
 SELECT 
    p.firstname, p.lastname, COUNT(i.personId)
FROM
    person p
        INNER JOIN
    invoice i ON p.id = i.personId
GROUP BY i.personId;

/*
	4. How much did every person paid
*/
SELECT 
    p.firstname, p.lastname, SUM(i.totalAmount), i.personId
FROM
    person p
        INNER JOIN
    invoice i ON p.id = i.personId
WHERE
    i.paid = 1
GROUP BY i.personId;

/*
	5. How many unpaid invoices has every each person
*/
SELECT 
    p.firstname, p.lastname, i.personId, COUNT(i.paid)
FROM
    person p
        INNER JOIN
    invoice i ON p.id = i.personId
WHERE
    i.paid = 0
GROUP BY i.personId;

/*
	6. How many persons have paid more than 200
*/
SELECT 
    p.firstname, p.lastname, i.personId, SUM(i.totalAmount)
FROM
    person p
        INNER JOIN
    invoice i ON p.id = i.personId
WHERE
    i.paid = 0
GROUP BY i.personId
HAVING SUM(i.totalAmount) > 200;

