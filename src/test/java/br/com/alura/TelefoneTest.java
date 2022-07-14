package br.com.alura;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

import br.com.alura.estudante.Telefone;

public class TelefoneTest {

    @Test
    void naoDeveCriarTelefonesInvalidos() {

        assertThrows(IllegalArgumentException.class, () -> new Telefone(null, null));
        assertThrows(IllegalArgumentException.class, () -> new Telefone(null, "000000000"));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("77", null));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("21", "000"));
    }

    @Test
    void deveCriarTelefoneValido() {
        assertDoesNotThrow(() -> new Telefone("22", "990976587"));
    }

}
