package sj.todo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sj.todo.dto.TodoDto;
import sj.todo.service.TodoService;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/todo")
public class TodoController {

    private final TodoService todoService;

    @PostMapping
    public ResponseEntity<TodoDto> CreateTodo(@RequestBody TodoDto todoDto) {
        Long id = todoService.addTodo(todoDto);
        return ResponseEntity.ok(todoService.findOne(id));
    }

    public ResponseEntity<TodoDto> getTodo(Long id) {
        TodoDto todo = todoService.findOne(id);
        return ResponseEntity.ok().body(todo);
    }
}
