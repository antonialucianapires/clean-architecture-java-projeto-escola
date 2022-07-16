package br.com.alura.infra.indicacao;

import br.com.alura.aplicacao.indicacao.EnviarEmailIndicacao;
import br.com.alura.dominio.estudante.Estudante;

public class EnviarEmailIndicacaoComJavaMail implements EnviarEmailIndicacao {

    @Override
    public void enviarPara(Estudante estudanteIndicado) {
        System.out.println("E-mail de indicação enviado para o estudante indicado portador(a) do CPF " + estudanteIndicado.getCpf());
    }
}
