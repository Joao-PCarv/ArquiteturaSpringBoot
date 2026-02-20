package io.github.joao.arquiteturaSpring.todos;

import org.springframework.stereotype.Component;


@Component
public class MailSender {

    public void enviar(String mensagem){
        System.out.println("enviado email com a mensagem: " + mensagem);
    }
}
