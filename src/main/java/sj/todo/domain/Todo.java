package sj.todo.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Todo {

    @Id
    @GeneratedValue
    @Column(name = "todo_id")
    private Long id;

    private String title;
    private boolean isDone;
//    private String icon;
//    private String color;

    private int howLong;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="period_id")
    private Period period;

    public static Todo createTodo(String title, boolean isDone, int howLong, Period period) {
        Todo todo = new Todo();
        todo.title = title;
        todo.isDone = isDone;
        todo.howLong = howLong;
        todo.period = period;
        return todo;
    }
}
