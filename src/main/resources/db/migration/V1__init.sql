create table random_user(
                            id SERIAL AUTO_INCREMENT PRIMARY KEY,
                            firstname VARCHAR(50),
                            lastname VARCHAR(50),
                            age INT NOT NULL,
                            country VARCHAR(100),
                            avatar VARCHAR(250),
                            created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

insert into random_user(firstname,lastname,age,country,avatar)
values ('Zoe','Stanley',23,'Ireland','https://randomuser.me/api/portraits/women/89.jpg');
insert into random_user(firstname,lastname,age,country,avatar)
values ('Andrea','Pricesmart',31,'United States','https://randomuser.me/api/portraits/women/1.jpg');
insert into random_user(firstname,lastname,age,country,avatar)
values ('Pablo','Picasso',23,'Italia','https://randomuser.me/api/portraits/men/1.jpg');
insert into random_user(firstname,lastname,age,country,avatar)
values ('Randall','Mora',36,'Costa Rica','https://randomuser.me/api/portraits/men/77.jpg');
insert into random_user(firstname,lastname,age,country,avatar)
values ('Trisha','Smith',43,'United States','https://randomuser.me/api/portraits/women/3.jpg');
insert into random_user(firstname,lastname,age,country,avatar)
values ('Thania','Salinas',28,'Mexico','https://randomuser.me/api/portraits/women/33.jpg');
insert into random_user(firstname,lastname,age,country,avatar)
values ('Antonella','Messi',31,'Argentina','https://randomuser.me/api/portraits/women/28.jpg');
insert into random_user(firstname,lastname,age,country,avatar)
values ('Stacy','Imbruglia',45,'Ireland','https://randomuser.me/api/portraits/women/75.jpg');
insert into random_user(firstname,lastname,age,country,avatar)
values ('Suyin','Ming',40,'China','https://randomuser.me/api/portraits/women/42.jpg');