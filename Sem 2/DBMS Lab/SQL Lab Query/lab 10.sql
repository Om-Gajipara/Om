CREATE TABLE Student2
(
	Rno int, 
	Name varchar (50), 
	Branch varchar (50)
);

CREATE TABLE Result (RNo int, SPI Decimal (4,2));CREATE TABLE EMPLOYEE2 (EmployeeNo varchar (50), Name varchar (50), ManagerNo varchar (50));--------------------------------

--1
select * 
from Student2
cross join Result

--2
select Student2.Rno,Name,Branch,SPI
from Student2
join Result 
on Student2.Rno=Result.RNo
where Branch = 'CE'

--3
select Student2.Rno,Name,Branch,SPI
from Student2
 join Result 
 on Student2.Rno=Result.RNo
where Branch <> 'EC'

--4
select Student2.Branch,avg(SPI)
from Student2
inner join Result 
on Student2.Rno=Result.RNo
group by Branch

--5
select Student2.Branch,avg(SPI) as AVG_SPI
from Student2
inner join Result 
on Student2.Rno=Result.RNo
group by Branch
order by AVG(SPI)

--6
select Student2.Branch,avg(SPI)
from Student2
inner join Result 
on Student2.Rno=Result.RNo
where Branch in ('CE','ME')
group by Branch

--7
select * from Student2
left outer join Result 
on Student2.Rno=Result.RNo

--8 
select * from Student2
Right outer join Result 
on Student2.Rno=Result.RNo

--9
select * from Student2
full outer join Result 
on Student2.Rno=Result.RNo

--10
SELECT E.Name AS EmployeeName ,M.Name AS ManagerName
from EMPLOYEE2 E
Left Outer Join EMPLOYEE2 M
on E.ManagerNo=M.EmployeeNo
