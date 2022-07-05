package neipclova.survey.repository;

import neipclova.survey.domain.SurveyType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurveyTypeRepository extends JpaRepository<SurveyType, Long> {
}

