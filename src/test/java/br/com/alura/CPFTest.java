package br.com.alura;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import br.com.alura.estudante.CPF;

public class CPFTest {

    @Test
    void naoDeveCriarCPFInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new CPF(null));
        assertThrows(IllegalArgumentException.class, () -> new CPF("13435678345"));
    }

    @Test
    void deveCriarCPFValido() {
        assertDoesNotThrow(() -> new CPF("111.222.333-10"));
    }

}
