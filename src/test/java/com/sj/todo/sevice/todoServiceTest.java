package com.sj.todo.sevice;

import com.sj.todo.domain.DayOfWeek;
import com.sj.todo.domain.Period;
import com.sj.todo.domain.Todo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class todoServiceTest {

    @Autowired TodoService todoService;
    // @Autowired TodoRepository todoRepository;
    @Autowired EntityManager em;

    @Test
    public void createTodoTest() throws Exception {
        // given
        Period period = createBuild();

        // when
        Long todoId = todoService.addTodo("title", true, 23, period);

        // then
        // Todo getTodo = todoRepository.findOne(todoId);

        // Assertions.assertEquals("title", getTodo.getTitle());

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
                .interval(1)
                .build();
    }

}