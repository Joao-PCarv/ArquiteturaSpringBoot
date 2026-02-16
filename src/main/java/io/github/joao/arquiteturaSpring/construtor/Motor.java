package io.github.joao.arquiteturaSpring.construtor;

public class Motor {
    private String modelo;
    private Integer cavalos;
    private Integer cilindros;
    private Double capacidade;
    private TipoMotor tipo;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getCavalos() {
        return cavalos;
    }

    public void setCavalos(Integer cavalos) {
        this.cavalos = cavalos;
    }

    public Integer getCilindros() {
        return cilindros;
    }

    public void setCilindros(Integer cilindros) {
        this.cilindros = cilindros;
    }

    public Double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Double capacidade) {
        this.capacidade = capacidade;
    }

    public TipoMotor getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "modelo='" + modelo + '\'' +
                ", cavalos=" + cavalos +
                ", cilindros=" + cilindros +
                ", capacidade=" + capacidade +
                ", tipo=" + tipo +
                '}';
    }

    public void setTipo(TipoMotor tipo) {
        this.tipo = tipo;
    }
}
