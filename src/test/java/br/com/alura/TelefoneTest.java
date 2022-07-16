package br.com.alura;

import org.junit.jupiter.api.Test;

import br.com.alura.dominio.estudante.Telefone;

import static org.junit.jupiter.api.Assertions.*;

public class TelefoneTest {

    @Test
    void naoDeveCriarTelefonesInvalidos() {

        IllegalArgumentException numeroIEDDDException = assertThrows(IllegalArgumentException.class, () -> new Telefone(null, null));
        assertEquals("DDD e número sao obrigatórios!", numeroIEDDDException.getMessage());

        IllegalArgumentException dddInvalidoExceptionassertThrows = assertThrows(IllegalArgumentException.class, () -> new Telefone("1", "990976587"));
        assertEquals("DDD inválido!", dddInvalidoExceptionassertThrows.getMessage());

        IllegalArgumentException numeroInvalidoException = assertThrows(IllegalArgumentException.class, () -> new Telefone("21", "000"));
        assertEquals("Número inválido!", numeroInvalidoException.getMessage());
    }

    @Test
    void deveCriarTelefoneValido() {
        assertDoesNotThrow(() -> new Telefone("22", "990976587"));
    }

}
