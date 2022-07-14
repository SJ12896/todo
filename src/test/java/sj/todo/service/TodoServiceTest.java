package sj.todo.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import sj.todo.domain.DayOfWeek;
import sj.todo.domain.Todo;
import sj.todo.repository.TodoRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import java.time.LocalDate;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.when;

// @SpringBootTest
@Transactional
@ExtendWith(MockitoExtension.class)
public class TodoServiceTest {

    @Mock
    TodoRepository todoRepository;
    @InjectMocks
    TodoService todoService;

//    @BeforeEach
//    void initCase() {
//        todoService = new TodoService(todoRepository);
//    }

    @Test
    public void createTodoTest() throws Exception {
        // given
        Todo todo = createTodo();
        // when
        //Long todoId = todoService.addTodo(todo);
        // when(todoRepository.save(any(Todo.class))).then(returnFirstArg());

        // then
//        given(todoRepository.findOne(todoId)).willReturn(todo);
//
//        Assertions.assertEquals("title", getTodo.getTitle());
    }

    private Todo createTodo() {

        LocalDate startDate = LocalDate.of(2022, 01, 01);
        LocalDate endDate = LocalDate.of(2022, 12, 12);
        DayOfWeek dayOfWeek = new DayOfWeek(false, false, false, false, false, false, false);

        return Todo.builder()
                .title("title")
                .isDone(false)
                .howLong(1)
                .startDate(startDate)
                .endDate(endDate)
                .howManyWeeks(6)
                .dayOfWeek(dayOfWeek)
                .cycle(1)
                .build();
    }

}