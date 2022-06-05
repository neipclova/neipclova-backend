package neipclova.survey.repository;

import neipclova.survey.domain.VisitorResultShare;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class VisitorResultShareRepository {

    private final EntityManager em;

    public void save(VisitorResultShare visitorResultShare) {
        em.persist(visitorResultShare);
    }

    private void remove(Long id) {
        VisitorResultShare v = em.find(VisitorResultShare.class, id);
        em.remove(v);
    }

    public VisitorResultShare findOne(Long id) {
        return em.find(VisitorResultShare.class, id);
    }

    public List<VisitorResultShare> findAll() {
        return em.createQuery("select v from VisitorResultShare v", VisitorResultShare.class)
            .getResultList();
    }

    public List<VisitorResultShare> findById(Integer id) {
        return em.createQuery("select v from VisitorResultShare v where v.id = :id",
                VisitorResultShare.class)
            .setParameter("id", id)
            .getResultList();
    }
}