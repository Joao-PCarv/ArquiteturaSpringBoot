package io.github.joao.arquiteturaSpring.todos;

import org.springframework.stereotype.Component;

// The @Component annotation indicates that this class is a component in the Spring application context.
// Components are generic stereotypes for any Spring-managed component. They can be used to indicate that a
// class is a candidate for auto-detection when using annotation-based configuration and classpath scanning.
@Component
public class TodoValidador {

    private TodoRepository repository;

    public TodoValidador(TodoRepository repository) {
        this.repository = repository;
    }

    public void validar(TodoEntity todo){
        if(existeTodoComDescricao(todo.getDescricao())){
            throw new IllegalArgumentException("Já existe um todo com a descrição: " + todo.getDescricao());
        }
    }

    private boolean existeTodoComDescricao(String descricao){
        return repository.existsByDescricao(descricao);
    }
}
