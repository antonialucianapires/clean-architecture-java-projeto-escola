package br.com.alura.aplicacao.estudante.matricular;

import br.com.alura.dominio.estudante.Estudante;
import br.com.alura.dominio.estudante.EstudanteBuilder;

public class MatricularEstudanteDTO {

    private String nome;
    private String cpf;
    private String email;

    public MatricularEstudanteDTO(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public Estudante criarNovoEstudante() {
        return EstudanteBuilder.builder()
                .comNome(nome)
                .comCPF(cpf)
                .comEmail(email)
                .build();
    }
}
