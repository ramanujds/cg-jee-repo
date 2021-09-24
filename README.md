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





```
