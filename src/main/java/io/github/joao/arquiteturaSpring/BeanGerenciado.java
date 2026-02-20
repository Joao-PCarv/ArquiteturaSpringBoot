package io.github.joao.arquiteturaSpring;

import io.github.joao.arquiteturaSpring.todos.TodoEntity;
import io.github.joao.arquiteturaSpring.todos.TodoValidador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.validation.Validator;

// The @Component annotation is used to indicate that this class is a Spring-managed component.
// It allows Spring to automatically detect and register this class as a bean in the application context during component scanning.
@Component

// The Scope annotation is used to specify the scope of a bean in Spring. In this case, the scope is set to "singleton",
// which means that only one instance of the BeanGerenciado class will be created and shared across the entire application context.
// This is the default scope for Spring beans, so even if you omit the @Scope annotation, the BeanGerenciado class will still be treated as a singleton.
// It can also be set to "request" for web applications, which creates a new instance of the bean for each HTTP request,
// or "prototype", which creates a new instance of the bean every time it is requested from the application context,
// session, which creates a new instance of the bean for each HTTP session, and application,
// which creates a single instance of the bean for the entire application lifecycle.

@Scope("singleton")
//@Scope(BeanDefinition.SCOPE_SINGLETON)


@Lazy(false)
// The @Lazy annotation is used to indicate that the bean should be lazily initialized.
// This means that the bean will not be created until it is first requested or accessed in the application.

public class BeanGerenciado {

    // The @Autowired annotation is used to automatically inject the TodoValidador dependency into this class.
    // Without a constructor, Spring will use reflection to set the value of the todoValidador field after creating an instance of BeanGerenciado.
    @Autowired
    private TodoValidador todoValidador;


    @Autowired
    public BeanGerenciado(TodoValidador todoValidador) {
        this.todoValidador = todoValidador;
    }


    public void utilizar(){
        var toto = new TodoEntity();
        todoValidador.validar(toto);
    }

    @Autowired
    public void setTodoValidador(TodoValidador validador){
        this.todoValidador = validador;
    }

    // There are 3 common ways to inject dependencies in Spring:
    // constructor injection,
    // setter injection,
    // and field injection.
    // Each method has its own advantages and use cases:

    // Constructor Injection: This is the most recommended approach as it allows for immutable dependencies and makes
    // it clear what dependencies are required for the class to function.
    // It also promotes better testability and makes it easier to identify missing dependencies at compile time.

    // Setter Injection: This method allows for optional dependencies and can be useful when you have a large number
    // of dependencies or when you want to provide default values.
    // However, it can lead to mutable dependencies and may make it less clear which dependencies are required for the class to function.

    // Field Injection: This method is the least recommended as it can lead to issues with immutability and makes it harder to identify dependencies.
    // It also makes it more difficult to write unit tests for the class, as the dependencies are not explicitly defined in the constructor or setter methods.


}
