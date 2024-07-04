# CAMBIO DE BD H2 A POSTGRES EN PROYECTO HOTELS
En este proyecto, se realiza la migración de la base de datos H2 a PostgreSQL para mejorar la escalabilidad y el rendimiento. A continuación, se muestra el proceso detallado junto con capturas de pantalla que ilustran los pasos clave.
Antes que nada a continuación se mostrará evidencia de la ejecución del Spring Boot y la interfaz de administración de H2:

![h2](https://raw.githubusercontent.com/mamf1209/hotels/main/images/H2.jpg)

##En el archivo pom.xml, se realizaron ajustes específicos para integrar y configurar PostgreSQL como la base de datos principal para el proyecto. A continuación, se detallan los cambios clave:##

![dependencias](https://raw.githubusercontent.com/mamf1209/hotels/main/images/dependencies.jpg)

## Para migrar de la base de datos H2 a PostgreSQL en el proyecto "Hotels", se realizaron ajustes en el archivo application.properties para configurar correctamente la conexión a PostgreSQL. ##
##Se actualizaron las configuraciones de conexión y otras propiedades relevantes para asegurar la correcta operación con PostgreSQL.##
##Con estos cambios en application.properties, el proyecto "Hotels" está ahora configurado para utilizar PostgreSQL como su base de datos principal, proporcionando una solución robusta y escalable para manejar los datos de la aplicación.##

![properties](https://raw.githubusercontent.com/mamf1209/hotels/main/images/App%20properties.jpg)


Para migrar de H2 a PostgreSQL en el proyecto "Hotels", se realizaron ajustes en el archivo data.sql para asegurar la compatibilidad con la sintaxis específica de PostgreSQL.

![data](https://raw.githubusercontent.com/mamf1209/hotels/main/images/datasql.jpg)


A continuación se muestra la ejecución del proyecto "Hotels" utilizando Spring Boot con PostgreSQL como base de datos. Se incluyen capturas de pantalla que muestran:

Ejecución de Spring Boot: Captura de pantalla que muestra la consola de ejecución de Spring Boot, confirmando que la aplicación se ha iniciado correctamente.

![springpostgres](https://raw.githubusercontent.com/mamf1209/hotels/main/images/spring%20postgres.jpg)

Página de PostgreSQL: Captura de pantalla que muestra la interfaz donde se visualiza la estructura de la base de datos hotels y los datos insertados en la tabla hotel.

![pagina](https://raw.githubusercontent.com/mamf1209/hotels/main/images/localhost2.jpg)

Consulta GET en Postman: Captura de pantalla que muestra una solicitud GET realizada a la API del proyecto "Hotels" utilizando Postman. Esta solicitud verifica que los datos de la base de datos PostgreSQL se recuperan correctamente a través de la API.

![postman](https://raw.githubusercontent.com/mamf1209/hotels/main/images/postman.jpg)

