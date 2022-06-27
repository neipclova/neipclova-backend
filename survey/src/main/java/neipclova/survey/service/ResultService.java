package neipclova.survey.service;

import neipclova.survey.domain.VisitorSurveyAnswer;
import neipclova.survey.domain.VisitorSurveyResult;
import neipclova.survey.repository.VisitorSurveyAnswerRepository;
import neipclova.survey.repository.VisitorSurveyResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class ResultService {
    @Autowired
    private VisitorSurveyResultRepository visitorSurveyResultRepository;

    @Transactional
    public Long addResult(VisitorSurveyResult result) {
        visitorSurveyResultRepository.save(result);
        return result.getVisitor().getId();
    }
}
