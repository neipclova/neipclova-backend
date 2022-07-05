package neipclova.survey.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import neipclova.survey.domain.Question;
import neipclova.survey.domain.Answer;
import neipclova.survey.service.SurveyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SurveyController {

    private Question question;
    private Answer answer;
    private final SurveyService surveyService;

    public SurveyController(SurveyService surveyService) {
        this.surveyService = surveyService;
    }

    @GetMapping("/survey/{survey_type}")
    public ResponseEntity<Map<String, Object>> returnContent(@PathVariable Long survey_type) {
        Map<String, Object> result = new HashMap<>();
        List<Question> totalQuestion = surveyService.getQuestion(question);
        List<Answer> totalAnswer = surveyService.getAnswer(answer);
        result.put("questions", totalQuestion);
        result.put("options", totalAnswer);

        return ResponseEntity.ok().body(result);
    }
}