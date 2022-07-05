package neipclova.survey.controller;

import java.util.HashMap;
import java.util.Map;
import neipclova.survey.domain.Visitor;
import neipclova.survey.service.StartService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartController {

    private Visitor visitor;
    private final StartService startService;

    public StartController(StartService startService) {
        this.startService = startService;
    }

    @PostMapping("/start/{survey_type}")
    public ResponseEntity<Map<String, Object>> addVisitor(@RequestBody Visitor visitor,
        @PathVariable Long survey_type) {
        startService.saveVisitor(visitor);
        Long visitor_id = visitor.getId();
        Map<String, Object> result = new HashMap<>();
        result.put("visitor_id", visitor_id);
        return ResponseEntity.ok().body(result);
    }

}