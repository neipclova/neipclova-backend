package neipclova.survey.service;

import lombok.RequiredArgsConstructor;
import neipclova.survey.domain.SurveyType;
import neipclova.survey.repository.SurveyTypeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class SurveyTypeService {

    private final SurveyTypeRepository surveyTypeRepository;

    @Transactional
    public Long addSurveyType(SurveyType surveyType) {
        surveyTypeRepository.save(surveyType);
        return surveyType.getId();
    }

}
