package br.com.alura.dominio.estudante;

import java.util.ArrayList;
import java.util.List;

//Entidade
public class Estudante {

    private CPF cpf;
    private String nome;
    private Email email;
    private List<Telefone> telefones = new ArrayList<>();
    
    public Estudante(CPF cpf, String nome, Email email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    public Estudante() {
    }

    public CPF getCpf() {
        return cpf;
    }

    public void adicionarTelefone(String ddd, String numero) {
        this.telefones.add(new Telefone(ddd, numero));
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(CPF cpf) {
        this.cpf = cpf;
    }

    public void setEmail(Email email) {
        this.email = email;
    }
}
