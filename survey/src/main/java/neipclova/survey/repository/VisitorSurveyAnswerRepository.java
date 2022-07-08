package neipclova.survey.repository;

import neipclova.survey.domain.VisitorSurveyAnswer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitorSurveyAnswerRepository extends JpaRepository<VisitorSurveyAnswer, Long> {
}