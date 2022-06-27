package neipclova.survey.service;

import lombok.RequiredArgsConstructor;
import neipclova.survey.domain.Visitor;
import neipclova.survey.domain.VisitorSurveyResult;
import neipclova.survey.domain.enums.EnumSurveyType;
import neipclova.survey.repository.VisitorRepository;

import neipclova.survey.repository.VisitorSurveyResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class StartService {
    @Autowired
    private final VisitorRepository visitorRepository;
    private final VisitorSurveyResultRepository visitorSurveyResultRepository;

    public Long saveVisitor(Visitor visitor){
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
