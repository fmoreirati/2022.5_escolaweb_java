create database dbescolaweb;

use dbescolaweb;

create table pessoa(
    _id varchar(255) primary key not null,
    nome varchar(100) not null,
    email varchar(100) not null,
    senha varchar(100) not null,
    data_nasc date null,
    cadastro datetime default CURRENT_TIMESTAMP not null,
    ativo boolean default 1 not null
);

create table aluno(
    _id varchar(255) primary key not null,
    _id_pessoa varchar(255) not null,
    matricula varchar(20) not null,
    foreign key (_id_pessoa) references pessoa(_id)
);

create table funcionario(
    _id varchar(255) primary key not null,
    _id_pessoa varchar(255) not null,
    cargo varchar(100) not null,
    foreign key (_id_pessoa) references pessoa(_id)
);

SELECT
    *
FROM
    aluno,
    pessoa
WHERE
    aluno._id_pessoa = pessoa._id;