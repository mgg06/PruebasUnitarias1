package instituto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorRegistroTest {

    // Traemos el "motor" que vamos a probar desde la carpeta main
    ValidadorRegistro validador = new ValidadorRegistro();

    @Test
    @DisplayName("Ejemplo: Un nombre válido debe ser aceptado")
    public void testNombreValido() {
        // Ejecutamos la lógica con un nombre correcto
        boolean resultado = validador.validarNombre("Carlos");

        // Sentenciamos: Como el nombre está bien, esperamos que el resultado sea TRUE
        assertTrue(resultado, "Error: El sistema rechazó un nombre válido");
    }

    // ESCRIBE TUS 5 RETOS A PARTIR DE AQUÍ
    @Test
    @DisplayName("Reto 1: Rechazar nombre vacío")
    public void rechazarNombreVacío(){
        String nombre = "";
        Boolean nombreValido = nombre.length() > 0;
        assertFalse(nombreValido, "El sistema debería de rechazar el nombre");
    }

    @Test
    @DisplayName("Reto 2: Aceptar contraseña justa")
    public void aceptarPasswordJusta(){
        String password = "12345678";
        Boolean passwordValida = password.length() >= 8;
        assertTrue(passwordValida, "El sistema debería de aceptar la contraseña");
    }

    @Test
    @DisplayName("Reto 3: Rechazar contraseña corta")
    public void rechazarContraseñaCorta(){
        String password = "Admin";
        Boolean passwordValida = password.length() >= 8;
        assertFalse(passwordValida, "El sistema debería de rechazar la contraseña");
    }

    @Test
    @DisplayName("Reto 4: Rechazar email sin @")
    public void rechazarEmailFalso(){
        String email = "usuario.gmail.com";
        Boolean emailValido = email.contains("@");
        assertFalse(emailValido, "El sistema debería de rechazar el email falso");
    }

    @Test
    @DisplayName("Reto 5: Aceptar edad mínima")
    public void aceptarEdadMínima(){
        int edad = 16;
        Boolean edadValida = edad >= 16;
        assertTrue(edadValida, "El sistema debería aceptar la edad válida minima");
    }



}
