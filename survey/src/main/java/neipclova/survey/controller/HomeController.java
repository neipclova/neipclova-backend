package neipclova.survey.controller;

import java.util.HashMap;
import neipclova.survey.domain.Member;
import neipclova.survey.domain.Visitor;
import neipclova.survey.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import java.util.Map;
import java.util.List;

@RestController
public class HomeController {

    public Visitor visitor;
    public HomeService homeService;

    @GetMapping("/")
    public ResponseEntity<Map<String, Object>> returnTotalVisitorNum() {
        Map<String, Object> result = new HashMap<>();
        List<Visitor> totalVisitors = homeService.getTotalVisitor();
        result.put("total_visitor_num", totalVisitors.size());

        return ResponseEntity.ok().body(result);
    }
}
