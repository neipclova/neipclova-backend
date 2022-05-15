package neipclova.survey.repository;

import neipclova.survey.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class VisitorResultShareRepository {

    private final EntityManager em;

    public void save(VisitorResultShare visitorResultShare) { em.persist(visitorResultShare); }

    private VisitorResultShare remove(Long id) {
        VisitorResultShare v = em.find(visitorResultShare.class, id);
        em.remove(v);
    }

    public VisitorResultShare findOne(Long id) { return em.find(visitorResultShare.class, id); }

    public List<VisitorResultShare> findAll() {
        return em.createQuery("select v from VisitorResultShare v", visitorResultShare.class)
            .getResultList();
    }

    public List<VisitorResultShare> findByName(String name) {
        return em.createQuery("select v from VisitorResultShare v where v.name = :name", visitorResultShare.class)
            .setParameter("name", name)
            .getResultList();
    }
