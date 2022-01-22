create table topico(
    id bigint not null,
    titulo varchar(50) not null,
    mensagem varchar(300) not null,
    data_criacao datetime not null,
    status varchar(20) not null,
    curso_id bigint not null,
    autor_id bigint not null,
    primary key(id),
    foreign key(curso_id) references curso(id),
    foreign key(autor_id) references autor(id)
);

insert into topico values(1, 'Spring Boot', 'Como resolver', 11-11-2022, 'em andamento', 1, 1);