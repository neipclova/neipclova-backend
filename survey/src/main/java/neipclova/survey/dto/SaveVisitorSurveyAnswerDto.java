package neipclova.survey.dto;


import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotNull;

@Getter
@Builder
public class SaveVisitorSurveyAnswerDto {

    @NotNull
    private Long visitor_survey_result_id;

    @NotNull
    private Long question_id;

    @NotNull
    private Long option_id;
}
