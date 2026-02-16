package io.github.joao.arquiteturaSpring.todos;

import org.springframework.stereotype.Service;

// The @Service annotation indicates that this class is a service component in the Spring application context.
// Services are typically used to encapsulate business logic and interact with repositories to perform operations on the data.
@Service
public class TodoService {


    private TodoRepository repository;

    public TodoService(TodoRepository todoRepository) {
        this.repository = todoRepository;
    }

    public TodoEntity salvar(TodoEntity novotodo) {
        return repository.save(novotodo);
    }
}
