package io.github.joao.arquiteturaSpring.construtor;

import java.awt.*;

public class Carro {
    private String modelo;
    private Color cor;
    private Motor motor;
    private Construtor construtor;


    public Carro(Motor motor) {
        this.motor = motor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Construtor getConstrutor() {
        return construtor;
    }

    public void setConstrutor(Construtor construtor) {
        this.construtor = construtor;
    }

    public CarroStatus darIgnicao(Chave chave) {
        if(chave.getConstrutor() != this.construtor) {
            return new CarroStatus("Chave incompatível para este carro.");
        }
        return new CarroStatus("Carro ligado com sucesso! Motor: " + motor);
    }
}
