package neipclova.survey.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import java.util.Map;

import neipclova.survey.domain.enums.EnumMbtiType;
import neipclova.survey.service.VisitorService;
import neipclova.survey.service.VisitorSurveyAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import neipclova.survey.domain.Visitor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/result/club")
public class ResultController {

    @Autowired
    private VisitorSurveyAnswerService visitorSurveyAnswerService;

    @Autowired
    private VisitorService visitorService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Map<String, Object>> SurveyResult(@RequestBody Visitor visitor) {

        // 답변에 매칭되는 mbti score 리스트 가져오기
        Long visitorId = visitor.getId();
        Visitor visitor1 = visitorService.findOne(visitorId);
        List<EnumMbtiType> answers = visitorSurveyAnswerService.getScores(visitor1);

        // mbti 계산하기
        StringBuilder mbti = new StringBuilder();

        int Ecount = Collections.frequency(answers, "E");
        int Icount = Collections.frequency(answers, "I");
        int Ncount = Collections.frequency(answers, "N");
        int Scount = Collections.frequency(answers, "S");
        int Fcount = Collections.frequency(answers, "F");
        int Tcount = Collections.frequency(answers, "T");
        int Jcount = Collections.frequency(answers, "J");
        int Pcount = Collections.frequency(answers, "P");

        if (Ecount - Icount > 0) {
            mbti.append("E");
        } else {
            mbti.append("I");
        }

        if (Ncount - Scount > 0) {
            mbti.append("N");
        } else {
            mbti.append("S");
        }

        if (Fcount - Tcount > 0) {
            mbti.append("F");
        } else {
            mbti.append("T");
        }

        if (Jcount - Pcount > 0) {
            mbti.append("J");
        } else {
            mbti.append("P");
        }

        StringBuilder club = new StringBuilder();

        // mbti에 따른 result type 리턴하기
        if (Arrays.asList("ENFJ", "ESFJ").contains(mbti.toString())) {
            club.append("STAY_HYDRATED");
        } else if (Arrays.asList("ISJF", "ISFP", "ISTJ").contains(mbti.toString())) {
            club.append("CALLIGRAPHY");
        } else if (Arrays.asList("ENTP", "INTP").contains(mbti.toString())) {
            club.append("DEBATE");
        } else if (Arrays.asList("INTJ").contains(mbti.toString())) {
            club.append("STOCK_INVESTMENT");
        } else if (Arrays.asList("INFP").contains(mbti.toString())) {
            club.append("READING");
        } else if (Arrays.asList("ESTP").contains(mbti.toString())) {
            club.append("CLIMBING");
        } else if (Arrays.asList("ENFP", "ESFP").contains(mbti.toString())) {
            club.append("DANCE");
        } else if (Arrays.asList("ESTJ", "ENTJ", "ISTJ").contains(mbti.toString())) {
            club.append("BAND");
        } else if (Arrays.asList("INFJ").contains(mbti.toString())) {
            club.append("TRIP");
        }

        Map<String, Object> result = new HashMap<>();
        result.put("result", club.toString());

        return ResponseEntity.ok().body(result);
    }

}
