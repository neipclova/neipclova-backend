package neipclova.survey.controller;

import neipclova.survey.domain.VisitorSurveyAnswer;
import neipclova.survey.dto.SaveVisitorSurveyAnswerDto;
import neipclova.survey.service.AnswerService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class AnswerController {

    private final AnswerService answerService;

    public AnswerController(AnswerService answerService) {
        this.answerService = answerService;
    }

    @PostMapping("/answer")
    public void saveVisitorSurveyAnswer(@RequestBody @Valid SaveVisitorSurveyAnswerDto saveVisitorSurveyAnswerDto) throws IllegalAccessException {
        Long VisitorSurveyResultId = saveVisitorSurveyAnswerDto.getVisitor_survey_result_id();
        Long questionId = saveVisitorSurveyAnswerDto.getQuestion_id();
        Long optionId = saveVisitorSurveyAnswerDto.getOption_id();
        answerService.saveVisitorSurveyAnswer(VisitorSurveyResultId, questionId, optionId);
    }


}
