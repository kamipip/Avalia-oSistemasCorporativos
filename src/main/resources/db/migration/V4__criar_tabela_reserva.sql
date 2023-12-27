create table reserva (
    id int auto_increment primary key,
    data_inicio varchar(200) not null,
    data_fim varchar(200) not null,
    acomodacao_reservada varchar(500) not null,
    hospede_id int not null,
    foreign key (hospede_id) references hospede(id)
);