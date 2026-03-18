EJERCICIO REALIZADO POR MARTA GONZÁLEZ GONZÁLEZ PARA LA ACTIVIDAD TAREA EVALUACIÓN MÓDULO 14 (ENTORNOS DE DESARROLLO)

Pruebas unitarias sobre ValidadorRegistro

En este proyecto se han desarrollado una serie de pruebas unitarias sobre la clase ValidadorRegistro, que se encuentra en el código principal. Esta clase implementa distintos métodos de validación relacionados con el registro de usuarios, como la comprobación de nombre, contraseña, email y edad.

Para poder realizar correctamente las pruebas, se ha completado la implementación de algunos métodos dentro de ValidadorRegistro, asegurando que cada validación devuelva un valor booleano coherente según los datos introducidos.

Además, el repositorio original no incluía la estructura de pruebas, por lo que se ha creado manualmente la carpeta test dentro de src, junto con el paquete correspondiente, para poder añadir la clase de testing.

A partir de esta base, se ha creado la clase ValidadorRegistroTest utilizando JUnit 5. En ella se han probado distintos casos tanto válidos como inválidos para comprobar que la lógica funciona correctamente en cada situación.

Los tests se han construido utilizando aserciones (assertTrue y assertFalse) para verificar que los métodos devuelven el resultado esperado según los datos introducidos.

Tests realizados

Se han implementado los siguientes casos de prueba:

Nombre válido
Se comprueba que un nombre correcto como "Carlos" es aceptado por el sistema.

Nombre vacío
Se verifica que un nombre vacío es rechazado.

Contraseña de longitud mínima válida
Se prueba una contraseña de exactamente 8 caracteres ("12345678"), que debe ser aceptada.

Contraseña demasiado corta
Se comprueba que una contraseña de menos de 8 caracteres ("Admin") es rechazada.

Email sin formato correcto
Se valida que un email sin arroba ("usuario.gmail.com") es considerado inválido.

Edad mínima permitida
Se comprueba que la edad límite (16 años) es aceptada por el sistema.

Ejecución de los tests

Los tests se pueden ejecutar directamente desde la clase ValidadorRegistroTest en IntelliJ IDEA.
Al ejecutarlos, todos los casos deben pasar correctamente si la lógica de validación está bien implementada.

Tecnologías utilizadas

Java

JUnit 5

Maven
