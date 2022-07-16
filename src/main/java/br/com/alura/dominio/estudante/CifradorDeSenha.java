package br.com.alura.dominio.estudante;

public interface CifradorDeSenha {
    String cifrarSenha(String senha);
    boolean validarSenhaCifrada(String senhaCifrada, String senha);
}
