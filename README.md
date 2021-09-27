# cg-jee-repo

## SQL Commands

```sql

use cg_db;
create table trainee(traineeId numeric(6), traineeName varchar(30), dob date, email varchar(50));

show tables;

insert into trainee values(1001,'Hitesh','1995-03-20', 'hitesh@yahoo.com');

select * from trainee;

desc trainee;

-- DDL 
-- Create , Alter, Drop, Truncate

alter table trainee drop emain;

alter table trainee add email varchar(50);

alter table trainee modify traineeName varchar(60);

truncate table trainee;

alter table trainee add primary key(traineeid);

drop table trainee;

desc trainee;

create table trainer(trainerId numeric(4) primary key, trainerName varchar(30) not null, technology varchar(20));

desc trainer;


create table trainee(traineeId numeric(6) primary key, traineeName varchar(30), dob date, email varchar(50) unique, trainerId numeric(4), 
				constraint fk_trainerId foreign key(trainerId) references trainer(trainerId));
                
desc trainee;                

insert into trainer values(5001,'Ramanuj Das', 'JAVA');

insert into trainee values(1001,'Hitesh','1995-03-20', 'hitesh@yahoo.com',5001);
insert into trainee values(1002,'Rohit','1995-05-20', 'rohit@yahoo.com',2004);
insert into trainee values(1003,'Mahesh','1994-07-20', 'mahesh@yahoo.com',5001);



-- DML - insert, update, delete

insert into trainer(trainerName,trainerId) values('Javed',2004);
select * from trainer;

-- Update

update trainer set technology='Angular' where trainerId=2004;

-- Delete

delete from Trainer where trainerId=2004;

set autocommit=0;
savepoint s1;
delete from Trainer where trainerId=2004;
rollback to s1;
set autocommit=1;

-- DQL

select traineeId, traineeName, trainerId from trainee;

select * from trainee where trainerId=5001;

create table emptable(empno numeric(5) primary key, ename varchar(30), job varchar(30), hireDate date, mgr numeric(5), sal numeric(5), comm numeric(5), deptNo numeric(5));

insert into emptable values(7369, 'Smith','Clerk','1980-12-17', 7902,800, null ,20);
insert into emptable values(7499, 'Allen','Salesman','1981-02-20', 7698,1600, 300 ,30);
insert into emptable values(7521, 'Ward','Salesman','1981-02-22', 7698,1250, 500 ,30);
insert into emptable values(7566, 'Jones','Manager','1981-04-02', 7839,2975, null ,20);
insert into emptable values(7654, 'Martin','Salesman','1981-09-28', 7698,1250, 1400 ,30);
insert into emptable values(7698, 'Blake','Manager','1981-05-01', 7839,2850, null ,30);
insert into emptable values(7782, 'Clark','Manager','1981-06-09', 7839,2450, null ,10);
insert into emptable values(7788, 'Scott','Analyst','1987-04-19', 7566,3000, null ,20);
insert into emptable values(7839, 'King','President','1981-11-17',null,5000, null ,10);
insert into emptable values(7844, 'Turner','Salesman','1981-09-08', 7698,1500, 0 ,30);
insert into emptable values(7876, 'Adams','Clerk','1987-05-23', 7788,1100, null ,20);
insert into emptable values(7900, 'James','Clerk','1981-12-03', 7698,950, null ,30);
insert into emptable values(7902, 'Ford','Analyst','1981-12-03', 7566,3000, null ,20);
insert into emptable values(7934, 'Miller','Clerk','1982-01-23', 7782,1300, null,10);

select * from emptable;

select distinct job from emptable;

select * from emptable order by sal asc;

select * from emptable where job='MANAGER';

select * from emptable where empno in(select mgr from emptable);

select empno,ename,hiredate from emptable where hiredate<'1981-03-01';

SELECT * from emptable where extract(year from hiredate)<1981;

select empno,ename,sal,sal/30 as 'Daily Salary', sal*12 as 'Annual_Salary' from emptable order by Annual_Salary asc;

select empno,ename, hiredate, datediff(now(),hiredate)/365 as 'Experience' from emptable order by 4 desc;

select * from emptable where job='Clerk' OR job='Analyst';

select * from emptable where job not in('Clerk','Analyst');

select * from emptable where sal>=1000 AND sal<=2000;

select * from emptable where sal not between 1000 and 2000;

select * from emptable where comm is not null and comm <> 0;

select * from emptable where hiredate like '____-02-%';

-- like 'a%'
-- like '%a'
-- like 'a___'
-- like 'a_b%'

select * from emptable order by sal asc limit 1;

-- Group By
select job, max(sal) as 'Top Packages', avg(sal) as 'Average Salary', 
			min(sal) as 'Minimum Salary', sum(sal) as 'Total Salary', 
            count(*) as 'Total Employees' from emp group by job having count(*)>2;
            
-- where vs having

create table dept
 (
    deptno numeric(5),
    dname varchar(30),
    location varchar(50)
 );

use cg_db;

insert into dept values(10,'IT','BANGALORE');

 insert into dept values(20,'SALES','MUMBAI');

 insert into dept values(30,'ACCOUNTS','KOLKATA');
 insert into dept values(40,'HR','DELHI');
 
 
 select * from dept;
 
 select d.* from emptable e right join dept d on e.deptno=d.deptno where e.empno is null;
 
 
show tables;

select e.empno, e.ename, e.deptno, d.location from emptable e join dept d USING(deptno) where d.location='KOLKATA';

-- select no of employees working in IT department

select COUNT(e.empno) AS 'Toatl Employees' from emptable e join dept d using(deptno) where d.dname='IT';

select d.*, count(empno) from dept d left join emptable e using(deptno) group by d.deptno, dname, location;

-- total salary of Sales dept

select sum(e.sal) AS 'Toatl Salary' from emptable e join dept d using(deptno) where d.dname='SALES';

-- employees working in IT dept or in Mumbai location

select e.*, d.*from emptable e left join dept d on e.deptNo = d.deptNo where dname ='IT' or location ='Mumbai';

-- employees who are getting salaries more than their managers

-- least earning manager
-- manager with least no of employees

-- Salesman working in Kolkata


-- Manager who belong to IT







```
