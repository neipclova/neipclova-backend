package neipclova.survey.repository;

import neipclova.survey.domain.VisitorSurveyResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface VisitorSurveyResultRepository extends JpaRepository<VisitorSurveyResult, Long> {
}