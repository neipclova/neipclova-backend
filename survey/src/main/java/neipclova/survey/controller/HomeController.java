package neipclova.survey.controller;

import java.util.HashMap;

import neipclova.survey.service.HomeService;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import java.util.Map;

@RestController
public class HomeController {

    private final HomeService homeService;

    public HomeController(HomeService homeService) {
        this.homeService = homeService;
    }

    @GetMapping("/")
    public ResponseEntity<Map<String, Object>> getTotalVisitorNum() {
        System.out.println("start");
        Map<String, Object> result = new HashMap<>();
        Integer totalVisitorNum = homeService.getTotalVisitorNum();
        result.put("total_visitor_num", totalVisitorNum);
        System.out.println(result);
        return ResponseEntity.ok().body(result);
    }
}
