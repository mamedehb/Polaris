package br.com.polaris.safe.route.domain;

public class Documento {
    private Integer id;
    private String tipo;
    private String fotoFrente;
    private String fotoVerso;

    public Documento(Integer id, String tipo, String fotoFrente, String fotoVerso) {
        this.id = id;
        this.tipo = tipo;
        this.fotoFrente = fotoFrente;
        this.fotoVerso = fotoVerso;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFotoFrente() {
        return fotoFrente;
    }

    public void setFotoFrente(String fotoFrente) {
        this.fotoFrente = fotoFrente;
    }

    public String getFotoVerso() {
        return fotoVerso;
    }

    public void setFotoVerso(String fotoVerso) {
        this.fotoVerso = fotoVerso;
    }
}
