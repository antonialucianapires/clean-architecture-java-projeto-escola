package br.com.alura;

public class Telefone {
    private String ddd;
    private String numero;

    public Telefone(String ddd, String numero) {

        if(ddd == null || numero == null || !(ddd + " " + numero).matches("(\\(?\\d{2}\\)?\\s)?(\\d{4,5}\\-\\d{4})")) {
            throw new IllegalArgumentException("Telefone invalido!");
        }

        this.ddd = ddd;
        this.numero = numero;
    }

}
