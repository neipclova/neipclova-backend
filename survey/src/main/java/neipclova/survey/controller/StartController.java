package neipclova.survey.controller;

import java.util.HashMap;
import java.util.Map;
import neipclova.survey.domain.Visitor;
import neipclova.survey.service.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/start")
public class StartController {

    @Autowired
    private VisitorService visitorService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Map<String, Object>> addVisitor(@RequestBody Visitor visitor) {
        visitorService.addVisitor(visitor);
        Long visitor_id = visitor.getId();
        String ip_address = visitor.getIp_address();
        System.out.println("visitor_id : " + visitor_id);
        System.out.println("ip_address : " + ip_address);
        Map<String, Object> result = new HashMap<>();
        result.put("visitor_id", visitor_id);
        return ResponseEntity.ok().body(result);
    }
}