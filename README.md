<div align="center">

# 🎀 <font color="#FF69B4">EJERCICIO: TAREA EVALUACIÓN MÓDULO 14</font> 🎀
### 🌸 <font color="#FF1493">Entornos de Desarrollo</font> 🌸

**Realizado por:** ✨ **Marta González González** ✨

---

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![JUnit 5](https://img.shields.io/badge/JUnit%205-25A162?style=for-the-badge&logo=junit5&logoColor=white)](https://junit.org/junit5/)
[![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)](https://maven.apache.org/)

</div>

## 📸 <font color="#FF69B4">Captura de los Tests Validados</font>

<img width="1496" height="1290" alt="captura-test-validados" src="https://github.com/user-attachments/assets/4018e043-15fd-4025-ab80-54fb99aa26d3" />


---

## 📝 <font color="#FF69B4">Descripción del Proyecto</font>

Este proyecto consiste en el desarrollo de una batería de **pruebas unitarias** sobre la clase `ValidadorRegistro`. El objetivo principal es asegurar la integridad y el correcto funcionamiento de los métodos de validación de usuarios.

### 🛠️ <font color="#FF69B4">Implementación y Estructura</font>

Para garantizar un entorno de pruebas robusto, se han realizado las siguientes acciones:

* **Completado de Lógica:** Se implementaron los métodos necesarios en `ValidadorRegistro` para que las validaciones (nombre, email, edad, etc.) devuelvan valores booleanos coherentes.
* **Organización del Proyecto:** Se creó manualmente la carpeta `src/test` y su correspondiente estructura de paquetes, ya que el repositorio original no contaba con ella.
* **Testing con JUnit 5:** Creación de la clase `ValidadorRegistroTest`, utilizando aserciones como `assertTrue` y `assertFalse`.

---

## ✅ <font color="#FF69B4">Tests Realizados</font>

Se han diseñado casos de prueba tanto para entradas válidas como inválidas:

| Caso de Prueba | Descripción | Resultado Esperado |
| :--- | :--- | :--- |
| **Nombre válido** | Nombre estándar (ej. "Carlos"). | `true` |
| **Nombre vacío** | Campo de nombre sin contenido. | `false` |
| **Password Límite** | Contraseña de exactamente 8 caracteres. | `true` |
| **Password Corto** | Contraseña de menos de 8 caracteres. | `false` |
| **Email Inválido** | Formato de correo sin el símbolo `@`. | `false` |
| **Edad Mínima** | Usuario con la edad límite (16 años). | `true` |

---

## 🚀 <font color="#FF69B4">Ejecución de los Tests</font>

Para verificar el proyecto, sigue estos pasos:
1. Abre el proyecto en **IntelliJ IDEA**.
2. Navega hasta `src/test/java/.../ValidadorRegistroTest`.
3. Haz clic derecho y selecciona **Run 'ValidadorRegistroTest'**.
4. Verifica que todos los checks aparezcan en verde.

---

<div align="center">
<font color="#FF69B4"><i>Proyecto finalizado con éxito para la asignatura de Entornos de Desarrollo.</i></font>
<br>
🌸 2024 🌸
</div>
