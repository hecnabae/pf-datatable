# Primefaces/Gradle starter #

**Aplicación Web Primefaces/Gradle sobre IntelliJ IDEA**

Este proyecto está pensado parar trabajar en el entorno IntelliJ IDEA, utilizando Gradle como sistema de gestión de dependencias y utilizando el proyecto Primefaces.
Así mismo, representa un punto de partida para quienes necesiten crear un proyecto Primefaces bajo IntelliJ IDEA.

### ¿Cómo utilizar? ###
Clonar el proyecto y ejecutarlo un servidor como Tomcat o glassfish. 
Para agregar dependencias, utilice el fichero build.gradle. 
En el caso que necesite agregar dependencias que no estén disponibles en ningún repositorio, introduzcalas en el directorio libs, gradle se encargará de importarlas al proyecto automáticamente.

    repositories {
        mavenCentral()
        flatDir {
            dirs 'libs'
        }
    }
    
Incluye tus ficheros java en el directorio 'main/java'. Ya existe un paquete creado es.hecnabae.pf, el cual puedes modificar o eliminar.