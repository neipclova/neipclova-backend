package neipclova.survey.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import neipclova.survey.domain.Question;
import neipclova.survey.domain.Answer;
import neipclova.survey.repository.QuestionRepository;
import neipclova.survey.repository.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SurveyService {

    private final QuestionRepository questionRepository;
    private final AnswerRepository answerRepository;

    public List<Question> getQuestion(Question question) {
        return questionRepository.findAll();
    }
    public List<Answer> getAnswer(Answer answer) {
        return answerRepository.findAll();
    }
}
