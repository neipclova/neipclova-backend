package neipclova.survey.repository;

import javax.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import neipclova.survey.domain.Visitor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class VisitorRepository {

    private final EntityManager em;

    public void save(Visitor visitor) {
        em.persist(visitor);
    }

}
