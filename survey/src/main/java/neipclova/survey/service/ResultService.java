package neipclova.survey.service;

import lombok.RequiredArgsConstructor;
import neipclova.survey.domain.VisitorSurveyAnswer;
import neipclova.survey.domain.VisitorSurveyResult;
import neipclova.survey.repository.VisitorSurveyAnswerRepository;
import neipclova.survey.repository.VisitorSurveyResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ResultService {
    private VisitorSurveyResultRepository visitorSurveyResultRepository;

    @Transactional
    public Long addResult(VisitorSurveyResult result) {
        visitorSurveyResultRepository.save(result);
        return result.getVisitor().getId();
    }
}
