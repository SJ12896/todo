package sj.todo.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import sj.todo.domain.Member;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class MemberRepository {

    private final EntityManager em;

    public void save(Member member) {
        em.persist(member);
    }

    public Member findByUserId(String userId) {
        return em.createQuery("select m from Member m where m.userId = :userId", Member.class)
                .setParameter("userId", userId)
                .getSingleResult();
    }
}
