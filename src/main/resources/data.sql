DROP table IF EXISTS peliculas, salas;

create table peliculas(
	codigo int auto_increment primary key,
    nombre nvarchar(100),
    edad int
);

create table salas(
	codigo int auto_increment primary key,
    codigo_pelicula int,
    nombre nvarchar(100),
    constraint fk_sala foreign key(codigo_pelicula) references peliculas(codigo)
);

insert into peliculas(nombre, edad)values('Marvels Spider-man', 12);
insert into peliculas(nombre, edad)values('Minecraft', 3);
insert into peliculas(nombre, edad)values('Monster Killers', 18);
insert into salas(codigo_pelicula, nombre)values(1, 'Sala1');
insert into salas(codigo_pelicula, nombre)values(2, 'Sala2');
insert into salas(codigo_pelicula, nombre)values(3, 'Sala3');