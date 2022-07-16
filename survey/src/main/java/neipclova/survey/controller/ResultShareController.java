package neipclova.survey.controller;

import java.util.HashMap;
import java.util.Map;
import neipclova.survey.domain.enums.EnumShareActionType;
import neipclova.survey.domain.enums.EnumSurveyType;
import neipclova.survey.service.VisitorSurveyResultShareService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResultShareController {

    private final VisitorSurveyResultShareService visitorSurveyResultShareService;

    public ResultShareController(VisitorSurveyResultShareService visitorSurveyResultShareService) {
        this.visitorSurveyResultShareService = visitorSurveyResultShareService;
    }

    @PostMapping("/share")
    public ResponseEntity<Map<String, Object>> share(
        @RequestParam("visitorSurveyResultId") Long visitorSurveyResultId,
        @RequestParam("shareActionType") EnumShareActionType shareActionType
    ) {
        Long visitorSurveyResultShareId = visitorSurveyResultShareService.addVisitorSurveyResultShare(visitorSurveyResultId, shareActionType);

        Map<String, Object> result = new HashMap<>();
        result.put("visitorSurveyResultShareId", visitorSurveyResultShareId);

        return ResponseEntity.ok().body(result);
    }

}
