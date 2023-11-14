# Sistema-Administrativo-para-la-Federacion-Latinoamericana-de-Colecciones-de-Cultivo
Sistema administrativo capaz de agregar, actualizar, buscar y eliminar información en la base de datos de la FELACC y mostrar su información en el sitio web, creado principlamente con ***Java***, ***HTML***, ***CSS***, ***JavaScript***, ***Maven*** y ***Servlets***.

### Autor
Daniela Rodríguez 

### Pasos para usar Servlets conectados a una base de datos

- Añadir las dependencias Java con el driver de la base de datos con ***JDBC***: consiste en añadir ciertos archivos con extensión ***.jar*** que contienen las librerías necesarias para que funcione JDBC con la base de datos que  quieres conectar en este caso ***postgres***.
- Crear la clase para la ****conexión a la bd***: usualmente esta es una clase de Java en la que se configuran todos los parámetros para conectarse a la base de datos (nombre de la base, usuario, password). En esta parte se suele  usar  una URL, que para el caso de postgres es de la siguiente forma: ***jdbc:postgresql://localhost:PUERTO_BASE_DATOS/NOMBRE_BASE_DATOS***
donde PUERTO_BASE_DATOS es el puerto en el que está la base de datos, usualmente este es 5432 y NOMBRE_BASE_DATOS es el nombre de la base de datos en la que se va a guardar la información.
- Crear el ***DAO*** para hacer el CRUD (consultas y modificaciones a la base de datos): Esta es una clase que hace uso de los métodos de JDBC para hacer consultas y modificar la información que necesitas.
  
### Especificaciones 
- Para ejecutar el proyecto es necesario crear un peoyecto ***Maven***, el código HTML, CSS, JavaScript, recomiendo agregarlo en la carpeta ***webapp***, teniendo en cuenta que debido a las consultas que se realizan en la base de datos los archivos html deberan campiarse por ***.jsp***
- Los archivos de la base de datos ***base.sql*** recomiendo agregarlos dentro de la carpeta resources, en una carpeta que se llame ***db***.
- Los servlets recomiendo agregarlos en la carpeta ***Java*** del proyecto Maven, dentro de una carpeta llamada servlets.
- Es necesario agregar las siguientes dependencias de maven al archivo ***pom.xml*** para que funcione lo de ***JDBC*** con ***postgres***.
![dependencias](https://github.com/DanielaRdzM/Sistema-Administrativo-para-la-Federacion-Latinoamericana-de-Colecciones-de-Cultivo/assets/148818863/ac5d5242-c9a0-48e2-a806-4c991a5043f3)

###


### Visualización del sistema administrativo
