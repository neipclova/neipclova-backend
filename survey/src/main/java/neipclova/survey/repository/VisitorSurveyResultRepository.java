package neipclova.survey.repository;

import neipclova.survey.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class VisitorSurveyResultRepository {

    private final EntityManager em;

    public void save(VisitoSurveyResult visitorSurveyResult) { em.persist(visitorSurveyResult); }

    private VisitorSurveyResult remove(Long id) {
        VisitorSurveyResult v = em.find(visitorSurveyResult.class, id);
        em.remove(v);
    }

    public VisitorSurveyResult findOne(Long id) { return em.find(visitorSurveyResult.class, id); }

    public List<VisitorSurveyResult> findAll() {
        return em.createQuery("select v from VisitorSurveyResult v", visitorSurveyResult.class)
            .getResultList();
    }

    public List<VisitorSurveyResult> findByName(String name) {
        return em.createQuery("select v from VisitorSurveyResult v where v.name = :name", visitorSurveyResult.class)
            .setParameter("name", name)
            .getResultList();
    }
