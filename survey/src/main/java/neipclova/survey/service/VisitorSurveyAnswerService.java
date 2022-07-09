package neipclova.survey.service;

import java.util.List;
import java.util.Optional;

import lombok.RequiredArgsConstructor;
import neipclova.survey.domain.Visitor;
import neipclova.survey.domain.VisitorSurveyAnswer;
import neipclova.survey.domain.VisitorSurveyResult;
import neipclova.survey.domain.enums.EnumMbtiType;
import neipclova.survey.repository.VisitorSurveyAnswerRepository;
import neipclova.survey.repository.VisitorSurveyResultRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class VisitorSurveyAnswerService {

    public final VisitorSurveyAnswerRepository visitorSurveyAnswerRepository;
    public final VisitorSurveyResultRepository visitorSurveyResultRepository;
    @Transactional
    public Long addVisitorSurveyAnswer(VisitorSurveyAnswer visitorSurveyAnswer) {
        visitorSurveyAnswerRepository.save(visitorSurveyAnswer);
        return visitorSurveyAnswer.getId();
    }

    @Transactional
    public List<EnumMbtiType> getScores(Long visitor_survey_result_id) {
        Optional<VisitorSurveyResult> visitorSurveyResult = visitorSurveyResultRepository.findById(visitor_survey_result_id);
        return visitorSurveyAnswerRepository.findScoreByVisitorSurveyResultId(visitorSurveyResult.get());
    }

}
