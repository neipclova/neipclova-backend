package neipclova.survey.repository;

import javax.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import neipclova.survey.domain.Answer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class AnswerRepository {

    private final EntityManager em;

    public void save(Answer answer) {em.persist(answer);}

    public void remove(Long id) {
        Answer a = em.find(Answer.class, id);
        em.remove(a);
    }

    public Answer findOne(Long id) {return em.find(Answer.class, id);}

    public List<Answer> findAll() {
        return em.createQuery("select a from Answer a", Answer.class).getResultList();
    }

}
