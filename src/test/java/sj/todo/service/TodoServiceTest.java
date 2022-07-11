package sj.todo.service;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import sj.todo.domain.DayOfWeek;
import sj.todo.domain.Period;
import sj.todo.domain.Todo;
import sj.todo.repository.TodoRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import java.time.LocalDate;

@SpringBootTest
@Transactional
public class TodoServiceTest {

    @Autowired TodoRepository todoRepository;
    @Autowired TodoService todoService;
    @Autowired
    EntityManager em;

    @Test
    public void createTodoTest() throws Exception {
        // given
        Period period = createBuild();

//        Long periodId = periodService.addPeriod();

        // when
        Long todoId = todoService.addTodo("title", true, 23, period.getId());

        // then
         Todo getTodo = todoRepository.findOne(todoId);
         Assertions.assertEquals("title", getTodo.getTitle());

    }

    private Period createBuild() {

        LocalDate startDate = LocalDate.of(2022, 01, 01);
        LocalDate endDate = LocalDate.of(2022, 12, 12);
        DayOfWeek dayOfWeek = new DayOfWeek(false, false, false, false, false, false, false);

        return Period.builder()
                .startDate(startDate)
                .endDate(endDate)
                .howManyWeeks(6)
                .dayOfWeek(dayOfWeek)
                .cycle(1)
                .build();
    }

}