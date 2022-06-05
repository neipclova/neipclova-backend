package neipclova.survey.repository;

import javax.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import neipclova.survey.domain.ResultType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ResultTypeRepository {

    private final EntityManager em;

    public void save(ResultType resultType) {em.persist(resultType);}

    public void remove(Long id) {
        ResultType rt = em.find(ResultType.class, id);
        em.remove(rt);
    }

    public ResultType findOne(Long id) {return em.find(ResultType.class, id);}

    public List<ResultType> findAll() {
        return em.createQuery("select rt from ResultType rt", ResultType.class).getResultList();
    }

}
