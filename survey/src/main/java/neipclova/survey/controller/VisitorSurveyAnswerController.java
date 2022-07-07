package neipclova.survey.controller;

import neipclova.survey.domain.VisitorSurveyAnswer;
import neipclova.survey.service.VisitorSurveyAnswerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VisitorSurveyAnswerController {

    private VisitorSurveyAnswerService visitorSurveyAnswerService;

    @PostMapping("/answer/{survey_type}")
    public void getSurveyAnswer(@RequestBody VisitorSurveyAnswer vsa) {
        visitorSurveyAnswerService.addVisitorSurveyAnswer(vsa);
    }

}
