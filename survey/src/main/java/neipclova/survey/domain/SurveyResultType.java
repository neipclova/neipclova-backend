package neipclova.survey.domain;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import neipclova.survey.domain.enums.EnumResultType;
import neipclova.survey.domain.enums.EnumSurveyType;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class SurveyResultType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "survey_type")
    @Enumerated(EnumType.STRING)
    private EnumSurveyType surveyType;

    @Column(name = "result_type")
    @Enumerated(EnumType.STRING)
    private EnumResultType resultType;

    @Column(name = "image_uri")
    private String imageUri;
}

