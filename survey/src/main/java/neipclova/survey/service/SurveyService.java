package neipclova.survey.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import neipclova.survey.domain.Question;
import neipclova.survey.domain.Option;
import neipclova.survey.domain.enums.EnumSurveyType;
import neipclova.survey.repository.OptionRepository;
import neipclova.survey.repository.QuestionRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SurveyService {
    private final QuestionRepository questionRepository;
    private final OptionRepository optionRepository;

    public List<Question> getQuestionBySurveyType(EnumSurveyType survey_type) {
        List<Question> questionData = questionRepository.findAllBySurveyTypeOrderByQuestionOrderAsc(survey_type);
        return questionData;
    }
    public List<Option> getOptionsByQuestionIds(List<Long> question_ids) {
        List<Option> optionData = optionRepository.findAllByQuestionIdInOrderByQuestionIdAsc(question_ids);
        return optionData;
    }
}
