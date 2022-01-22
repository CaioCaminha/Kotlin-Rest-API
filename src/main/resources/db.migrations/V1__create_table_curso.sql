create table curso(
    id bigint not null,
    nome varchar(50),
    categoria varchar(50),
    primary key(id)
);

insert into cusro values(1, 'Kotlin', 'Programação');
insert into cusro values(2, 'Java', 'Programação');
insert into cusro values(3, 'C++', 'Programação');
insert into cusro values(4, 'Spring Boot', 'Rest Api');
insert into cusro values(5, 'Micronaut', 'Cloud Native');