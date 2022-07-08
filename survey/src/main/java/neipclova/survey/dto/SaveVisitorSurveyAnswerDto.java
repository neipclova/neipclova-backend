package neipclova.survey.dto;


import lombok.Getter;

import javax.validation.constraints.NotNull;

@Getter
public class SaveVisitorSurveyAnswerDto {

    @NotNull
    private Long visitorSurveyResultId;

    @NotNull
    private Long questionId;

    @NotNull
    private Long optionId;
}
