package io.github.joao.arquiteturaSpring.todos;

import org.springframework.data.jpa.repository.JpaRepository;

// The TodoRepository interface extends JpaRepository, which is a Spring Data interface that provides CRUD (Create, Read, Update, Delete) operations for the TodoEntity.
// By extending JpaRepository, TodoRepository inherits several methods for working with TodoEntity persistence, such as save(), findById(), findAll(), deleteById(), and more.
// The first generic parameter, TodoEntity, specifies the type of the entity that this repository manages, while the second parameter
// specifies the type of the entity's primary key, which in this case is Integer.
public interface TodoRepository extends JpaRepository<TodoEntity, Integer> {
}
