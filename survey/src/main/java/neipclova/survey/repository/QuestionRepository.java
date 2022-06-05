package neipclova.survey.repository;

import javax.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import neipclova.survey.domain.Question;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class QuestionRepository {

    private final EntityManager em;

    public void save(Question question) {em.persist(question);}

    public void remove(Long id) {
        Question q = em.find(Question.class, id);
        em.remove(q);
    }

    public Question findOne(Long id) {return em.find(Question.class, id);}

    public List<Question> findAll() {
        return em.createQuery("select q from Question q", Question.class).getResultList();
    }

}
