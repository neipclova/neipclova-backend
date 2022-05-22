package neipclova.survey.repository;

import neipclova.survey.domain.VisitorPageEntryLog;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class VisitorPageEntryLogRepository {

    private final EntityManager em;

    public void save(VisitorPageEntryLog visitorPageEntryLog) {
        em.persist(visitorPageEntryLog);
    }

    private void remove(Long id) {
        VisitorPageEntryLog v = em.find(VisitorPageEntryLog.class, id);
        em.remove(v);
    }

    public VisitorPageEntryLog findOne(Long id) {
        return em.find(VisitorPageEntryLog.class, id);
    }

    public List<VisitorPageEntryLog> findAll() {
        return em.createQuery("select v from VisitorPageEntryLog v", VisitorPageEntryLog.class)
            .getResultList();
    }

    public List<VisitorPageEntryLog> findById(Integer id) {
        return em.createQuery("select v from VisitorPageEntryLog v where v.id = :id",
                VisitorPageEntryLog.class)
            .setParameter("id", id)
            .getResultList();
    }
}