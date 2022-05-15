package neipclova.survey.repository;

import neipclova.survey.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class VisitorRepository {

    private final EntityManager em;

    public void save(Visitor visitor) { em.persist(visitor); }

    private Visitor remove(Long id) {
        Visitor v = em.find(visitor.class, id);
        em.remove(v);
    }

    public Visitor findOne(Long id) { return em.find(visitor.class, id); }

    public List<Visitor> findAll() {
        return em.createQuery("select v from Visitor v", visitor.class)
            .getResultList();
    }

    public List<Visitor> findByName(String name) {
        return em.createQuery("select v from Visitor v where v.name = :name", visitor.class)
            .setParameter("name", name)
            .getResultList();
    }
