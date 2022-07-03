package neipclova.survey.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import neipclova.survey.domain.Visitor;
import neipclova.survey.domain.VisitorSurveyAnswer;
import neipclova.survey.domain.VisitorSurveyResult;
import neipclova.survey.repository.VisitorSurveyAnswerRepository;
import neipclova.survey.service.AnswerService;
import neipclova.survey.service.ResultService;
import neipclova.survey.service.StartService;

public class ResultController {

    private ResultService resultService;
    private AnswerService answerService;
    private VisitorSurveyAnswerRepository visitorSurveyAnswerRepository;
    @PostMapping("/result/{survey_type}")
    public void SurveyResult(@RequestBody VisitorSurveyResult vsr) {

        int[] mbti = {0, 0, 0, 0};
        List<VisitorSurveyAnswer> visitorAnswers = visitorSurveyAnswerRepository.findByByVisitorId(vsr.getVisitor_id());



        resultService.addResult();
    }

}
