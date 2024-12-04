package io.github.williansmercante.cursospringbootarquitetura.todos;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

    public TodoRepository repository;
    public TodoValidator validator;
    private MailSender mailSender;

    public TodoService(TodoRepository repository,TodoValidator validator,MailSender mailSender) {
        this.repository = repository;
        this.validator = validator;
        this.mailSender = mailSender;
    }

    public TodoEntity salvar(TodoEntity todo) {
        return repository.save(todo);
    }

    public void atualizar(TodoEntity todo) {
        repository.save(todo);
        String status = todo.getConcluido() == Boolean.TRUE ? "Concluido" : "Não concluido";
        mailSender.enviar("Todo " + todo.getDescricao() + " foi atualizado para " + status);
    }

    public TodoEntity buscarPorId(Integer id) {
        return repository.findById(id).orElse(null);
    }

}
