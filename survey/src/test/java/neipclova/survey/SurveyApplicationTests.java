package neipclova.survey;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;

import neipclova.survey.controller.AnswerController;
import neipclova.survey.controller.ResultController;
import neipclova.survey.controller.StartController;
import neipclova.survey.controller.SurveyController;
import neipclova.survey.domain.Option;
import neipclova.survey.domain.Question;
import neipclova.survey.domain.Visitor;
import neipclova.survey.domain.enums.EnumSurveyType;
import neipclova.survey.dto.SaveVisitorSurveyAnswerDto;
import neipclova.survey.repository.VisitorRepository;
import neipclova.survey.repository.VisitorSurveyAnswerRepository;
import neipclova.survey.service.StartService;

@SpringBootTest
@Transactional
@SuppressWarnings("unchecked")
public class SurveyApplicationTests {

    @Autowired
    private StartService startService;

    @Autowired
    private VisitorRepository visitorRepository;

    @Autowired
    private StartController startController;

    @Autowired
    private AnswerController answerController;

    @Autowired
    private SurveyController surveyController;

    @Autowired
    private ResultController resultController;

    @Autowired
    private VisitorSurveyAnswerRepository visitorSurveyAnswerRepository;

    @Test
    public void tests() throws IllegalAccessException {

        ResponseEntity<Map<String, Object>> getSurveyResponse = surveyController.getSurvey(EnumSurveyType.valueOf("CLUB"));
        List<Question> questionData = (List<Question>) getSurveyResponse.getBody().get("questions");
        List<Option> optionData = (List<Option>) getSurveyResponse.getBody().get("options");

        final Visitor testVisitor = Visitor.builder()
                                           .id(1L)
                                           .ipAddress("127.00.00")
                                           .agentOs("mac")
                                           .agentBrowser("chrome")
                                           .accessUrl("test.com")
                                           .build();

        ResponseEntity<Map<String, Object>> startResponse = startController.start(testVisitor, EnumSurveyType.valueOf("CLUB"));

        Long visitorSurveyResultId = (Long) startResponse.getBody().get("visitor_survey_result_id");

        final Long visitorId = startService.saveVisitor(testVisitor);
        assertEquals(visitorRepository.findById(visitorId).get().getAccessUrl(), "test.com");

        for(int questionNum = 1; questionNum <= questionData.size(); questionNum++){
            SaveVisitorSurveyAnswerDto saveVisitorSurveyAnswerDto = SaveVisitorSurveyAnswerDto.builder()
                                                                                              .visitorSurveyResultId(visitorSurveyResultId)
                                                                                              .questionId(
                                                                                                      (long) questionNum)
                                                                                              .optionId(
                                                                                                      (long) (questionNum * 2))
                                                                                              .build();
            answerController.saveVisitorSurveyAnswer(saveVisitorSurveyAnswerDto);
        }
         assertEquals(visitorSurveyAnswerRepository.count(), questionData.size());

        ResponseEntity<Map<String, Object>> scoreResultResponse = resultController.scoreResult(EnumSurveyType.valueOf("CLUB"), visitorSurveyResultId);
        String resultData = (String) scoreResultResponse.getBody().get("result");
        assertEquals(resultData, "CALLIGRAPHY");
    }

}
