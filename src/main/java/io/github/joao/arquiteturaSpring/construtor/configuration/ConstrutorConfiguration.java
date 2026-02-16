package io.github.joao.arquiteturaSpring.construtor.configuration;

import io.github.joao.arquiteturaSpring.construtor.Motor;
import io.github.joao.arquiteturaSpring.construtor.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// The @Configuration annotation indicates that this class contains bean definitions for the Spring application context.
@Configuration
public class ConstrutorConfiguration {

    // Bean is responsible for creating and managing the lifecycle of a Motor instance.
    // Whenever a Motor is needed, Spring will provide the same instance,
    // ensuring consistency across the application.

    @Bean(name = "motorDiesel")
    public Motor motorDiesel(){
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setModelo("XPTO-0");
        motor.setCapacidade(2.0);
        motor.setTipo(TipoMotor.DIESEL);
        return motor;
    }

    // This annotation indicates that this bean should be given preference when multiple candidates are qualified to autowire a single-valued dependency.
    @Primary
    @Bean(name = "motorEletrico")
    public Motor motorEletrico(){
        var motor = new Motor();
        motor.setCavalos(110);
        motor.setCilindros(3);
        motor.setModelo("TH-210");
        motor.setCapacidade(1.5);
        motor.setTipo(TipoMotor.ELETRICO);
        return motor;
    }

    @Bean(name = "motorGasolina")
    public Motor motorGasolina(){
        var motor = new Motor();
        motor.setCavalos(100);
        motor.setCilindros(6);
        motor.setModelo("VRUM-3000");
        motor.setCapacidade(2.0);
        motor.setTipo(TipoMotor.GASOLINA);
        return motor;
    }

}
