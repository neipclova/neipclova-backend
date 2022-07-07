package neipclova.survey.repository;

import java.util.List;
import neipclova.survey.domain.Visitor;
import neipclova.survey.domain.VisitorResultShare;
import neipclova.survey.domain.VisitorSurveyAnswer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface VisitorSurveyAnswerRepository extends JpaRepository<VisitorSurveyAnswer, Long> {

    @Query("select a.score from VisitorSurveyAnswer vsa left join Answer a on vsa.question = a.question and vsa.answer = a.answer_order where vsa.visitor = :visitor")
    public List<String> findScoreByVisitorId(@Param("visitor") Visitor visitor);

}