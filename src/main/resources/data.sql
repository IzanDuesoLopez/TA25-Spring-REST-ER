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
insert into Fabricantes(nombre)values('NVidia');
insert into Fabricantes(nombre)values('AMD');
insert into Fabricantes(nombre)values('CoolerMaster');
insert into Fabricantes(nombre)values('Corsair');
insert into Articulos(nombre, precio, fabricante)values('i9_12900k', 500, 1);
insert into Articulos(nombre, precio, fabricante)values('RTX_3090ti', 2600, 2);
insert into Articulos(nombre, precio, fabricante)values('Ryzen_9_5950X', 750, 3);
insert into Articulos(nombre, precio, fabricante)values('CM_HP500', 250, 4);
insert into Articulos(nombre, precio, fabricante)values('RMX_750W', 199, 5);