package io.github.joao.arquiteturaSpring.todos;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_todo")
public class TodoEntity {

    @Id
    @Column(name = "id")
    // The @GeneratedValue annotation is used to specify how the primary key should be generated.
    // The GenerationType.IDENTITY strategy indicates that the database will automatically generate a unique value for this field,
    // typically using an auto-incrementing column.
    // There are other strategies available, such as GenerationType.SEQUENCE, GenerationType.TABLE, and GenerationType.AUTO,
    // which can be used depending on the database and requirements of the application.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "descricao")
    private String descricao;


    @Column(name = "fl_concluido")
    // The use of Boolean allows for three states: true, false, and null.
    // This can be useful to represent tasks that are not yet marked as completed or not completed.
    // The boolean primitive type would only allow for true or false, which might not be sufficient in some cases.
    private Boolean concluido;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getConcluido() {
        return concluido;
    }

    public void setConcluido(Boolean concluido) {
        this.concluido = concluido;
    }
}
