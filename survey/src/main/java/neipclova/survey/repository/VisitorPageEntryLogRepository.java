package neipclova.survey.repository;

import neipclova.survey.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class VisitorPageEntryLogRepository {

    private final EntityManager em;

    public void save(VisitorPageEntryLog visitorPageEntryLog) { em.persist(visitorPageEntryLog); }

    private VisitorPageEntryLog remove(Long id) {
        VisitorPageEntryLog v = em.find(visitorPageEntryLog.class, id);
        em.remove(v);
    }

    public VisitorPageEntryLog findOne(Long id) { return em.find(visitorPageEntryLog.class, id); }

    public List<VisitorPageEntryLog> findAll() {
        return em.createQuery("select v from VisitorPageEntryLog v", visitorPageEntryLog.class)
            .getResultList();
    }

    public List<VisitorPageEntryLog> findByName(String name) {
        return em.createQuery("select v from VisitorPageEntryLog v where v.name = :name", visitorPageEntryLog.class)
            .setParameter("name", name)
            .getResultList();
    }
