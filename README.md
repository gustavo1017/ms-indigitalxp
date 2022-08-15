# Getting Started

El proyecto se conecta a mysql 5.7.37 usando MyBatis para la persistencia, se utilizo java 11 y maven 3.8.4 como gestor de dependencias

Se necesita tener instalado lombock, especificar en el IDE que se va usar

Antes de desplegar se necesita ejecutar los query de la creación de la BD y la tabla que se encuentra en el archivo QUERY.md ubicado en el proyecto, cambiar la clave y el usuario en el archivo de propiedades por los propios

Se tiene que contar con un IDE de desarrollo para el despliegue en local

El proyecto se despliega en http://localhost:8080

Se creo un controlador con 3 operaciones, buscar al cliente por dni o email, listar indicadores, crear un cliente

Los query que se utilizan estan el archivo CustomerMapper.xml
