package br.com.alura;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import br.com.alura.estudante.Email;

public class EmailTest {

    @Test
    void naoDeveCriarEmailsComEnderecosInvalidos() {
        
        assertThrows(IllegalArgumentException.class, () -> new Email(null));

        assertThrows(IllegalArgumentException.class, () -> new Email(""));

        assertThrows(IllegalArgumentException.class, () -> new Email("emailInvalido"));
    }

    @Test
    void deveCriarEmailValido() {
        
        Email emailValido = new Email("emailvalido@email.com");
        assertTrue(emailValido.getEndereco().matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$"));
        assertDoesNotThrow(() -> new Email("emailvalido@email.com"));
    }
}
