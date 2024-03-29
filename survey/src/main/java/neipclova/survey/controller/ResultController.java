package neipclova.survey.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import java.util.Map;

import neipclova.survey.domain.enums.EnumMbtiType;
import neipclova.survey.domain.enums.EnumResultType;
import neipclova.survey.domain.enums.EnumSurveyType;
import neipclova.survey.repository.VisitorSurveyAnswerRepository;
import neipclova.survey.service.VisitorService;
import neipclova.survey.service.VisitorSurveyAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import neipclova.survey.domain.Visitor;

@RestController
public class ResultController {

    private final VisitorSurveyAnswerService visitorSurveyAnswerService;
    private final VisitorService visitorService;

    public ResultController(VisitorSurveyAnswerService visitorSurveyAnswerService, VisitorService visitorService){
        this.visitorSurveyAnswerService = visitorSurveyAnswerService;
        this.visitorService = visitorService;
    }

    @PostMapping("/result/{survey_type}")
    public ResponseEntity<Map<String, Object>> scoreResult(@PathVariable EnumSurveyType survey_type,
        @RequestParam Long visitor_survey_result_id) {
        // 답변에 매칭되는 mbti score 리스트 가져오기
        List<EnumMbtiType> answers = visitorSurveyAnswerService.getScores(visitor_survey_result_id);

        // mbti 계산하기
        StringBuilder mbti = new StringBuilder();

        int Ecount = Collections.frequency(answers, EnumMbtiType.E);
        int Icount = Collections.frequency(answers, EnumMbtiType.I);
        int Ncount = Collections.frequency(answers, EnumMbtiType.N);
        int Scount = Collections.frequency(answers, EnumMbtiType.S);
        int Fcount = Collections.frequency(answers, EnumMbtiType.F);
        int Tcount = Collections.frequency(answers, EnumMbtiType.T);
        int Jcount = Collections.frequency(answers, EnumMbtiType.J);
        int Pcount = Collections.frequency(answers, EnumMbtiType.P);

        if (Ecount - Icount > 0) {
            mbti.append(EnumMbtiType.E);
        } else {
            mbti.append(EnumMbtiType.I);
        }

        if (Ncount - Scount > 0) {
            mbti.append(EnumMbtiType.N);
        } else {
            mbti.append(EnumMbtiType.S);
        }

        if (Fcount - Tcount > 0) {
            mbti.append(EnumMbtiType.F);
        } else {
            mbti.append(EnumMbtiType.T);
        }

        if (Jcount - Pcount > 0) {
            mbti.append(EnumMbtiType.J);
        } else {
            mbti.append(EnumMbtiType.P);
        }

        StringBuilder club = new StringBuilder();
        EnumMbtiType mbtiType = EnumMbtiType.valueOf(mbti.toString());

        // mbti에 따른 result type 리턴하기
        if (Arrays.asList(EnumMbtiType.ENFJ, EnumMbtiType.ESFJ).contains(mbtiType)) {
            club.append(EnumResultType.STAY_HYDRATED);
        } else if (Arrays.asList(EnumMbtiType.ISFJ, EnumMbtiType.ISFP, EnumMbtiType.ISTP).contains(mbtiType)) {
            club.append(EnumResultType.CALLIGRAPHY);
        } else if (Arrays.asList(EnumMbtiType.ENTP, EnumMbtiType.INTP).contains(mbtiType)) {
            club.append(EnumResultType.DEBATE);
        } else if (Arrays.asList(EnumMbtiType.INTJ).contains(mbtiType)) {
            club.append(EnumResultType.STOCK_INVESTMENT);
        } else if (Arrays.asList(EnumMbtiType.INFP).contains(mbtiType)) {
            club.append(EnumResultType.READING);
        } else if (Arrays.asList(EnumMbtiType.ESTP).contains(mbtiType)) {
            club.append(EnumResultType.CLIMBING);
        } else if (Arrays.asList(EnumMbtiType.ENFP, EnumMbtiType.ESFP).contains(mbtiType)) {
            club.append(EnumResultType.DANCE);
        } else if (Arrays.asList(EnumMbtiType.ESTJ, EnumMbtiType.ENTJ, EnumMbtiType.ISTJ).contains(mbtiType)) {
            club.append(EnumResultType.BAND);
        } else if (Arrays.asList(EnumMbtiType.INFJ).contains(mbtiType)) {
            club.append(EnumResultType.TRIP);
        }

        Map<String, Object> result = new HashMap<>();
        result.put("result", club.toString());

        return ResponseEntity.ok().body(result);
    }

}