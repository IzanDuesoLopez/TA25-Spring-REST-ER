DROP table IF EXISTS departamentos, empleados;

create table departamentos (
	codigo int auto_increment,
    nombre nvarchar(100),
    presupuesto int,
    primary key(codigo)
);

create table empleados (
	dni varchar(8) primary key, 
	nombre nvarchar(100), 
	apellidos nvarchar(255), 
	departamento int, 
	foreign key (departamento) references departamentos (codigo)
    on delete cascade on update cascade
);

insert into departamentos(nombre, presupuesto)values('Reus', 2000);
insert into departamentos(nombre, presupuesto)values('Tarragona', 250);
insert into departamentos(nombre, presupuesto)values('Salou', 5678);
insert into departamentos(nombre, presupuesto)values('Vila-Seca', 3500);
insert into departamentos(nombre, presupuesto)values('Cambrils', 1290);
insert into empleados(dni, nombre, apellidos, departamento)values('12345678', 'Pepe', 'Pepi', 1);
insert into empleados(dni, nombre, apellidos, departamento)values('87654321', 'Izan', 'Dueso', 2);
insert into empleados(dni, nombre, apellidos, departamento)values('11112222', 'Joel', 'Romero', 3);
insert into empleados(dni, nombre, apellidos, departamento)values('33334444', 'EquipoTres', 'Interviews', 4);
insert into empleados(dni, nombre, apellidos, departamento)values('55556666', 'Logan', 'Law', 5);