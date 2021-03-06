package neipclova.survey.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import neipclova.survey.domain.common.TimeEntity;

@Entity
@NoArgsConstructor
@Getter @Setter
public class VisitorSurveyAnswer extends TimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "visitor_survey_result_id")
    private VisitorSurveyResult visitorSurveyResult;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;

    @ManyToOne
    @JoinColumn(name = "option_id")
    private Option option;
}
