package sj.todo.repository;

import lombok.RequiredArgsConstructor;
import sj.todo.domain.Period;
import org.springframework.stereotype.Repository;
import sj.todo.domain.Todo;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class PeriodRepository {

    private final EntityManager em;

    public Period findOne(Long id) {
        return em.find(Period.class, id);
    }

    public void save(Period period) {
        em.persist(period);
    }
}
