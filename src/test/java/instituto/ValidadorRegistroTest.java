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
        assertFalse(nombreValido, "Error: El sistema rechazó un nombre vacío");
    }

    @Test
    @DisplayName("Reto 2: Aceptar contraseña justa")
    public void aceptarPasswordJusta(){
        String password = "12345678";
        Boolean passwordValida = password.length() >= 8;
        assertTrue(passwordValida, "Error: El sistema rechazó una contraseña menor de 8");
    }

    @Test
    @DisplayName("Reto 3: Rechazar contraseña corta")
    public void rechazarContraseñaCorta(){
        String password = "Admin";
        Boolean passwordValida = password.length() >= 8;
        assertFalse(passwordValida, "Error: El sistema rechazó una contreaseña corta");
    }

    @Test
    @DisplayName("Reto 4: Rechazar email sin @")
    public void rechazarEmailFalso(){
        String email = "usuario.gmail.com";
        Boolean emailValido = email.contains("@");
        assertFalse(emailValido, "Error: El sistema debería rechazar el email inválido");
    }

    @Test
    @DisplayName("Reto 5: Aceptar edad mínima exactamente")
    public void aceptarEdadMínima(){
        int edad = 16;
        assertEquals(edad, 16, "Error: La edad tiene que ser exactamente 16");
    }



}
