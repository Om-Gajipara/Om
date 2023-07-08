Create table Employee (
EID int not null, 
EName varchar (50) not null, 
Department varchar (50) not null, 
Salary Decimal (8,2) not null, 
JoiningDate datetime not null ,
City varchar (50) not null
)

insert into Employee
values

(101, 'Rahul','Admin', 56000,'1-Jan-90', 'Rajkot'),
(102 ,'Hardik' ,'IT', 18000 ,'25-Sep-90 ','Ahmedabad'),
(103 ,'Bhavin','HR', 25000 ,'14-May-91', 'Baroda'),
(104 ,'Bhoomi','Admin', 39000,'8-Feb-91', 'Rajkot'),
(105 ,'Rohit','IT', 17000 ,'23-Jul-90', 'Jamnagar'),
(106 ,'Priya', 'IT', 9000 ,'18-Oct-90', 'Ahmedabad'),
(107 ,'Neha' ,'HR', 34000 ,'25-Dec-91', 'Rajkot');

--1
SELECT MAX(Salary) as Maximun,min(Salary) as Minimum,sum(Salary) as Total_sal,AVG(Salary) as Average_sal from Employee

--2
SELECT COUNT(EID) from Employee

--3
SELECT  Department ,MAX(Salary) from Employee
where Department='IT'
group by Department

--4
select  COUNT( DISTINCT City) from Employee

--5
SELECT City,Count(Ename)  as Totalemployee from Employee
group by City

--6
SELECT City ,Count(*) from Employee
group by City
Having Count(*) > 1

--7
SELECT Department,sum(salary)
from Employee
group by Department

--8
SELECT avg(SaLARY) FROM Employee
group by Department

--9
SELECT MIN(SALARY) FROM Employee
where City='Ahmedabad'

--10
SELECT Department  from Employee
group by City,Department
having sum(salary) > 50000 and City='Rajkot'
 

--11
SELECT COUNT(EName) from Employee
where City='Rajkot'

--12
SELECT MAX(SALARY) - MIN(SALARY) AS SAL_DIFFERENCE FROM Employee

--13
SELECT count(EName) from Employee
where JoiningDate < '1991-01-01'

--14
SELECT Department, Sum(salary) from Employee
group by Department
having sum(salary) >35000
ORDER BY sum(Salary) asc

--15
SELECT Department from Employee
group by Department
having count(EName) >2

 -- 16
 SELECT MIN(SALARY) FROM Employee
 WHERE City='Rajkot'

 -- 17
 select City , Count(EName)
 from Employee
 group by City

 -- 18
 SELECT Department , min(Salary)
 from Employee
 group by Department

 -- 19
 SELECT SUM(SALARY)
 FROM Employee
 Group by City

 -- 20
 SELECT Department,min(Salary) as minimum_salary,max(salary) as maximum_salary,sum(salary) as total_salary
 from Employee
 group by Department
