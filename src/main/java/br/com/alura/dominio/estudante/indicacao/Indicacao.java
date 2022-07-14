package br.com.alura.dominio.estudante.indicacao;

import java.time.LocalDateTime;

import br.com.alura.dominio.estudante.Estudante;

public class Indicacao {
    
    private Estudante indicado;
    private Estudante indicante;
    private LocalDateTime dataIndicacao;
    
    public Indicacao(Estudante indicado, Estudante indicante) {
        this.indicado = indicado;
        this.indicante = indicante;
        this.dataIndicacao = LocalDateTime.now();
    }

    public Estudante getIndicado() {
        return indicado;
    }

    public Estudante getIndicante() {
        return indicante;
    }

    public LocalDateTime getDataIndicacao() {
        return dataIndicacao;
    }

    
    
}
