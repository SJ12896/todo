package sj.todo.service;

import sj.todo.domain.Todo;
import sj.todo.dto.TodoDto;
import sj.todo.mapper.TodoMapper;
import sj.todo.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class TodoService {

    private final TodoRepository todoRepository;

    public Long addTodo(TodoDto todoDto) {
        Todo todo = TodoMapper.INSTANCE.toEntity(todoDto);
        todoRepository.save(todo);
        return todo.getId();
    }

    public TodoDto findOne(Long id) {
        TodoDto todo = TodoMapper.INSTANCE.toDto(todoRepository.findById(id));
        return todo;
    }
}
