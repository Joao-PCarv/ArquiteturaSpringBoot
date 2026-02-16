package io.github.joao.arquiteturaSpring.construtor;

import java.awt.*;

public class HondaHRV extends Carro {

    public HondaHRV(Motor motor) {
        super(motor);
        setModelo("HRV");
        setCor(Color.BLACK);
        setConstrutor(Construtor.HONDA);
    }


}
