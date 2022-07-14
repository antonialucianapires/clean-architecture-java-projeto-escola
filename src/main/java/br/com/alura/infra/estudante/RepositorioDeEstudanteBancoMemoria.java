package br.com.alura.infra.estudante;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.dominio.estudante.Estudante;
import br.com.alura.dominio.estudante.RepositorioDeEstudantes;

public class RepositorioDeEstudanteBancoMemoria implements RepositorioDeEstudantes{

    private final List<Estudante> estudantes = new ArrayList<>();

    @Override
    public void matricular(Estudante estudante) {
        this.estudantes.add(estudante);
        System.out.println("Estudante cadastrado no banco de dados com JDBC.");
    }

    @Override
    public Estudante buscarPorCPF(String cpf) {
        return this.estudantes.stream().filter(estudante -> estudante.getCpf().getNumero().equals(cpf)).findFirst().orElseThrow(() -> new RuntimeException("Estudante não encontrado"));
    }

    @Override
    public List<Estudante> buscarTodosOsMatriculados() {
        return this.estudantes;
    }
    
}
