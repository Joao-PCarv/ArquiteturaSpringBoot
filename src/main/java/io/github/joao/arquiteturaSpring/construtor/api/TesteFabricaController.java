package io.github.joao.arquiteturaSpring.construtor.api;

import io.github.joao.arquiteturaSpring.construtor.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// The @RestController annotation indicates that this class is a RESTful web service controller.
@RestController
// The @RequestMapping annotation specifies that all endpoints in this controller will be prefixed with "/carros".
@RequestMapping("/carros")
public class TesteFabricaController {


    // The @Autowired annotation is used to inject the Motor dependency into this controller.
    @Autowired
//    @Qualifier("motorEletrico") // This qualifier specifies that the "motorEletrico" bean should be injected.

    @Gasolina
    private Motor motor;

    @PostMapping
    public CarroStatus ligarCarro(@RequestBody Chave chave){
        var carro = new HondaHRV(motor);
        return carro.darIgnicao(chave);
    }
}
