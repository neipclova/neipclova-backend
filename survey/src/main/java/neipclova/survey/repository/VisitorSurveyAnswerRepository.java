package neipclova.survey.repository;

import neipclova.survey.domain.VisitorSurveyAnswer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class VisitorSurveyAnswerRepository {

    private final EntityManager em;

    public void save(VisitorSurveyAnswer visitorSurveyAnswer) {
        em.persist(visitorSurveyAnswer);
    }

    private void remove(Long id) {
        VisitorSurveyAnswer v = em.find(VisitorSurveyAnswer.class, id);
        em.remove(v);
    }

    public VisitorSurveyAnswer findOne(Long id) {
        return em.find(VisitorSurveyAnswer.class, id);
    }

    public List<VisitorSurveyAnswer> findAll() {
        return em.createQuery("select v from VisitorSurveyAnswer v", VisitorSurveyAnswer.class)
            .getResultList();
    }

    public List<VisitorSurveyAnswer> findById(Integer id) {
        return em.createQuery("select v from VisitorSurveyAnswer v where v.id = :id",
                VisitorSurveyAnswer.class)
            .setParameter("id", id)
            .getResultList();
    }
}