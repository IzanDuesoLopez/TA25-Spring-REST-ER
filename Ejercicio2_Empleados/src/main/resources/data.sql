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
insert into empleados(dni, nombre, apellidos, departamento)values('12345678', 'Pepe', 'Pepi', 1);