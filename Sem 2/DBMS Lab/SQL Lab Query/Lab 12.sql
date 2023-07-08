Create table Student 
(RNo int,
Name varchar (50),
Branch varchar (50),
SPI Decimal (4,2), 
Bklog Int
);

insert into Student
values
(101,'Raju','CE',8.80,0),
(102,'Amit','CE',2.20,3),
(103,'Sanjay','ME',1.50,6),
(104,'Neha','EC',7.65,1),
(105,'Meera','EE',5.52,2),
(106,'Mahesh','EC',4.50,3)
--1
CREATE VIEW Personal
AS
SELECT * FROM Student

Select *from Personal

--2
CREATE VIEW Student_Details
AS
SELECT Name,Branch,SPI
FROM Student

Select *from Student_Details

--3
CREATE VIEW Academic
AS
SELECT RNo, Name, Branch
FROM Student

Select *from Academic

--4
CREATE VIEW Student_Data
AS
SELECT * FROM Student
WHERE Bklog > 2

Select *from Student_Data

--5
CREATE VIEW Student_Pattern
AS
SELECT RNo, Name, Branch
FROM Student
WHERE Name Like '____'

Select *from Student_Pattern

--6
INSERT INTO Academic
SELECT 107, 'Meet', 'ME'
OR
INSERT INTO Academic
Values (107, 'Meet', 'ME')

--7
UPDATE Student_Details
SET Branch='ME'
WHERE Name='Amit' And Branch='CE'

--8
DELETE FROM Academic
WHERE RNo=104

--9
CREATE VIEW [vwSPIAbove9.5]
AS
SELECT * FROM Student WHERE SPI>9.5

--10
CREATE VIEW [vwZeroBklog]
AS
SELECT * FROM Student WHERE Bklog=0