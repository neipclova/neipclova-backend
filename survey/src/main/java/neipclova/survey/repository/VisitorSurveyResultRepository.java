package neipclova.survey.repository;

import neipclova.survey.domain.VisitorSurveyResult;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class VisitorSurveyResultRepository {

    private final EntityManager em;

    public void save(VisitorSurveyResult visitorSurveyResult) {
        em.persist(visitorSurveyResult);
    }

    private void remove(Long id) {
        VisitorSurveyResult v = em.find(VisitorSurveyResult.class, id);
        em.remove(v);
    }

    public VisitorSurveyResult findOne(Long id) {
        return em.find(VisitorSurveyResult.class, id);
    }

    public List<VisitorSurveyResult> findAll() {
        return em.createQuery("select v from VisitorSurveyResult v", VisitorSurveyResult.class)
            .getResultList();
    }

    public List<VisitorSurveyResult> findById(Integer id) {
        return em.createQuery("select v from VisitorSurveyResult v where v.id = :id",
                VisitorSurveyResult.class)
            .setParameter("id", id)
            .getResultList();
    }
}