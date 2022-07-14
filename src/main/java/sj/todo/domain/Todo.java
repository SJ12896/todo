package sj.todo.domain;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class Todo {

    @Id
    @GeneratedValue
    @Column(name = "todo_id")
    private Long id;

    private String title;
    private boolean isDone = false;
//    private String icon;
//    private String color;

    private int howLong;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate startDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate endDate;
    private int howManyWeeks;

    @Embedded
    private DayOfWeek dayOfWeek ;  // 특정 요일 주기로

    private int cycle;  // 간격

}
