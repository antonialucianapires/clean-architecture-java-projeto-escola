package br.com.alura.infra.estudante;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.dominio.estudante.Estudante;
import br.com.alura.dominio.estudante.RepositorioDeEstudantes;

public class RepositorioDeEstudanteBancoMemoria implements RepositorioDeEstudantes {

    private final List<Estudante> estudantes = new ArrayList<>();

    @Override
    public void matricular(Estudante estudante) {
        this.estudantes.add(estudante);
        System.out.println("[log::infra] pessoa estudante cadastrada no banco de dados em memória");
    }

    @Override
    public Estudante buscarPorCPF(String cpf) {
        System.out.println("[log::infra] pessoa estudante recuperada por cpf ( " + cpf + ") no banco de dados em memória");
        return this.estudantes.stream().filter(estudante -> estudante.getCpf().getNumero().equals(cpf)).findFirst().orElseThrow(() -> new RuntimeException("Estudante não encontrado"));
    }

    @Override
    public List<Estudante> buscarTodosOsMatriculados() {
        System.out.println("[log::infra] " + this.estudantes.size() + " estudantes recuperados no banco de dados em memória");
        return this.estudantes;
    }

}
