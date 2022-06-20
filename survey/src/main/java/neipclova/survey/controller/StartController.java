package neipclova.survey.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import neipclova.survey.domain.Visitor;
import neipclova.survey.service.StartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


public class StartController {

    @Autowired
    private StartService startService;

    @PostMapping
    public ResponseEntity<Map<String, Object>> addVisitor(@RequestBody Visitor visitor) {
        startService.saveVisitor(visitor);
        Long visitor_id = visitor.getId();
        Map<String, Object> result = new HashMap<>();
        result.put("visitor_id", visitor_id);
        return ResponseEntity.ok().body(result);
    }

}