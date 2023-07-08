--1
select * into Worldcup from Cricket

--2
select Name,City into T20 from Cricket
where 1=2;

--3
select * into IPL from Cricket
where 1=2;

--4
insert into IPL
select * from Cricket
where Name like '_a_____%'

--5
Truncate table IPL

--6
delete from Cricket 
where City = 'jharkhand'

--7
Sp_rename'IPL','IPL2018'

--8
drop table T20