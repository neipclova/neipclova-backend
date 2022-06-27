package neipclova.survey.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import neipclova.survey.domain.Question;
import neipclova.survey.domain.Answer;
import neipclova.survey.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public class SurveyController {

    public Question question;
    public Answer answer;
    public SurveyService surveyService;

    @GetMapping("/start/{survey_type}")
    public ResponseEntity<Map<String, Object>> returnContent() {
        Map<String, Object> result = new HashMap<>();
        List<Question> totalQuestion = surveyService.getQuestion(question);
        List<Answer> totalAnswer = surveyService.getAnswer(answer);
        result.put("questions", totalQuestion);
        result.put("options", totalAnswer);

        return ResponseEntity.ok().body(result);
    }
}