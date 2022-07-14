package sj.todo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import sj.todo.domain.DayOfWeek;
import sj.todo.domain.Todo;
import sj.todo.dto.TodoDto;
import sj.todo.mapper.TodoMapper;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TodoControllerTest {

    @Autowired
    TodoController todoController;


    @Test
    public void createTodoTest() {

        ResponseEntity<TodoDto> responseTodo = todoController.CreateTodo(createTodoDto());
        TodoDto createdTodo = responseTodo.getBody();
        TodoDto todo = todoController.getTodo(createdTodo.getId()).getBody();
        assertEquals(createdTodo.getTitle(), todo.getTitle());

    }

    private TodoDto createTodoDto() {

        LocalDate startDate = LocalDate.of(2022, 01, 01);
        LocalDate endDate = LocalDate.of(2022, 12, 12);
        DayOfWeek dayOfWeek = new DayOfWeek(false, false, false, false, false, false, false);

        Todo todo = Todo.builder()
                .title("4444444444")
                .isDone(false)
                .howLong(1)
                .startDate(startDate)
                .endDate(endDate)
                .howManyWeeks(6)
                .dayOfWeek(dayOfWeek)
                .cycle(1)
                .build();;

        return TodoMapper.INSTANCE.toDto(todo);
    }
}