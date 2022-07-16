package br.com.alura.aplicacao.estudante.matricular;

import br.com.alura.dominio.estudante.RepositorioDeEstudantes;

public class MatricularEstudanteUseCase {

    private final RepositorioDeEstudantes repositorioDeEstudantes;

    public MatricularEstudanteUseCase(RepositorioDeEstudantes repositorioDeEstudantes) {
        this.repositorioDeEstudantes = repositorioDeEstudantes;
    }

    public void executa(MatricularEstudanteDTO matricularEstudanteDTO) {

        var novoEstudante = matricularEstudanteDTO.criarNovoEstudante();
        repositorioDeEstudantes.matricular(novoEstudante);

        System.out.println("[log::useCase] pessoa estudante cadastrada com sucesso!");
    }
}
