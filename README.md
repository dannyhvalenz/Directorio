# Directorio
Proyecto para la materia de Principios de Construcción de Software para modelado de aplicación java de un directorio telefonico

## Requerimientos
* [ ] El sistema deberá almacenar contactos
* [ ] Se podrán agregar contactos
* [ ] Se podrán modificar los contactos
* [ ] Se podrán eliminar los contactos
* [ ] Se podrán consultar los contactos
* [ ] Se podrán realizar busquedas

## Prototipo
Crear contacto
![Prototipo](/docs/Nuevo_Contacto.png)

Consultar/Modificar/Eliminar contacto
![Prototipo](/docs/Consultar_Contacto.png)

## Base de Datos
| Field               | Type         | Null | Key | Default | Extra          |
| ------------------- | ------------ | ---- | --- | ------- | -------------- |
| idContacto          | int(11)      | NO   | PRI | NULL    | auto_increment |
| Nombre              | varchar(255) | NO   |     | NULL    |                |
| Correo electrónico  | varchar(100) | NO   |     | NULL    |                |
| Dirección           | text         | NO   |     | NULL    |                |
| Número Telefónico   | varchar(15)  | NO   |     | NULL    |                |
| Fecha de Nacimiento | date         | NO   |     | NULL    |                |