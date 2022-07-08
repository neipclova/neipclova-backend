package neipclova.survey.controller;

import java.util.HashMap;
import java.util.Map;
import neipclova.survey.domain.Visitor;
import neipclova.survey.domain.enums.EnumSurveyType;
import neipclova.survey.service.StartService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartController {
    private final StartService startService;

    public StartController(StartService startService) {
        this.startService = startService;
    }

    @PostMapping("/start/{survey_type}")
    public ResponseEntity<Map<String, Object>> start(
            @RequestBody Visitor visitor,
            @PathVariable EnumSurveyType survey_type) {
        Long visitorId = startService.saveVisitor(visitor);
        Long visitorSurveyResultId  = startService.startSurvey(visitor, survey_type);

        Map<String, Object> result = new HashMap<>();
        result.put("visitor_id", visitorId);
        result.put("visitor_survey_result_id", visitorSurveyResultId);

        return ResponseEntity.ok().body(result);
    }

}