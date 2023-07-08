Create table Student_Marks
(
 Sid int not null,
 SName varchar (50) not null,
 Marks int not null 
)

--1
Select COUNT(SName) from Student_Marks

--2
Select sum(Marks) from Student_Marks

--3
Select avg(Marks) from Student_Marks

--4
Select min(Marks) from Student_Marks

--5
Select max(Marks) from Student_Marks