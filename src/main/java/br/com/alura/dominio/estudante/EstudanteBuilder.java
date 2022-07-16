package br.com.alura.dominio.estudante;

public class EstudanteBuilder {

    private Estudante estudante;

    public EstudanteBuilder() {
        this.estudante = new Estudante();
    }

    public static EstudanteBuilder builder() {
        return new EstudanteBuilder();
    }

    public EstudanteBuilder comNome(String nome) {
        this.estudante.setNome(nome);
        return this;
    }

    public EstudanteBuilder comCPF(String numeroCPF){
        this.estudante.setCpf(new CPF(numeroCPF));
        return this;
    }

    public EstudanteBuilder comEmail(String email) {
        this.estudante.setEmail(new Email(email));
        return this;
    }

    public EstudanteBuilder comTelefone(String ddd, String numero) {
        this.estudante.adicionarTelefone(ddd, numero);
        return this;
    }

    public Estudante build() {
        return this.estudante;
    }

}
