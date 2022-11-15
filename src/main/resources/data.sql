create table tb_city (
    id_city bigint not null primary key,
    name varchar (50) not null,
    qtt_population bigint
);

insert into tb_city (
    id_city, name, qtt_population
)
values
    (1, 'São Paulo', 123456 ),
    (2, 'Rio de janeiro', 45678);