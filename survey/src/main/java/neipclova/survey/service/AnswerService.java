package neipclova.survey.service;

import lombok.RequiredArgsConstructor;
import neipclova.survey.domain.Option;
import neipclova.survey.domain.Question;
import neipclova.survey.domain.VisitorSurveyAnswer;
import neipclova.survey.domain.VisitorSurveyResult;
import neipclova.survey.repository.*;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AnswerService {

    private final VisitorSurveyAnswerRepository visitorSurveyAnswerRepository;
    private final VisitorSurveyResultRepository visitorSurveyResultRepository;
    private final QuestionRepository questionRepository;
    private final OptionRepository optionRepository;

    public Long saveVisitorSurveyAnswer(Long visitor_survey_result_id, Long question_id, Long option_id) throws IllegalAccessException {
        Optional<VisitorSurveyResult> visitorSurveyResult = visitorSurveyResultRepository.findById(visitor_survey_result_id);
        visitorSurveyResult.orElseThrow(() -> new IllegalAccessException("Could not find visitor_survey_result with id "+visitor_survey_result_id));

        Optional<Question> question = questionRepository.findById(question_id);
        question.orElseThrow(() -> new IllegalAccessException("Could not find question with id "+question_id));

        Optional<Option> option = optionRepository.findById(option_id);
        option.orElseThrow(() -> new IllegalAccessException("Could not find option with id "+option_id));

        VisitorSurveyAnswer visitorSurveyAnswer = new VisitorSurveyAnswer();

        visitorSurveyAnswer.setVisitorSurveyResult(visitorSurveyResult.get());
        visitorSurveyAnswer.setQuestion(question.get());
        visitorSurveyAnswer.setOption(option.get());

        visitorSurveyAnswerRepository.save(visitorSurveyAnswer);

        return visitorSurveyAnswer.getId();
    }
}