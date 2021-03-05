package br.com.polaris.safe.route.domain;

public class ContatoConfianca {
    private int id;
    private String nome;
    private String email;
    private String numeroTelefone;

    public ContatoConfianca(int id, String nome, String email, String numeroTelefone) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.numeroTelefone = numeroTelefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }
}
