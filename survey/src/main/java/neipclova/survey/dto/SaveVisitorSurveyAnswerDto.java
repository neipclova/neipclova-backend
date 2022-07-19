package neipclova.survey.dto;


import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotNull;

@Getter
@Builder
public class SaveVisitorSurveyAnswerDto {

    @NotNull
    private Long visitorSurveyResultId;

    @NotNull
    private Long questionId;

    @NotNull
    private Long optionId;
}
