package neipclova.survey.service;

import lombok.RequiredArgsConstructor;
import neipclova.survey.domain.Visitor;
import neipclova.survey.domain.VisitorSurveyResult;
import neipclova.survey.domain.enums.EnumSurveyType;
import neipclova.survey.repository.VisitorRepository;

import neipclova.survey.repository.VisitorSurveyResultRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StartService {
    private final VisitorRepository visitorRepository;
    private final VisitorSurveyResultRepository visitorSurveyResultRepository;

    public final Long saveVisitor(Visitor visitor){
        visitorRepository.save(visitor);
        return visitor.getId();
    }

    public Long startSurvey(Visitor visitor, EnumSurveyType survey_type) {
        VisitorSurveyResult visitorSurveyResult = new VisitorSurveyResult();
        visitorSurveyResult.setVisitor(visitor);
        visitorSurveyResult.setSurveyType(survey_type);

        visitorSurveyResultRepository.save(visitorSurveyResult);

        return visitorSurveyResult.getId();
    }
}
