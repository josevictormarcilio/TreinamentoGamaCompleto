-- create database itau;
-- create table itau.clientes(
-- Codigo_Cliente integer(6) not null,
-- Nome_Cliente varchar(50) not null,
-- Idade_Cliente integer(3) not null,
-- Email_Cliente varchar(80) not null
-- );
-- describe itau.clientes;
-- insert into itau.clientes
-- (Codigo_Cliente,Nome_Cliente,Idade_Cliente,Email_Cliente)
-- values
-- (1,"José Victor",24,"josevictormello@hotmail.com"),
-- (2,"Maria",20,"maria@hotmail.com"),
-- (3,"Fabricio",27,"fabricio@hotmail.com")
-- select * from itau.clientes;
-- alter table itau.clientes add Endereco_Cliente varchar(80) not null;
-- update itau.clientes set Endereco_Cliente="Rua Itaguaba" where Idade_Cliente=31;
-- select * from itau.clientes where Endereco_Cliente="Atualizar Endereço";
-- update itau.clientes set Endereco_Cliente="Atualizar Endereço" where Endereco_Cliente="";
-- select * from itau.clientes;
-- delete from itau.clientes where Nome_Cliente="Maria";
-- update itau.clientes set Codigo_Cliente=101 where Nome_Cliente="Fabricio";
-- insert into itau.clientes 
-- (Codigo_Cliente, Nome_Cliente, Idade_Cliente, Email_Cliente, Endereco_Cliente)
-- values
-- (102, "Luana",23, "luana@itau.com.br", "Rua Itambé");
-- create table itau.bck_cliente (select * from itau.clientes);
-- select * from itau.bck_cliente;
-- drop table itau.clientes;
-- drop database itau super cuidado (auto destruidor);

create table itau.clientes (
Codigo_Cliente integer(6) not null auto_increment,
Nome_Cliente varchar(50) not null,
CPF_Cliente varchar(11) not null,
Email_Cliente varchar(80) not null,
Idade_Cliente integer(3) not null,
Endereco_Cliente varchar(80) not null,
Cep_Cliente char(8) not null,
Data_Nascimento_Cliente date not null,
Data_Cadastro_Cliente datetime not null,
Telefone_Cliente char(11) not null,
primary key (Codigo_Cliente)
);

-- describe itau.clientes;
-- select * from itau.clientes;
-- insert into itau.clientes 
-- (Nome_Cliente,CPF_Cliente,Email_Cliente,Idade_Cliente,Endereco_Cliente,Cep_Cliente,Data_Nascimento_Cliente,
-- Data_Cadastro_Cliente,Telefone_Cliente)
-- select Nome_Cliente,"Atualizar",Email_Cliente,Idade_Cliente,Endereco_Cliente,0,"1995-11-11",
-- now(),"Telefone" from itau.bck_cliente;
-- drop table itau.bck_cliente;
-- create table itau.bckclientes (select * from itau.clientes);
-- select * from itau.bckclientes;

select * from itau.clientes where Nome_Cliente like "Rana%";
select * from itau.clientes where Nome_Cliente like "%Victor%";
select * from itau.clientes where Nome_Cliente like "%Maxwell";
select count(*) from itau.clientes where Idade_Cliente >=50 and Idade_Cliente <=100;
select * from itau.clientes where Idade_Cliente >=50 and Idade_Cliente <=100 order by Idade_Cliente;

select max(Idade_Cliente) from itau.clientes;
select min(Idade_Cliente) from itau.clientes;

select * from itau.clientes where Idade_Cliente = (select max(Idade_Cliente) from itau.clientes);
select * from itau.clientes where Idade_Cliente = (select min(Idade_Cliente) from itau.clientes);

create table itau.produtos(
codigo_produto int(6) not null auto_increment,
nome_produto varchar(30) not null, 
quantidade_produto int(4) not null, 
data_cadastro datetime, 
valor_unitario decimal(8,2) not null,
primary key (codigo_produto)
);

insert into itau.produtos 
(nome_produto, quantidade_produto,data_cadastro,valor_unitario)
values
("MOUSE",10,now(),35.99),
("TECLADO",4,now(),42.99), 
("MONITOR 20 PL",20, now(),350.00),
("IMRESSORA",100, now(),375.99),
("NOTEBOOK",4, now(),2780.50);

select * from itau.produtos;
select sum(valor_unitario) from itau.produtos;
select avg(valor_unitario) from itau.produtos;

create table unibanco.produtos (select * from itau.produtos);

select * from unibanco.produtos;

create table itau.cargo(
cod_cargo char(2) not null,
nome_cargo varchar(50) not null,
valor_cargo decimal (8,2) not null, 
primary key(cod_cargo)
);

create table itau.funcionarios(
matricula int(6) not null auto_increment,
nome_funcionario varchar(50) not null,
cod_cargo_func char (2) not null, 
primary key(matricula),
foreign key(cod_cargo_func) references cargo(cod_cargo)
);

describe itau.funcionarios;

desc itau.produtos;

select sum(quantidade_produto*valor_unitario), data_cadastro from itau.produtos;
select * from itau.produtos;

insert into itau.cargo
(cod_cargo,nome_cargo,valor_cargo)
values
("C4", "SECRETARIA", 1800.00),
("C5", "ANALISTA DE SISTEMAS", 8200.00),
("C6", "CONTADOR", 4400.00);

select * from itau.cargo;

insert into itau.funcionarios
(nome_funcionario,cod_cargo_func)
values
("PEDRO","C1"),
("PAULO","C1"),
("JOSÉ","C2"),
("MARCOS","C3"),
("ROBERTA","C2");

select * from itau.funcionarios;

select f.matricula,f.nome_funcionario,c.nome_cargo,c.valor_cargo
from itau.funcionarios as f, itau.cargo as c 
where (f.cod_cargo_func=c.cod_cargo);

select f.matricula,f.nome_funcionario,c.nome_cargo,c.valor_cargo
from itau.cargo as c 
inner join itau.funcionarios as f
on f.cod_cargo_func = c.cod_cargo;

select f.matricula,f.nome_funcionario,c.nome_cargo,c.valor_cargo
from itau.cargo as c 
left join itau.funcionarios as f
on f.cod_cargo_func = c.cod_cargo;

create table itau.folha_pagamento (select f.matricula,f.nome_funcionario,c.nome_cargo,c.valor_cargo
from itau.cargo as c 
left join itau.funcionarios as f
on f.cod_cargo_func = c.cod_cargo);

select * from itau.folha_pagamento;

select sum(valor_cargo) from itau.folha_pagamento where matricula<>"";

use itau;

drop table itau.folha_pagamento;

-- truncate itau.clientes;

describe itau.clientes;
alter table itau.clientes drop telefone_cliente;



















