package io.github.joao.arquiteturaSpring.construtor;

public class Chave {
    private Construtor construtor;
    private String tipo;

    public Construtor getConstrutor() {
        return construtor;
    }

    public void setConstrutor(Construtor construtor) {
        this.construtor = construtor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
