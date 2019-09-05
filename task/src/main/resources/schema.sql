DROP TABLE IF EXISTS person;
create table person
(
   id integer auto_increment,
   name varchar(20) not null,
   surname varchar(20) not null,
   zipCode varchar(20) not null,
   city varchar(20) not null,
   telNumber varchar(20) not null,
   UNIQUE KEY con (name,surname,zipcode,city,telnumber)
);
