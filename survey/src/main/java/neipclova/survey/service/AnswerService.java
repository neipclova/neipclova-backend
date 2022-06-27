package neipclova.survey.service;

import lombok.RequiredArgsConstructor;
import neipclova.survey.domain.Answer;
import neipclova.survey.domain.VisitorSurveyAnswer;
import neipclova.survey.repository.VisitorSurveyAnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class AnswerService {
    @Autowired
    private VisitorSurveyAnswerRepository visitorSurveyAnswerRepository;

    @Transactional
    public Long addAnswer(VisitorSurveyAnswer answer) {
        visitorSurveyAnswerRepository.save(answer);
        return answer.getId();
    }

}
