package br.com.alura.infra.estudante;

import br.com.alura.dominio.estudante.Estudante;
import br.com.alura.dominio.estudante.EstudanteBuilder;
import br.com.alura.dominio.estudante.RepositorioDeEstudantes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class RepositorioDeEstudanteBancoMemoriaTest {

    private RepositorioDeEstudantes repositorioDeEstudantes;

    @BeforeEach
    void setup() {
        repositorioDeEstudantes = new RepositorioDeEstudanteBancoMemoria();
    }

    @Test
    void matricularEstudanteComTodosOsDadosValidos() {

        var estudante = EstudanteBuilder.builder()
                .comNome("Estudante 1")
                .comEmail("estudante@email.com")
                .comTelefone("21", "988976289")
                .comCPF("123.123.123-22")
                .build();

        repositorioDeEstudantes.matricular(estudante);

        var estudanteSalvo = repositorioDeEstudantes.buscarPorCPF("123.123.123-22");

        assertFalse(repositorioDeEstudantes.buscarTodosOsMatriculados().isEmpty());
        assertEquals(estudanteSalvo, estudante);

    }

    @Test
    void buscarEstudantePorCPF() {

        var estudante = EstudanteBuilder.builder()
                .comNome("Estudante 1")
                .comEmail("estudante@email.com")
                .comTelefone("21", "988976289")
                .comCPF("123.123.123-22")
                .build();

        repositorioDeEstudantes.matricular(estudante);

        var estudanteEncontrado = repositorioDeEstudantes.buscarPorCPF("123.123.123-22");

        assertNotNull(estudante);
        assertEquals("123.123.123-22",estudanteEncontrado.getCpf().getNumero());

    }

    @Test
    void lancarErroAobuscarEstudantePorCPFENaoEncontrar() {
        RuntimeException runtimeException = assertThrows(RuntimeException.class, () -> repositorioDeEstudantes.buscarPorCPF("123.123.123-22"));
        assertEquals("Estudante não encontrado", runtimeException.getMessage());
    }

    @Test
    void buscarTodosOsEstudantes() {

        var estudante1 = EstudanteBuilder.builder()
                .comNome("Estudante 1")
                .comEmail("estudante@email.com")
                .comTelefone("21", "988976289")
                .comCPF("123.123.123-22")
                .build();

        var estudante2 = EstudanteBuilder.builder()
                .comNome("Estudante 2")
                .comEmail("estudante2@email.com")
                .comTelefone("21", "999999999")
                .comCPF("234.345.345-33")
                .build();

        repositorioDeEstudantes.matricular(estudante1);
        repositorioDeEstudantes.matricular(estudante2);

        var estudantes = repositorioDeEstudantes.buscarTodosOsMatriculados();

        assertEquals(2, estudantes.size());
    }


}