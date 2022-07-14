package sj.todo.dto;

import lombok.*;
import sj.todo.domain.DayOfWeek;
import sj.todo.domain.Todo;

import javax.persistence.Embedded;
import java.time.LocalDate;


@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Getter
public class TodoDto {
    private Long id;
    private String title;
    private boolean isDone;
    private int howLong;
    private LocalDate startDate;
    private LocalDate endDate;
    private int howManyWeeks;

    private DayOfWeek dayOfWeek;  // 특정 요일 주기로

    private int cycle;  // 간격
}
