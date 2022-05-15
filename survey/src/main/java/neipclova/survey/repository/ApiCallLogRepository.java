package neipclova.survey.repository;

import neipclova.survey.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class ApiCallLogRepository {

    private final EntityManager em;

    public void save(ApiCallLog apiCallLog) { em.persist(apiCallLog); }

    private ApiCallLog remove(Long id) {
        ApiCallLog a = em.find(apiCallLog.class, id);
        em.remove(a);
    }

    public ApiCallLog findOne(Long id) { return em.find(apiCallLog.class, id); }

    public List<ApiCallLog> findAll() {
        return em.createQuery("select a from ApiCallLog a", apiCallLog.class)
            .getResultList();
    }

    public List<ApiCallLog> findByName(String name) {
        return em.createQuery("select a from ApiCallLog a where a.name = :name", apiCallLog.class)
            .setParameter("name", name)
            .getResultList();
    }
