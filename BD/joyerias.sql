create database joyerias;

use joyerias


create table personas(
codigo int not null auto_increment primary key,
cedula int(10) not null,
nombres varchar(25) not null,
ape_pat varchar(25) not null,
ape_mat varchar(25) not null,
telefono int(9),
celular  int(10),
direccion varchar(50),
estado	 int(5)
);

create table usuarios(
codigo_usu int not null auto_increment primary key,
cedula	int(10) not null,
nombre_usuario varchar(25) not null,
clave_usuario	varchar(15) not null,
privilegio		varchar(25) not null,
foreign key(cedula) references personas(cedula)
);


create table clientes(
codigo_cliente int not null auto_increment primary key,
cedula	int(10) not null,
foreign key(cedula) references personas(cedula)
);

create table empresas(
nombre_empresa varchar(30),
gerente			varchar(30),
direccion		varchar(50),
telefono		int (10)
);

create table productos(
codigo_productos int  not null auto_increment primary key,
productos varchar(50) not null,
precio		float
);
create table maestros(
codigo_maestro int not null auto_increment primary key,
cedula int(10) not null,
foreign key(cedula) references personas(cedula)
);


drop table pedidos;
create table pedidos(
codigo_pedido int not null auto_increment primary key,
fecha_pedido  varchar(12) not null,
fecha_entrega varchar(12) not null,
hora_entrega  varchar(12),
cedula			int (10),
pedido 		varchar (70) not null,
precio		  float		 not null,
abono		  float		 not null,
total		  float		 not null,
estado 		varchar(20)  not null,
cedula_maestro 	int(10) not null,
foreign key (cedula) references clientes (cedula),
foreign key (cedula_maestro) references maestros(cedula)
);






////////////////////////////////////////////////
select CONCAT(personas.nombres,' ',personas.ape_pat)AS nombre_cli,pedidos.precio,pedidos.pedido,pedidos.abono,pedidos.total,pedidos.fecha_entrega,pedidos.hora_entrega from personas,clientes,pedidos
where personas.cedula=clientes.cedula
AND   personas.cedula=pedidos.cedula
AND   pedidos.fecha_entrega='28/03/2015';
AND   personas.cedula=maestros.cedula;



select usuarios.cedula, CONCAT(personas.nombres,' ',personas.ape_pat)AS nombre_usu, usuarios.nombre_usuario,usuarios.clave_usuario, usuarios.privilegio from usuarios, personas
where personas.cedula = usuarios.cedula;


select CONCAT(personas.nombres,' ', personas.ape_pat) AS maestro from personas,maestros 
where personas.cedula = maestros.cedula;

select maestros.cedula, CONCAT(personas.nombres,' ',personas.ape_pat)AS nombre_maestro from maestros, personas
where personas.cedula = maestros.cedula;


