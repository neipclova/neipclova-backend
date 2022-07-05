package neipclova.survey.controller;

import neipclova.survey.domain.VisitorSurveyAnswer;
import neipclova.survey.service.AnswerService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnswerController {

    private final AnswerService answerService;

    public AnswerController(AnswerService answerService) {
        this.answerService = answerService;
    }

    @PostMapping("/answer/{survey_type}")
    public void getSurveyAnswer(@RequestBody VisitorSurveyAnswer vsa,
        @PathVariable String survey_type) {
        answerService.addAnswer(vsa);
    }


}
