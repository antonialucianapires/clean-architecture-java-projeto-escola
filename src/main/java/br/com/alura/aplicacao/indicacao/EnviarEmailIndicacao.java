package br.com.alura.aplicacao.indicacao;

import br.com.alura.dominio.estudante.Estudante;

public interface EnviarEmailIndicacao {

    void enviarPara(Estudante estudanteIndicado);

}
