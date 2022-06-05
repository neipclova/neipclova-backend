package neipclova.survey.repository;

import neipclova.survey.domain.ApiCallLog;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class ApiCallLogRepository {

    private final EntityManager em;

    public void save(ApiCallLog apiCallLog) {
        em.persist(apiCallLog);
    }

    private void remove(Long id) {
        ApiCallLog a = em.find(ApiCallLog.class, id);
        em.remove(a);
    }

    public ApiCallLog findOne(Long id) {
        return em.find(ApiCallLog.class, id);
    }

    public List<ApiCallLog> findAll() {
        return em.createQuery("select a from ApiCallLog a", ApiCallLog.class)
            .getResultList();
    }

    public List<ApiCallLog> findById(Integer id) {
        return em.createQuery("select a from ApiCallLog a where a.id = :id", ApiCallLog.class)
            .setParameter("id", id)
            .getResultList();
    }
}