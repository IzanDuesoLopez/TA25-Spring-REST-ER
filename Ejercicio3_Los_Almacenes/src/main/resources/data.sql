DROP table IF EXISTS almacenes, cajas;

create table almacenes (
	codigo int auto_increment primary key,
    lugar nvarchar(100),
    capacidad int
	);
    
create table cajas (
	num_referencia char(5) primary key,
    contenido nvarchar(100),
    valor int,
    codigo_almacen int,
	foreign key (codigo_almacen) references almacenes (codigo)
	);

insert into almacenes(lugar, capacidad)values('Reus', 2000);
insert into cajas(num_referencia, contenido, valor, codigo_almacen)values('aaaa', 'Leche', 300, 1);