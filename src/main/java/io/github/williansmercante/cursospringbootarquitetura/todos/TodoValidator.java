package io.github.williansmercante.cursospringbootarquitetura.todos;

import org.springframework.stereotype.Component;

@Component
public class TodoValidator {

    private TodoRepository repository;

    public TodoValidator(TodoRepository repository) {
        this.repository = repository;
    }

    public void validar(TodoEntity todo){

        if (existeTodoComEssaDescicao(todo.getDescricao())){
            throw new IllegalArgumentException("Já existe um TODO com essa descrição");
        }

    }

    private Boolean existeTodoComEssaDescicao(String descricao){
        return repository.existsByDescricao(descricao);
    }

}
