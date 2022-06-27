package neipclova.survey.repository;

import neipclova.survey.domain.VisitorSurveyAnswer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface VisitorSurveyAnswerRepository extends JpaRepository<VisitorSurveyAnswer, Long> {
}