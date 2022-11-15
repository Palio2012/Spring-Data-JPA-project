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
    (2, 'Rio de janeiro', 45678),
    (3, 'Fortaleza', 300),
    (4, 'Salvador', 400),
    (5, 'Belo Horizonte', 500),
    (6, 'Porto alegre', 600),
    (7, 'Porto Velho', 700),
    (8, 'Palmas', 800),
    (9, 'Recife', 100),
    (10, 'Natal', 200),
    (11, 'Brasilia', 900);
