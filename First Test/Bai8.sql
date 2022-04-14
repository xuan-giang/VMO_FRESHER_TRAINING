create database baitestvmo;
use baitestvmo;
create table user_profile(
	id int(10) primary key,
    username varchar(255) not null,
    password varchar(255) not null,
    fullname varchar(255) not null,
    avatar varchar(255),
    birthday timestamp,
    created_time timestamp not null
);

create table friend (
	id int(10) primary key,
    sender_id int(10) not null,
    receiver_id int(10) not null,
    status enum('pending','accepted','rejected'),
    created_time timestamp not null
);

/* Cau A */
create table message (
	id int(10) primary key,
    sender_id int(10) not null,
    type varchar(255) not null,
    content varchar(255),
    status varchar(255),
    created_time timestamp not null
);
/* Cau B */
insert into user_profile values (1, 'peter1', 'peter123', 'Peter 1', 'peter1.png', '2001:01:01 00:00:00', '2022:03:25 00:00:00');
insert into user_profile values (2, 'peter2', 'peter123', 'Peter 2', 'peter2.png', '2001:01:01 00:00:00', '2022:03:25 00:00:00');
insert into user_profile values (3, 'peter3', 'peter123', 'Peter 3', 'peter3.png', '2001:01:01 00:00:00', '2022:03:25 00:00:00');
insert into user_profile values (4, 'peter4', 'peter123', 'Peter 4', 'peter4.png', '2001:01:01 00:00:00', '2022:03:25 00:00:00');


insert into friend values (1,1,1,'pending', '2022:03:25 00:00:00');
insert into friend values (2,2,2,'accepted', '2022:03:25 01:00:00');
insert into friend values (3,3,3,'accepted', '2022:03:25 02:00:00');
insert into friend values (4,4,4,'rejected', '2022:03:25 03:00:00');

insert into message values (1,1,'text','abc','sent', '2022:03:25 04:00:00');
insert into message values (2,2,'image','abc','pending_read', '2022:03:25 04:00:00');
insert into message values (3,3,'text','abc','pending_read', '2022:03:25 04:00:00');
insert into message values (4,4,'image','abc','read', '2022:03:25 04:00:00');
/* Cau C1 */
select id, username, fullname, avatar from user_profile where id = 2 or id = 3;
/* Cau C2 */
select id, username, fullname, avatar from friend where sender_id = 2;
/* Cau C3 */
select message_id, sender_id, receiver_id, type, status, content, created_time 
from message inner join friend on message.receiver_id = friend.id inner join user_profile on message.sender_id = user_profile.id
where message_id.sender_id = 2;
/* Cau C4 */
select receiver_id as friend_id, id as  mesage_id, type, status, content, sender_id, created_time
	from message
	where receiver_id in  (select reciever_id
		from friend
		where sender_id = 2 and status = 'accepted')
	order by created_time asc
	limit 1
