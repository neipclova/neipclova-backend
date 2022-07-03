package neipclova.survey.service;

import java.util.List;

import lombok.RequiredArgsConstructor;
import neipclova.survey.domain.Answer;
import neipclova.survey.domain.Member;
import neipclova.survey.domain.VisitorSurveyAnswer;
import neipclova.survey.domain.VisitorSurveyResult;
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

    @Transactional
    public long score_answer(VisitorSurveyResult vsr) {
        int[] mbti = {0, 0, 0, 0};
        List<VisitorSurveyAnswer> visitorAnswers = visitorSurveyAnswerRepository.findByByVisitorId(vsr.getVisitor_id());

    }
}
