package sj.todo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sj.todo.domain.Period;
import sj.todo.domain.Todo;
import sj.todo.repository.PeriodRepository;
import sj.todo.repository.TodoRepository;

@Service
@Transactional
@RequiredArgsConstructor
public class PeriodService {

    private final TodoRepository todoRepository;
    private final PeriodRepository periodRepository;

//    public Long addPeriod() {
//        Period period = periodRepository.findOne(periodId);
//        Todo todo = Todo.createTodo(title, isDone, howLong, period);
//        todoRepository.save(todo);
//        return todo.getId();
//    }
}
