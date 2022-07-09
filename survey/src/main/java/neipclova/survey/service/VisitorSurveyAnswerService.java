package neipclova.survey.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import neipclova.survey.domain.Visitor;
import neipclova.survey.domain.VisitorSurveyAnswer;
import neipclova.survey.domain.enums.EnumMbtiType;
import neipclova.survey.repository.VisitorSurveyAnswerRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class VisitorSurveyAnswerService {

    public final VisitorSurveyAnswerRepository visitorSurveyAnswerRepository;

    @Transactional
    public Long addVisitorSurveyAnswer(VisitorSurveyAnswer visitorSurveyAnswer) {
        visitorSurveyAnswerRepository.save(visitorSurveyAnswer);
        return visitorSurveyAnswer.getId();
    }

    @Transactional
    public List<EnumMbtiType> getScores(Visitor visitor) {
        return visitorSurveyAnswerRepository.findScoreByVisitorId(visitor);
    }

}
