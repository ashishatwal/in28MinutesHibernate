insert into course(id,name) 
values (101,'Computer Science');
insert into course(id,name) 
values (102,'C++');
insert into course(id,name) 
values (103,'Java');

insert into passport(id,number)
values(301,'E5774F');
insert into passport(id,number)
values(302,'G6749Q');
insert into passport(id,number)
values(303,'R5860Q');

/*insert into student(id,name)
values(201,'Ashish');
insert into student(id,name)
values(202,'Singh');
insert into student(id,name)
values(203,'Atwal');*/
insert into student(id,name,passport_id)
values(201,'Ashish',303);
insert into student(id,name,passport_id)
values(202,'Singh',301);
insert into student(id,name,passport_id)
values(203,'Atwal',302);

insert into review(id,description,rating)
values(401,'Great Course','5');
insert into review(id,description,rating)
values(402,'Wonderful Course','4');
insert into review(id,description,rating)
values(403,'Good Course','5');

