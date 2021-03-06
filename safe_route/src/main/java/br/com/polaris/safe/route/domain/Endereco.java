package br.com.polaris.safe.route.domain;

public class Endereco {
    private String descricao;
    private String logradouro;
    private String numero;
    private String cep;

    public Endereco(String descricao, String logradouro, String numero, String cep) {
        this.descricao = descricao;
        this.logradouro = logradouro;
        this.numero = numero;
        this.cep = cep;
    }

    public Endereco() {
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
