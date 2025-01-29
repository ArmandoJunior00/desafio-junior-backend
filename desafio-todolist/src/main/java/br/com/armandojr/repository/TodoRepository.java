package br.com.armandojr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.armandojr.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
