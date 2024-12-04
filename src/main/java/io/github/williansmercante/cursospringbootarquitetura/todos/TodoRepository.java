package io.github.williansmercante.cursospringbootarquitetura.todos;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<TodoEntity,Integer> {

    boolean existsByDescricao(String descricao);

}