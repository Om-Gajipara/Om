SELECT * FROM STUDENT1
--1. Create a view Personal with all columns.

CREATE VIEW PERSONAL
AS SELECT * FROM STUDENT1;

SELECT * FROM PERSONAL

--2. Create a view Student_Details having columns Name, Branch & SPI.
CREATE VIEW STUDENT_DETAILS
AS SELECT NAME,BRANCH,SPI FROM STUDENT1

select * from Student_Details
--3. Create a view Academic having columns RNo, Name, Branch.
create view academic
as select Rno,name,Branch from student1;
select * from academic
--4. Create a view Student_Data having all columns but students whose bklog more than 2.
create view Student_Data
as select * from Student1
where bklog>2
select * from Student_Data
--5. Create a view Student_Pattern having RNo, Name & Branch columns in which Name consists of four letters.
create view Student_Pattern 
as select Rno,name,branch from Student1
where name like '____'
select * from Student_Pattern
--6. Insert a new record to Academic view. (107, Meet, ME)
insert into Academic
values(107,'Meet','ME')
--7. Update the branch of Amit from CE to ME in Student_Details view.
update Student_Details
set branch='ME'
where name='Amit';
--8. Delete a student whose roll number is 104 from Academic view
delete from Academic
where rno=104;