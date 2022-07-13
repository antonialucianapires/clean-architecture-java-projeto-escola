package br.com.alura;

import java.time.LocalDateTime;

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
