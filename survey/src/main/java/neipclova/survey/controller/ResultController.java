package neipclova.survey.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import neipclova.survey.domain.Visitor;
import neipclova.survey.service.StartService;

public class ResultController {
    private StartService startService;

    @PostMapping ("/result/{survey_type}")
    public ResponseEntity<Map<String, Object>> addVisitor(@RequestBody Visitor visitor) {
        startService.saveVisitor(visitor);
        Long visitor_id = visitor.getId();
        Map<String, Object> result = new HashMap<>();
        result.put("visitor_id", visitor_id);
        return ResponseEntity.ok().body(result);
    }

}
