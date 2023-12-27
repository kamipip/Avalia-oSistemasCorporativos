create table acomodacao (
    id int auto_increment primary key,
    nome varchar(200) not null,
    localizacao varchar(200) not null,
    numero_registro int not null,
    quantidade_quartos int not null,
    antitriao_id int not null,
    foreign key (anfitriao_id) references anfitriao(id)
);