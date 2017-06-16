# CRUD-Java-MySQL

Aplicación Java en modo gráfico, para crear un mantenimiento sencillo hacia una tabla de una base de datos.

#

1.  Agregar un registro.
2.  Modificar un registro.
3.  Eliminar un registro.
4.  Mostrar el contenido de la tabla.

Tema: Ferretería
-     Tabla: Categorías
#

El gestor de base de datos es MySQL, on entorno XAMPP.
``` sql 
create database ferreteria

CREATE TABLE `categorias` (
`ID_catego` int(11) NOT NULL,
`Nom_catego` varchar(20) NOT NULL,
`Nom_Produ` varchar(30) NOT NULL,
`Stock` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

```
