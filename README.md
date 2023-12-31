# Sistema-Administrativo-para-la-Federacion-Latinoamericana-de-Colecciones-de-Cultivo
Sistema administrativo capaz de agregar, actualizar, buscar y eliminar información en la base de datos de la FELACC y mostrar su información en el sitio web, creado principlamente con ***Java***, ***HTML***, ***CSS***, ***JavaScript***, ***Maven*** y ***Servlets***.

### Autor
Daniela Rodríguez 

### Pasos para usar Servlets conectados a una base de datos

- Añadir las dependencias Java con el driver de la base de datos con ***JDBC***: consiste en añadir ciertos archivos con extensión ***.jar*** que contienen las librerías necesarias para que funcione JDBC con la base de datos que  quieres conectar en este caso ***postgres***.
- Crear la clase para la ****conexión a la bd***: usualmente esta es una clase de Java en la que se configuran todos los parámetros para conectarse a la base de datos (nombre de la base, usuario, password). En esta parte se suele  usar  una URL, que para el caso de postgres es de la siguiente forma: ***jdbc:postgresql://localhost:PUERTO_BASE_DATOS/NOMBRE_BASE_DATOS***
donde PUERTO_BASE_DATOS es el puerto en el que está la base de datos, usualmente este es 5432 y NOMBRE_BASE_DATOS es el nombre de la base de datos en la que se va a guardar la información.
- Crear el ***DAO*** para hacer el CRUD (consultas y modificaciones a la base de datos): Esta es una clase que hace uso de los métodos de JDBC para hacer consultas y modificar la información que necesitas.
  
### Especificaciones del MVC (Modelo Vista Controlador)
- Para desarrollar el proyecto se utilizó el ***MVC (Modelo Vista Controlador)***, el cual es un patrón de diseño de software que sirve para clasificar la información, la lógica del sistema y la interfaz que se presenta al usuario.
- ***Modelo***: gestiona, actualiza, hace consultas, busca y filtra los datos de la ***base de datos***.
- ***Vista***: le muestra al usuario final las páginas y formularios que solicitó, por lo que se puede decir que es el componente encargado del frontend, ya que así se encuentran los archivos ***HTM***L, ***CSS*** y ***JavaScript***.
- ***Controlador***: gestiona las instrucciones que se reciben y las procesa, el controlador es el que se comunica con el modelo y las vistas para solicitar los datos necesarios para manipularlos y obtener los ***resultados que se muestran en la vista***.

### Estructura recomendada
- Para ejecutar el proyecto es necesario crear un peoyecto ***Maven***, el código HTML, CSS, JavaScript, recomiendo agregarlo en la carpeta ***webapp***, teniendo en cuenta que debido a las consultas que se realizan en la base de datos los archivos html deberan campiarse por ***.jsp***
- Los archivos de la base de datos ***base.sql*** recomiendo agregarlos dentro de la carpeta resources, en una carpeta que se llame ***db***.
- Los servlets recomiendo agregarlos en la carpeta ***Java*** del proyecto Maven, dentro de una carpeta llamada servlets.
- Es necesario agregar las siguientes dependencias de maven al archivo ***pom.xml*** para que funcione lo de ***JDBC*** con ***postgres***.
![dependencias](https://github.com/DanielaRdzM/Sistema-Administrativo-para-la-Federacion-Latinoamericana-de-Colecciones-de-Cultivo/assets/148818863/ac5d5242-c9a0-48e2-a806-4c991a5043f3)

### Visualización del sistema administrativo

Login

![login](https://github.com/DanielaRdzM/Sistema-Administrativo-para-la-Federacion-Latinoamericana-de-Colecciones-de-Cultivo/assets/148818863/cc7cef37-2c86-4f8a-bce8-3b7fa12ff5b3)

Menú principal

![Menu principal](https://github.com/DanielaRdzM/Sistema-Administrativo-para-la-Federacion-Latinoamericana-de-Colecciones-de-Cultivo/assets/148818863/86f4e8e8-a342-4524-a76f-d62bb5addb6f)

Menú de opciones de la sección socios

![Menu de opciones](https://github.com/DanielaRdzM/Sistema-Administrativo-para-la-Federacion-Latinoamericana-de-Colecciones-de-Cultivo/assets/148818863/57ed2116-ad03-44b4-9d1e-29893d9ebb5a)

Formulario para registrar 

![agregar](https://github.com/DanielaRdzM/Sistema-Administrativo-para-la-Federacion-Latinoamericana-de-Colecciones-de-Cultivo/assets/148818863/79b9fc26-c6b4-4237-84e6-02aba70773ce)

Socios registrados

![Socios](https://github.com/DanielaRdzM/Sistema-Administrativo-para-la-Federacion-Latinoamericana-de-Colecciones-de-Cultivo/assets/148818863/b1e3d090-cbc3-4ef4-804f-f3828a7e251f)

Opción para actualizar información

![actualizar](https://github.com/DanielaRdzM/Sistema-Administrativo-para-la-Federacion-Latinoamericana-de-Colecciones-de-Cultivo/assets/148818863/7a7a89ea-46c9-4eb6-8481-02835125fad6)

Formulario para actualizar información 

![Actualizar info](https://github.com/DanielaRdzM/Sistema-Administrativo-para-la-Federacion-Latinoamericana-de-Colecciones-de-Cultivo/assets/148818863/35a47da2-3d99-44bc-accc-c5450c64db54)

Opción para eliminar registros
![eliminar](https://github.com/DanielaRdzM/Sistema-Administrativo-para-la-Federacion-Latinoamericana-de-Colecciones-de-Cultivo/assets/148818863/404c945f-7b4e-4a44-90cc-e14f1d080cf7)

Buscar registros específicos
![buscar](https://github.com/DanielaRdzM/Sistema-Administrativo-para-la-Federacion-Latinoamericana-de-Colecciones-de-Cultivo/assets/148818863/c460232b-8b6a-44bd-a207-d754e8a2f825)

Video con la funcionalidad del sistema

[![Alt text](https://img.youtube.com/vi/W6kIhmXgmrE/0.jpg)](https://www.youtube.com/watch?v=W6kIhmXgmrE)

### Diagramas sistema administrativo

Diagrama con la definición general del sistema
![Definición del sistema](https://github.com/DanielaRdzM/Sistema-Administrativo-para-la-Federacion-Latinoamericana-de-Colecciones-de-Cultivo/assets/148818863/e2c04bbf-e3a5-483a-af15-2aefc8c63ed3)

Diagrama con las funciones del sistema
![Funciones del sistema](https://github.com/DanielaRdzM/Sistema-Administrativo-para-la-Federacion-Latinoamericana-de-Colecciones-de-Cultivo/assets/148818863/98160578-ee27-40f6-a059-6dc4d15c7f58) 

Caso de uso para el login

![Caso de uso login](https://github.com/DanielaRdzM/Sistema-Administrativo-para-la-Federacion-Latinoamericana-de-Colecciones-de-Cultivo/assets/148818863/7547b4c3-358d-4277-9880-b0b5a5e13526)

Caso de uso para las funciones CRUD

![Caso de uso funciones](https://github.com/DanielaRdzM/Sistema-Administrativo-para-la-Federacion-Latinoamericana-de-Colecciones-de-Cultivo/assets/148818863/31ed4e7e-db93-4364-9fc3-3fddd423cd6d)

Diseño de la base de datos

![estructura bd](https://github.com/DanielaRdzM/Sistema-Administrativo-para-la-Federacion-Latinoamericana-de-Colecciones-de-Cultivo/assets/148818863/11ac3966-4e94-4d73-bdc6-0da5a95fa716)

Estructura del proyecto Maven

![Estructura Maven](https://github.com/DanielaRdzM/Sistema-Administrativo-para-la-Federacion-Latinoamericana-de-Colecciones-de-Cultivo/assets/148818863/7dafead3-aa5a-4b7d-b04e-4c22c82e6154)

MVC (Modelo Vista Controlador) 
![MVC](https://github.com/DanielaRdzM/Sistema-Administrativo-para-la-Federacion-Latinoamericana-de-Colecciones-de-Cultivo/assets/148818863/826bb4ce-53b8-415c-927a-f2d9726f23a5)

Diagrama de secuencia para el login

![Diagrama de secuencia login](https://github.com/DanielaRdzM/Sistema-Administrativo-para-la-Federacion-Latinoamericana-de-Colecciones-de-Cultivo/assets/148818863/3833e3b1-9012-4659-b855-678ea8541d18)

Diagrama de secuencia de las funciones del sistema

![Diagrama de secuencia funciones](https://github.com/DanielaRdzM/Sistema-Administrativo-para-la-Federacion-Latinoamericana-de-Colecciones-de-Cultivo/assets/148818863/cac1ecec-fad7-43ae-8295-d666696e75db)
