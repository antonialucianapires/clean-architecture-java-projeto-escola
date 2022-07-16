package br.com.alura;

import br.com.alura.aplicacao.estudante.matricular.MatricularEstudanteUseCase;
import br.com.alura.aplicacao.estudante.matricular.MatricularEstudanteDTO;
import br.com.alura.infra.estudante.RepositorioDeEstudanteBancoMemoria;

import java.util.Scanner;

public class MatricularEstudantePorCLI {

    public static void main(String[] args) {

        Scanner leitorDeDados = new Scanner(System.in);

        System.out.println("Infome o nome da pessoa Estudante: ");
        var nome = leitorDeDados.next();

        System.out.println("Infome o CPF da pessoa Estudante: ");
        var cpf = leitorDeDados.next();

        System.out.println("Infome o e-mail da pessoa Estudante: ");
        var email = leitorDeDados.next();

        MatricularEstudanteUseCase matricularEstudanteUseCase = new MatricularEstudanteUseCase(new RepositorioDeEstudanteBancoMemoria());
        matricularEstudanteUseCase.executa(new MatricularEstudanteDTO(nome,cpf,email));

    }
}
