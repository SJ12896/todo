package com.sj.todo.sevice;

import com.sj.todo.domain.Period;
import com.sj.todo.domain.Todo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TodoService {

    // private final TodoRepository todoRepository;

    public Long addTodo(String title, boolean isDone, int howLong, Period period) {
        Todo todo = Todo.createTodo(title, isDone, howLong, period);
        // todoRepository.save(todo);
        return todo.getId();
    }
}
