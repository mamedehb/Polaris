package br.com.polaris.safe.route.domain;

public class Documento {
    private String tipo;
    private String frente;
    private String verso;
    private String selfie;

    public Documento(String tipo, String frente, String verso, String selfie) {
        this.tipo = tipo;
        this.frente = frente;
        this.verso = verso;
        this.selfie = selfie;
    }

    public Documento() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFrente() {
        return frente;
    }

    public void setFrente(String frente) {
        this.frente = frente;
    }

    public String getVerso() {
        return verso;
    }

    public void setVerso(String verso) {
        this.verso = verso;
    }

    public String getSelfie() {
        return selfie;
    }

    public void setSelfie(String selfie) {
        this.selfie = selfie;
    }
}
