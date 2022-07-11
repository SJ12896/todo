package sj.todo.service;

import sj.todo.domain.Period;
import sj.todo.domain.Todo;
import sj.todo.repository.PeriodRepository;
import sj.todo.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class TodoService {

    private final TodoRepository todoRepository;
    private final PeriodRepository periodRepository;

    public Long addTodo(String title, boolean isDone, int howLong, Long periodId) {
        Period period = periodRepository.findOne(periodId);
        Todo todo = Todo.createTodo(title, isDone, howLong, period);
        todoRepository.save(todo);
        return todo.getId();
    }
}
