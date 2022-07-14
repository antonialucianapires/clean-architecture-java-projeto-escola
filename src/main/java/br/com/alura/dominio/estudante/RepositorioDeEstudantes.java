package br.com.alura.dominio.estudante;

import java.util.List;

public interface RepositorioDeEstudantes {
    
    void matricular(Estudante estudante);
    Estudante buscarPorCPF(String cpf);
    List<Estudante> buscarTodosOsMatriculados();
}
