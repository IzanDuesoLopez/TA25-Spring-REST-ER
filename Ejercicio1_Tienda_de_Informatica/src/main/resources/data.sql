DROP table IF EXISTS fabricantes, articulos;

create table fabricantes(
	codigo int auto_increment primary key,
    nombre nvarchar(100)
);

create table articulos(
	codigo int auto_increment primary key,
    nombre nvarchar(100),
    precio int,
    fabricante int,
    foreign key (fabricante) references Fabricantes(codigo)
);

insert into Fabricantes(nombre)values('Intel');
insert into Articulos(nombre, precio, fabricante)values('i9 12900k', 500, 1);