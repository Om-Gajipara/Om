--Lab-6

--Math function

--1
SELECT 5*30 AS Multiply
--2
SELECT ABS (-25), ABS (25), ABS (-50), ABS (50)
--3
SELECT CEILING (25.2), CEILING (25.7), CEILING (-25.2)
--4
SELECT FLOOR (25.2), FLOOR (25.7), FLOOR (-25.2)
--5
SELECT 5%2, 5%3
--6
SELECT POWER (3,2), POWER (5,3)
--7
SELECT SQRT (25), SQRT (30), SQRT (50)
--8
SELECT SQUARE (5), SQUARE (15), SQUARE (25)
--9
SELECT PI()
--10
SELECT ROUND (157.732,2),ROUND (157.732,0),ROUND (157.732,-2)
--11
SELECT EXP(2), EXP (3)
--12
SELECT LOG10 (5), LOG10 (100)
--13
SELECT SIN(3.1415), COS (3.1415), TAN (3.1415)
--14
SELECT SIGN(-25), SIGN(0), SIGN (25)
--15
SELECT RAND()

-------------------------------------------------------

--String function 

--1
SELECT len ('NULL'),len ('  Hello  '),len ('');
--2
SELECT upper('om'),lower('OM');
--3
SELECT substring('Om Gajipara',1,3);
--4
SELECT substring('Om Gajipara',3,10);
--5
SELECT replace('abc123efg','123','XYZ'),replace('abcabcabc','c','5');
--6
SELECT ascii('A'),ascii('a'),ascii('0'),ascii('9');
--7
SELECT char(97),char(65),char(122),char(90),char(48),char(57);
--8
SELECT ltrim('hello world     ');
--9
SELECT rtrim('     hello world');
--10
SELECT left('SQL Server',4),right('SQL Server',5);
--11
SELECT cast('1234.56'as float);
--12
SELECT convert(int,10.58);
--13
SELECT space(10)+'om';
--14
SELECT concat('Om',' Gajipara'), 'Om'+' Gajipara' ;
--15
SELECT reverse('darshan');
--16
SELECT replicate('om ',2);
--17
SELECT stuff('SQL Tutorial',1,4,'HTML');
--18
SELECT coalesce(null,null,'om',null),
		coalesce(null,'dbms','om',null),
		coalesce(null,null,123,'om');
--19
SELECT isnumeric(10),isnumeric('asdf');
--20
SELECT charindex('t','customer');