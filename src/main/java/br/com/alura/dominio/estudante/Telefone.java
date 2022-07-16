package br.com.alura.dominio.estudante;

public class Telefone {
    private String ddd;
    private String numero;

    public Telefone(String ddd, String numero) {

        if (ddd == null || numero == null) {
            throw new IllegalArgumentException("DDD e número sao obrigatórios!");
        }

        if (!ddd.matches("\\d{2}")) {
            throw new IllegalArgumentException("DDD inválido!");
        }

        if (!numero.matches("\\d{8}|\\d{9}")) {
            throw new IllegalArgumentException("Número inválido!");
        }
        this.ddd = ddd;
        this.numero = numero;
    }


}
