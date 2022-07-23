package neipclova.survey.repository;

import java.util.List;
import neipclova.survey.domain.Visitor;
import neipclova.survey.domain.VisitorSurveyAnswer;
import neipclova.survey.domain.VisitorSurveyResult;
import neipclova.survey.domain.enums.EnumMbtiType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface VisitorSurveyAnswerRepository extends JpaRepository<VisitorSurveyAnswer, Long> {

    @Query("select vsa.option.mbtiType from VisitorSurveyAnswer vsa where vsa.visitorSurveyResult = :visitor_survey_result")
    public List<EnumMbtiType> findScoreByVisitorSurveyResultId(@Param("visitor_survey_result") VisitorSurveyResult visitor_survey_result);

}