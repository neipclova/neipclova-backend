package neipclova.survey.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import lombok.RequiredArgsConstructor;
import neipclova.survey.domain.Answer;
import neipclova.survey.domain.Member;
import neipclova.survey.domain.VisitorSurveyAnswer;
import neipclova.survey.domain.VisitorSurveyResult;

@Repository
@RequiredArgsConstructor
public class VisitorSurveyAnswerRepository {

    private final EntityManager em;

    public List<VisitorSurveyAnswer> findByByVisitorId(Long visitor_id) {
        return em.createQuery("select question, answer from VisitorSurveyAnswer where visitor=:visitor_id",VisitorSurveyAnswer.class)
                .setParameter("visitor_id",visitor_id)
                .getResultList();
    }

    public List<Answer> scoreByVisitorId(Long visitor_id) {
        return em.createQuery("select score from Answer as a left join VisitorSurveyAnswer as vsa on a.answer_order = vsa.answer and a.question = vsa.question where vsa.visitor=:visitor_id",
                              Answer.class)
                 .setParameter("visitor_id",visitor_id)
                 .getResultList();
    }

    public void save(VisitorSurveyAnswer visitorSurveyAnswer) {
        em.persist(visitorSurveyAnswer);
    }
}