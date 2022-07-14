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

        todo = Todo.builder()
                .title("title")
                .isDone(false)
                .howLong(1)
                .startDate(startDate)
                .endDate(endDate)
                .howManyWeeks(6)
                .dayOfWeek(dayOfWeek)
                .cycle(1)
                .build();
        // then
        Assertions.assertEquals("title", todo.getTitle());
    }
}
