package neipclova.survey.repository;

import neipclova.survey.domain.Visitor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class VisitorRepository {

    private final EntityManager em;

    public void save(Visitor visitor) {
        em.persist(visitor);
    }

    private void remove(Long id) {
        Visitor v = em.find(Visitor.class, id);
        em.remove(v);
    }

    public Visitor findOne(Long id) {
        return em.find(Visitor.class, id);
    }

    public List<Visitor> findAll() {
        return em.createQuery("select v from Visitor v", Visitor.class)
            .getResultList();
    }

    public List<Visitor> findByName(Integer id) {
        return em.createQuery("select v from Visitor v where v.id = :id", Visitor.class)
            .setParameter("id", id)
            .getResultList();
    }
}