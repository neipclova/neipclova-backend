package neipclova.survey.repository;

import java.util.List;
import javax.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import neipclova.survey.domain.SurveyType;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SurveyTypeRepository {

    private final EntityManager em;

    public void save(SurveyType surveyType) {em.persist(surveyType);}

    public void remove(Long id) {
        SurveyType st = em.find(SurveyType.class, id);
        em.remove(st);
    }

    public SurveyType findOne(Long id) {return em.find(SurveyType.class, id);}

    public List<SurveyType> findAll() {
        return em.createQuery("select st from SurveyType st", SurveyType.class).getResultList();
    }

}
