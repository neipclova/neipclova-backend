package neipclova.survey.controller;

import java.util.HashMap;
import neipclova.survey.domain.Visitor;
import neipclova.survey.service.HomeService;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import java.util.Map;
import java.util.List;

@RestController
public class HomeController {

    private Visitor visitor;
    private final HomeService homeService;

    public HomeController(HomeService homeService) {
        this.homeService = homeService;
    }

    @GetMapping("/")
    public ResponseEntity<Map<String, Object>> returnTotalVisitorNum() {
        Map<String, Object> result = new HashMap<>();
        try {
            List<Visitor> totalVisitors = homeService.getTotalVisitor();
            result.put("total_visitor_num", totalVisitors.size());
        } catch (NullPointerException e) {
            result.put("total_visitor_num", 0);
        }
        return ResponseEntity.ok().body(result);
    }
}
