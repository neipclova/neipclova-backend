package neipclova.survey.repository;

import javax.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import neipclova.survey.domain.ActionType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ActionTypeRepository {

    private final EntityManager em;

    public void save(ActionType actionType) {em.persist(actionType);}

    public void remove(Long id) {
        ActionType at = em.find(ActionType.class, id);
        em.remove(at);
    }

    public ActionType findOne(Long id) {return em.find(ActionType.class, id);}

    public List<ActionType> findAll() {
        return em.createQuery("select at from ActionType at", ActionType.class).getResultList();
    }

}
