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

```
