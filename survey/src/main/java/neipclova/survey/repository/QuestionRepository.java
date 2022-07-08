package neipclova.survey.repository;

import neipclova.survey.domain.Question;
import neipclova.survey.domain.enums.EnumSurveyType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long> {

    List<Question> findAllBySurveyTypeOrderByQuestionOrderAsc(EnumSurveyType survey_type);
}
