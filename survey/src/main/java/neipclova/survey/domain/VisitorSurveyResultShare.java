package neipclova.survey.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import neipclova.survey.domain.common.TimeEntity;
import neipclova.survey.domain.enums.EnumShareActionType;


@Getter
@NoArgsConstructor
@Entity
public class VisitorSurveyResultShare extends TimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "visitor_survey_result_id")
    private VisitorSurveyResult visitorSurveyResult;

    @Column(name = "share_action_type")
    @Enumerated(EnumType.STRING)
    private EnumShareActionType shareActionType;
}