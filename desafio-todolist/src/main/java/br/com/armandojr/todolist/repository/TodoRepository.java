package br.com.armandojr.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.armandojr.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
