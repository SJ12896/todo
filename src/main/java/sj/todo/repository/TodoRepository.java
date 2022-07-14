package sj.todo.repository;

import sj.todo.domain.Todo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class TodoRepository {

    private final EntityManager em;

    public Todo findById(Long id) {
        return em.find(Todo.class, id);
    }

    public void save(Todo todo) {
        em.persist(todo);
    }
}
