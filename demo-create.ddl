create sequence hibernate_sequence start with 1 increment by 1
create table Specialist (id bigint not null, name varchar(200), last_name varchar(250), creation_date date, dni varchar2(20), email varchar2(150), resumen varchar2(2000), primary key (id))
