create table produtos (

	id bigint not null primary key auto_increment,
	nome varchar(100),
	quantidade decimal(9,2),
	valor decimal(9,2)
);