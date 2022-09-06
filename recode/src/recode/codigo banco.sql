CREATE database crud;
USE crud;
CREATE table contato(
id  int primary key
auto_increment,
nome varchar(50),
idade int,
dataCadastro Date );