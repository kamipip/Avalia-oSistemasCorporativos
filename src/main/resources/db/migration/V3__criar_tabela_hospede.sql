create table hospede (
    id int auto_increment primary key,
    nome varchar(200) not null,
    data_registro varchar(200) not null,
    lista_reservas varchar(500) not null
);