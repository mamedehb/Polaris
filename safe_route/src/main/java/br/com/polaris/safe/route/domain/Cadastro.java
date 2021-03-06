package br.com.polaris.safe.route.domain;

public class Cadastro {
    private Comum usuario;
    private Endereco endereco;
    private ContatoConfianca contatoConfianca;
    private Documento documento;

    public Cadastro(Comum usuario, Endereco endereco, ContatoConfianca contatoConfianca, Documento documento) {
        this.usuario = usuario;
        this.endereco = endereco;
        this.contatoConfianca = contatoConfianca;
        this.documento = documento;

    }

    public Cadastro() {
   }

    public Comum getComum() {
        return usuario;
    }

    public void setComum(Comum usuario) {
        this.usuario = usuario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public ContatoConfianca getContatoConfianca() {
        return contatoConfianca;
    }

    public void setContatoConfianca(ContatoConfianca contatoConfianca) {
        this.contatoConfianca = contatoConfianca;
    }

    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }
}
