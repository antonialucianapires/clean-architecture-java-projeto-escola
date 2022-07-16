package br.com.alura.infra.estudante;

import br.com.alura.dominio.estudante.CifradorDeSenha;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class CifradorDeSenhaComMD5Test {

    private final String senhaNaoCifrada = "senha123";
    private final String senhaCifrada = "487472271510495418274439453453343256484503281318";

    @Test
    void cifrarSenha() {
        CifradorDeSenha cifradorDeSenha = new CifradorDeSenhaComMD5();

        var senhaCifradaComMD5 = cifradorDeSenha.cifrarSenha(senhaNaoCifrada);

        assertEquals(senhaCifrada, senhaCifradaComMD5);
    }

    @Test
    void validarSenhaCifrada() {
        CifradorDeSenha cifradorDeSenha = new CifradorDeSenhaComMD5();
        assertTrue(cifradorDeSenha.validarSenhaCifrada(senhaCifrada, senhaNaoCifrada));
    }

    @Test
    void lancarErroParaSenhaNula() {
        CifradorDeSenha cifradorDeSenha = new CifradorDeSenhaComMD5();
        RuntimeException runtimeException = assertThrows(RuntimeException.class,() -> cifradorDeSenha.cifrarSenha(null));
        assertEquals("Erro ao criptografar senha", runtimeException.getMessage());
    }
}