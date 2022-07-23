package neipclova.survey.service;

import java.util.Optional;
import lombok.RequiredArgsConstructor;
import neipclova.survey.domain.Visitor;
import neipclova.survey.domain.VisitorSurveyResult;
import neipclova.survey.domain.VisitorSurveyResultShare;
import neipclova.survey.domain.enums.EnumShareActionType;
import neipclova.survey.repository.VisitorSurveyResultRepository;
import neipclova.survey.repository.VisitorSurveyResultShareRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class VisitorSurveyResultShareService {

    public final VisitorSurveyResultShareRepository visitorSurveyResultShareRepository;
    public final VisitorSurveyResultRepository visitorSurveyResultRepository;

    @Transactional
    public Long addVisitorSurveyResultShare(Long visitor_survey_result_id, EnumShareActionType share_action_type) {
        Optional<VisitorSurveyResult> visitorSurveyResult = visitorSurveyResultRepository.findById(visitor_survey_result_id);

        VisitorSurveyResultShare visitorSurveyResultShare = new VisitorSurveyResultShare();

        visitorSurveyResultShare.setVisitorSurveyResult(visitorSurveyResult.get());
        visitorSurveyResultShare.setShareActionType(share_action_type);

        visitorSurveyResultShareRepository.save(visitorSurveyResultShare);
        return visitorSurveyResultShare.getId();
    }

}
