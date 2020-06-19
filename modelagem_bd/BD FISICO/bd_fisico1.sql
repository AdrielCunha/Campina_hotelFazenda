create database hotel;

use hotel;

show databases;

create table clientes (
  codCliente int key,
  nome varchar(100),
  data_nasc date,
  RG char(12),
  CPF char(15));

create table telefones (
  codTelefone int key,
  codCliente int,
  nome_responsavel varchar(100),
  DDD char(2),
  numero varchar(9),
  foreign key(codCliente)
  references
  clientes(codCliente));

create table dependentes (
  codDependente int key,
  codCliente int,
  nome varchar(100),
  data_nasc date,
  RG char(12),
  foreign key(codCliente)
  references
  Clientes(codCliente));

create table quartos (
  codQuarto int key,
  numero int,
  categoria varchar(20),
  valor_diaria float,
  status varchar(20),
  qtde_cama_casal int,
  qtde_cama_solteiro int);

create table produtos (
  codProduto int key,
  nome varchar(20),
  descricao varchar(200),
  valor float);

create table agendamentos (
  codAgendamento int key,
  codQuarto int,
  codCliente int,
  data_ck_in date,
  data_ck_out date,
  subtotal float,
  foreign key(codQuarto)
  references
  Quartos(codQuarto),
  foreign key(codCliente)
  references
  Clientes(codCliente));

create table reservas (
  codReserva int key,
  codAgendamento int,
  status varchar(20),
  valor_total float,
  forma_pagamento varchar(20),
  foreign key(codAgendamento)
  references
  agendamentos(codAgendamento));

create table pedidos (
  codPedido int key,
  codProduto int,
  codReserva int,
  observacao varchar(200),
  data date,
  hora time,
  valor_total float,
  foreign key(codProduto)
  references
  Produtos(codProduto),
  foreign key(codReserva)
  references
  Reservas(codReserva));

create table dados_cartao(
  codCartao int key,
  codAgendamento int,
  nome_titular varchar(100),
  numero_cartao char(16),
  data_vencimento date,
  dgt_verif int(3),
  foreign key(codAgendamento)
  references
  agendamentos(codAgendamento));

