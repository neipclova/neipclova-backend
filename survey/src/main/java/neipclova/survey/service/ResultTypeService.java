package neipclova.survey.service;

import lombok.RequiredArgsConstructor;
import neipclova.survey.domain.SurveyResultType;
import neipclova.survey.repository.SurveyResultTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ResultTypeService {
    @Autowired
    private final SurveyResultTypeRepository surveyResultTypeRepository;

    @Transactional
    public Long addResultType(SurveyResultType surveyResultType) {
        surveyResultTypeRepository.save(surveyResultType);
        return surveyResultType.getId();
    }

}
