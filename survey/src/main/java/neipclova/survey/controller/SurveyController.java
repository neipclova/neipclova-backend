package neipclova.survey.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import neipclova.survey.domain.Question;
import neipclova.survey.domain.Option;
import neipclova.survey.domain.enums.EnumSurveyType;
import neipclova.survey.service.SurveyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SurveyController {
    private final SurveyService surveyService;

    public SurveyController(SurveyService surveyService) {
        this.surveyService = surveyService;
    }

    @GetMapping("/survey/{survey_type}")
    public ResponseEntity<Map<String, Object>> getSurvey(@PathVariable EnumSurveyType survey_type) {
        Map<String, Object> result = new HashMap<>();
        List<Question> questionData = surveyService.getQuestionBySurveyType(survey_type);

        List<Long> questionIds = new ArrayList<>();
        for (int i = 0; i < questionData.size(); i++) {
            questionIds.add(questionData.get(i).getId());
        }
        List<Option> optionData = surveyService.getOptionsByQuestionIds(questionIds);

        result.put("questions", questionData);
        result.put("options", optionData);

        return ResponseEntity.ok().body(result);
    }
}