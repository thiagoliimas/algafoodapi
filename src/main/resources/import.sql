# Nesse arquivo é coloxado instruções sql que serão executadas ao iniciar a aplicação.

insert into cozinha (id, nome) values (1, 'Tailandesa');
insert into cozinha (id, nome) values (2, 'Indiana');

insert into restaurante (nome, taxa_frete, cozinha_id) values ('Freitas Pizzaria', 2.00, 1);
insert into restaurante (nome, taxa_frete, cozinha_id) values ('Mandacaru', 5.00, 2);
insert into restaurante (nome, taxa_frete, cozinha_id) values ('Landuá', 5.00, 2);
insert into restaurante (nome, taxa_frete, cozinha_id) values ('Guttos', 3.00, 1);

insert into forma_pagamento (descricao) values ('Pix');
insert into forma_pagamento (descricao) values ('Cartão');

insert into permissao (nome) values ('Administrador');
insert into permissao (nome) values ('Auditor');

insert into estado (nome, sigla) values ('Ceará', 'CE');
insert into estado (nome, sigla) values ('Rio Grande do Norte', 'RN');

insert into cidade (nome, estado_id) values ('Russas', 1);
insert into cidade (nome, estado_id) values ('Mossoró', 2);