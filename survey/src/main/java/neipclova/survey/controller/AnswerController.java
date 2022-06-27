package neipclova.survey.controller;

import java.util.Map;
import neipclova.survey.domain.VisitorSurveyAnswer;
import neipclova.survey.repository.VisitorSurveyAnswerRepository;
import neipclova.survey.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnswerController {

    private AnswerService answerService;

    @PostMapping("/answer/{survey_type}")
    public void getSurveyAnswer(@RequestBody VisitorSurveyAnswer vsa) {
        answerService.addAnswer(vsa);
    }


}
