package br.com.alura.aplicacao.estudante.matricular;


import br.com.alura.infra.estudante.RepositorioDeEstudanteBancoMemoria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatricularEstudanteUseCaseTest {

    @Test
    void persisteEstudanteNoBancoDeDados() {

        var repositorioEstudantes = new RepositorioDeEstudanteBancoMemoria();
        var matricularUseCase = new MatricularEstudanteUseCase(repositorioEstudantes);

        var dadosEntrada = new MatricularEstudanteDTO("Fulano", "123.122.122-10", "fulano@email.com");
        matricularUseCase.executa(dadosEntrada);

        var estudanteEncontrado = repositorioEstudantes.buscarPorCPF("123.122.122-10");

        assertEquals("Fulano",estudanteEncontrado.getNome());
        assertEquals("fulano@email.com",estudanteEncontrado.getEmail().getEndereco());
        assertEquals("123.122.122-10",estudanteEncontrado.getCpf().getNumero());


    }

}