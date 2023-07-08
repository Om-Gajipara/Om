Select * from Person


--1.
	Select p.PersonName,d.DepartmentCode,d.DepartmentName from Person p
	right outer join Department d
	on p.DepartmentId=d.DepartmentId
	

--2.
	Select p.personname from Person p
	inner join Department d
	on p.DepartmentId=d.DepartmentId
	where d.Location='c-block'


--3.
	select p.PersonName,p.salary,d.DepartmentName from Person p
	left outer join Department d
	on p.DepartmentId=d.DepartmentId
	where p.City='Jamnagr'
	

--4.
	select p.PersonName,p.salary,d.DepartmentName from Person p
	left outer join Department d
	on p.DepartmentId=d.DepartmentId
	where p.City != 'Rajkot'

--5.
	select * from Person p
	inner join Department d
	on p.DepartmentId=d.DepartmentId
	where p.DepartmentId = 2 

--6.
	select * from Person p
	left outer join Department d
	on p.DepartmentId=d.DepartmentId
	where p.DepartmentId is null

--7.	
select p.PersonName from Person p
	inner join Department d
	on p.DepartmentId = d.DepartmentId 
	where p.JoiningDate > '1-aug-2001'

--8.
	select p.PersonName,d.DepartmentName from Person p
	inner join Department d 
	on p.DepartmentId=d.DepartmentId
	where getdate() - p.JoiningDate > 365

--9.
	select COUNT(p.PersonId),d.DepartmentName from Person p 
	inner join Department d
	on p.DepartmentId = d. DepartmentId
	group by d.DepartmentName

--10.
	select max(p.Salary),MIN(p.Salary),d.DepartmentName from Person p
	inner join Department d
	on p.DepartmentId = d.DepartmentId
	group by d.DepartmentName

--11.
	select p.City,SUM(p.Salary),AVG(p.Salary),MAX(p.Salary),MIN(p.Salary) from Person p
	left outer join Department d
	on p.DepartmentId = d.DepartmentId
	group by p.City

--12.
	select d.DepartmentName from Person p 
	inner join Department d
	on p.DepartmentId = d.DepartmentId
	group by d.DepartmentName
	having sum(p.salary) > 100000

--13.
	select AVG(p.Salary) from Person p
	group by p.City
	having p.City = 'Ahmedabad'

--14.
	select d.DepartmentName from Person p
	right outer join Department d
	on p.DepartmentId = d.DepartmentId
	where d.DepartmentId is null

--15.
	select d.DepartmentName from Person p
	right outer join Department d
	on p.DepartmentId = d.DepartmentId
	group by DepartmentName
	having COUNT(p.PersonName) > 2

--16. 
	select p.PersonName + ' lives in ' + p.City + ' and works in' + d.DepartmentName + ' Department.'	from Person p
	inner join Department d
	on p.DepartmentId = d.DepartmentId 

--17.	
	select p.PersonName + ' earns ' + CONVERT(varchar(100),p.Salary) + ' from department' +				d.DepartmentName + ' monthly' from Person p
	inner join Department d
	on p.DepartmentId = d.DepartmentId 
	
--18.
	select SUM(p.Salary),AVG(p.Salary),MAX(p.Salary) from Person p
	full outer join Department d
	on p.DepartmentId = d.DepartmentId
	group by p.City,d.DepartmentName

--19. 
	UPDATE Person SET Salary = Salary + Salary*.1
	