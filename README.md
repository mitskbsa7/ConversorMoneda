# conversorDeMonedas
##### Introducción

Este proyecto presenta un sencillo convertidor de monedas que permite a los usuarios realizar conversiones entre diferentes divisas utilizando una API externa. El código está escrito en Java y emplea la biblioteca Gson para manejar las respuestas JSON.

##### Funcionalidades:

Conversión entre USD y otras divisas (ARS, BRL, COP, MXN) Interfaz de usuario simple para ingresar la cantidad y la moneda de origen Manejo de errores para solicitudes API fallidas o datos no válidos

##### Requisitos:

-Java instalado

-Biblioteca Gson

##### Instrucciones de uso:

###### 1-Clonar el repositorio:

git clone https://github.com/mitskbsa7

###### 2-Importar el proyecto en IntelliJ:

Abra IntelliJ IDEA y seleccione "Abrir proyecto".

Navegue hasta la carpeta clonada del repositorio y seleccione el directorio convertidor-monedas.

Haga clic en "Abrir" para importar el proyecto en IntelliJ.

###### 3-Configurar la biblioteca Gson:

En IntelliJ, navegue hasta File > Settings > Modules.

Seleccione el módulo convertidor-monedas en la lista.

En la pestaña Dependencies, haga clic en el signo "+" y seleccione "JARs or directories".

Navegue hasta la carpeta lib dentro del directorio del proyecto y seleccione el archivo JAR de la biblioteca Gson (por ejemplo, gson-2.14.1.jar).

Haga clic en "OK" para agregar la biblioteca Gson al proyecto.

###### 4-Ejecutar el programa:

En IntelliJ, navegue hasta Run > Run Configuration.

Seleccione la clase com.example.convertidormonedas.Main como la clase principal para ejecutar.

Haga clic en **"Run"` para ejecutar el convertidor de monedas.

##### Uso del convertidor:

Siga las instrucciones en pantalla para ingresar la cantidad que desea convertir y la moneda de origen. El programa calculará la conversión y la mostrará en pantalla.

##### Ejemplo de uso:

Bienvenido(a) a nuestro Conversor de Divisas

Ingrese el número de la opción deseada: *
1 - USD a ARS

2 - USD a BRL

3 - USD a COP

4 - USD a MXN

5 - MXN a USD

6 - BRL a USD

7 - ARS a USD

8 - COP a USD

9 - Salir

Ingrese la opción deseada: 1

Ingrese el monto a convertir: 100

La conversión de 100 USD a ARS es: 838.50

¿Desea realizar otra conversión? (y/n): n

Gracias por hacer uso de nuestro servicio. ¡Excelente dia, esperamos vuelva pronto!

##### Contribuciones:

Se aprecian contribuciones y sugerencias para mejorar este proyecto. Puede abrir issues en el repositorio de GitHub o enviar solicitudes de pull con sus cambios.

##### Licencia:

Este proyecto está licenciado bajo la licencia MIT.

##### Recursos:

API Exchangerate

Biblioteca Gson

Espero que este convertidor de monedas le sea útil. c:
