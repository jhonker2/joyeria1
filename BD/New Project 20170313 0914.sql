-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.5.5-10.1.10-MariaDB


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema joyerias
--

CREATE DATABASE IF NOT EXISTS joyerias;
USE joyerias;

--
-- Definition of table `cabecera`
--

DROP TABLE IF EXISTS `cabecera`;
CREATE TABLE `cabecera` (
  `codigo` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `cedula_cliente` varchar(45) NOT NULL,
  `Abono` double NOT NULL,
  `Total` double NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cabecera`
--

/*!40000 ALTER TABLE `cabecera` DISABLE KEYS */;
INSERT INTO `cabecera` (`codigo`,`cedula_cliente`,`Abono`,`Total`) VALUES 
 (6,'1311718181',13,2),
 (7,'1311718181',60,10);
/*!40000 ALTER TABLE `cabecera` ENABLE KEYS */;


--
-- Definition of table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
CREATE TABLE `clientes` (
  `codigo_cliente` int(11) NOT NULL AUTO_INCREMENT,
  `cedula` int(10) NOT NULL,
  PRIMARY KEY (`codigo_cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `clientes`
--

/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` (`codigo_cliente`,`cedula`) VALUES 
 (1,1312216318),
 (3,1311718181);
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;


--
-- Definition of table `empresas`
--

DROP TABLE IF EXISTS `empresas`;
CREATE TABLE `empresas` (
  `nombre_empresa` varchar(30) DEFAULT NULL,
  `gerente` varchar(30) DEFAULT NULL,
  `direccion` varchar(50) DEFAULT NULL,
  `telefono` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `empresas`
--

/*!40000 ALTER TABLE `empresas` DISABLE KEYS */;
INSERT INTO `empresas` (`nombre_empresa`,`gerente`,`direccion`,`telefono`) VALUES 
 ('Joyeria Guaman','Luis','portoviejo	',656567);
/*!40000 ALTER TABLE `empresas` ENABLE KEYS */;


--
-- Definition of table `maestros`
--

DROP TABLE IF EXISTS `maestros`;
CREATE TABLE `maestros` (
  `codigo_maestro` int(11) NOT NULL AUTO_INCREMENT,
  `cedula` int(10) NOT NULL,
  PRIMARY KEY (`codigo_maestro`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `maestros`
--

/*!40000 ALTER TABLE `maestros` DISABLE KEYS */;
INSERT INTO `maestros` (`codigo_maestro`,`cedula`) VALUES 
 (1,1314888015);
/*!40000 ALTER TABLE `maestros` ENABLE KEYS */;


--
-- Definition of table `movimiento`
--

DROP TABLE IF EXISTS `movimiento`;
CREATE TABLE `movimiento` (
  `codigo` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `id_cabecera` int(10) unsigned NOT NULL,
  `descripcion` varchar(45) NOT NULL,
  `precio` double NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `movimiento`
--

/*!40000 ALTER TABLE `movimiento` DISABLE KEYS */;
INSERT INTO `movimiento` (`codigo`,`id_cabecera`,`descripcion`,`precio`) VALUES 
 (4,6,'Dije de Nombre Josselyn',15),
 (5,7,'Anillo de Grado\nEn oro \nCon nombre pedro',70);
/*!40000 ALTER TABLE `movimiento` ENABLE KEYS */;


--
-- Definition of table `pedidos`
--

DROP TABLE IF EXISTS `pedidos`;
CREATE TABLE `pedidos` (
  `codigo_pedido` int(11) NOT NULL AUTO_INCREMENT,
  `fecha_pedido` varchar(12) NOT NULL,
  `fecha_entrega` varchar(12) NOT NULL,
  `hora_entrega` varchar(12) DEFAULT NULL,
  `cedula` int(10) DEFAULT NULL,
  `pedido` varchar(70) NOT NULL,
  `precio` float NOT NULL,
  `abono` float NOT NULL,
  `total` float NOT NULL,
  `estado` varchar(20) NOT NULL,
  `cedula_maestro` int(10) NOT NULL,
  PRIMARY KEY (`codigo_pedido`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pedidos`
--

/*!40000 ALTER TABLE `pedidos` DISABLE KEYS */;
INSERT INTO `pedidos` (`codigo_pedido`,`fecha_pedido`,`fecha_entrega`,`hora_entrega`,`cedula`,`pedido`,`precio`,`abono`,`total`,`estado`,`cedula_maestro`) VALUES 
 (1,'8/03/2017','10/03/2017','10:00',1312216318,'anillo',40,10,30,'No entregado',1314888015),
 (2,'10/03/2017','11/03/2017','10:00',1312216318,'Anillo de Grado',100,50,30,'No entregado',1314888015),
 (3,'10/03/2017','12/03/2017','12:00',1311718181,'Dije de Nombre Josselyn',15,13,2,'Entregado',1314888015),
 (4,'10/03/2017','13/03/2017','1:00',1311718181,'Anillo de Grado\nEn oro \nCon nombre pedro',70,60,10,'Entregado',1314888015);
/*!40000 ALTER TABLE `pedidos` ENABLE KEYS */;


--
-- Definition of table `personas`
--

DROP TABLE IF EXISTS `personas`;
CREATE TABLE `personas` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `cedula` int(10) NOT NULL,
  `nombres` varchar(25) NOT NULL,
  `ape_pat` varchar(25) NOT NULL,
  `ape_mat` varchar(25) NOT NULL,
  `telefono` int(9) DEFAULT NULL,
  `celular` int(10) DEFAULT NULL,
  `direccion` varchar(50) DEFAULT NULL,
  `estado` int(5) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `personas`
--

/*!40000 ALTER TABLE `personas` DISABLE KEYS */;
INSERT INTO `personas` (`codigo`,`cedula`,`nombres`,`ape_pat`,`ape_mat`,`telefono`,`celular`,`direccion`,`estado`) VALUES 
 (1,1312320466,'jhony','Guaman','Iza',2656567,988853700,'cdla la paz',1),
 (2,1312216318,'Danny','Macias','alvarado',65656565,982342341,'guabito',1),
 (3,1314888015,'Kerly','Valdiviezo','Sornoza',656567,988853700,'cdla la paz',1),
 (4,1311718181,'Jandry ','Navarrete ','Mendoza',555555,9877228,'Colon',1),
 (6,1706021092,'Pep','Po','Po',55555,9999999,'portoviejo',0);
/*!40000 ALTER TABLE `personas` ENABLE KEYS */;


--
-- Definition of table `productos`
--

DROP TABLE IF EXISTS `productos`;
CREATE TABLE `productos` (
  `codigo_productos` int(11) NOT NULL AUTO_INCREMENT,
  `productos` varchar(50) NOT NULL,
  `precio` float DEFAULT NULL,
  PRIMARY KEY (`codigo_productos`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `productos`
--

/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;


--
-- Definition of table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE `usuarios` (
  `codigo_usu` int(11) NOT NULL AUTO_INCREMENT,
  `cedula` int(10) NOT NULL,
  `nombre_usuario` varchar(25) NOT NULL,
  `clave_usuario` varchar(15) NOT NULL,
  `privilegio` varchar(25) NOT NULL,
  PRIMARY KEY (`codigo_usu`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `usuarios`
--

/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` (`codigo_usu`,`cedula`,`nombre_usuario`,`clave_usuario`,`privilegio`) VALUES 
 (1,1312320466,'jhonker','123456','Admin'),
 (3,1706021092,'usuario','usuario','Emple');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
