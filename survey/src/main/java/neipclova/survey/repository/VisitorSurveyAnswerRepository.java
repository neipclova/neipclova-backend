package neipclova.survey.repository;

import neipclova.survey.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class VisitorSurveyAnswerRepository {

    private final EntityManager em;

    public void save(VisitoSurveyAnswer visitorSurveyAnswer) { em.persist(visitorSurveyAnswer); }

    private VisitorSurveyAnswer remove(Long id) {
        VisitorSurveyAnswer v = em.find(visitorSurveyAnswer.class, id);
        em.remove(v);
    }

    public VisitorSurveyAnswer findOne(Long id) { return em.find(visitorSurveyAnswer.class, id); }

    public List<VisitorSurveyAnswer> findAll() {
        return em.createQuery("select v from VisitorSurveyAnswer v", visitorSurveyAnswer.class)
            .getResultList();
    }

    public List<VisitorSurveyAnswer> findByName(String name) {
        return em.createQuery("select v from VisitorSurveyAnswer v where v.name = :name", visitorSurveyAnswer.class)
            .setParameter("name", name)
            .getResultList();
    }
