package io.github.joao.arquiteturaSpring.todos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// The @Service annotation indicates that this class is a service component in the Spring application context.
// Services are typically used to encapsulate business logic and interact with repositories to perform operations on the data.
@Service
public class TodoService {

//    @Autowired
    private TodoRepository repository;
//    @Autowired
    private TodoValidador validador;
//    @Autowired
    private MailSender mailSender;

    public TodoService(TodoRepository todoRepository, TodoValidador todoValidador, MailSender mailSender) {
        this.validador = todoValidador;
        this.mailSender = mailSender;
        this.repository = todoRepository;
    }

    public TodoEntity salvar(TodoEntity novotodo) {
        validador.validar(novotodo);
        return repository.save(novotodo);
    }

    public void atualizarStatus(TodoEntity todo){
        repository.save(todo);
        String status = todo.getConcluido() == Boolean.TRUE ? "Concluido": "Não concluido";
        mailSender.enviar("Todo " + todo.getDescricao() + " foi " + status);
    }

    public TodoEntity buscarPorId(Integer id){
        return repository.findById(id).orElse(null);
    }



}
