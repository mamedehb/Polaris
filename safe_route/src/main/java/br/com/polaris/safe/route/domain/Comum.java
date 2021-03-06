package br.com.polaris.safe.route.domain;

public class Comum extends Usuario{
    private String foto;
    private String dataNascimento;
    private String numeroTelefone;
    private boolean valida;

    public Comum() {
    }

    public Comum(
                 String nome,
                 String email,
                 String senha,
                 String foto,
                 String dataNascimento,
                 String numeroTelefone) {
        super(nome, email, senha);
        this.foto = foto;
        this.dataNascimento = dataNascimento;
        this.numeroTelefone = numeroTelefone;
        this.valida = false;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public boolean isValida() {
        return valida;
    }

    public void setValida(boolean valida) {
        this.valida = valida;
    }
}
