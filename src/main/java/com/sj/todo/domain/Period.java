package com.sj.todo.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class Period {

    @Id
    @GeneratedValue
    @Column(name = "period_id")
    private Long id;

    private LocalDate startDate;
    private LocalDate endDate;
    private int howManyWeeks;

    @OneToOne(mappedBy = "period", fetch = FetchType.LAZY)
    private Todo todo;

    @Embedded
    private DayOfWeek dayOfWeek;  // 특정 요일 주기로

    private int setDay;  // 특정 날짜 주기로

    private int cycle;  // 간격

}
