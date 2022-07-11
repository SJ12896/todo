package sj.todo.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class todoTest {

    @Test
    public void createTodoTest() throws Exception {
        // given
        Todo todo = null;
        LocalDate startDate = LocalDate.of(2022, 01, 01);
        LocalDate endDate = LocalDate.of(2022, 12, 12);
        DayOfWeek dayOfWeek = new DayOfWeek(false, false, false, false, false, false, false);
        Period period = Period.builder()
                .startDate(startDate)
                .endDate(endDate)
                .howManyWeeks(6)
                .dayOfWeek(dayOfWeek)
                .cycle(1)
                .build();

        Period period2 = Period.builder()
                .startDate(startDate)
                .endDate(endDate)
                .howManyWeeks(123)
                .setDay(16)
                .cycle(33)
                .build();
        // when
        todo = Todo.createTodo("title", true, 23, period2);
        // then
        Assertions.assertEquals(123, todo.getPeriod().getHowManyWeeks());
    }
}
