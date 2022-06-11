package neipclova.survey.repository;

import neipclova.survey.domain.ActionType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActionTypeRepository extends JpaRepository<ActionType, Long> {
}
