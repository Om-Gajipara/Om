--1
select Name from Computer
union
Select Name from Electrical

--2
select Name from Computer
union all
Select Name from Electrical

--3
select Computer.Name from Computer
inner join Electrical on Computer.Name=Electrical.Name

--3
--select name from COMPUTER
--intersect
--select name from ELECTRICAL

--4
select Name from Computer
except
select Name from Electrical

--5
select Name from Electrical
except
select Name from Computer

--6
select * from Computer
union all
select * from Electrical

--7
select * from Computer
inner join Electrical on Computer.Name=Electrical.Name

--7
--select * from COMPUTER
--intersect
--select * from ELECTRICAL
