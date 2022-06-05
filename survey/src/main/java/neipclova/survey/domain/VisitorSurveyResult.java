package neipclova.survey.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import neipclova.survey.domain.common.TimeEntity;
import neipclova.survey.domain.enums.EnumSurveyType;

@Entity
@NoArgsConstructor
@Getter @Setter
public class VisitorSurveyResult extends TimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "visitor_id")
    private Visitor visitor;

<<<<<<< HEAD
    @Column(name = "survey_type")
    @Enumerated(EnumType.STRING)
    private EnumSurveyType surveyType;

    @ManyToOne
    @JoinColumn(name = "survey_result_type_id", nullable = true)
    private SurveyResultType surveyResultType;
=======
    @ManyToOne
    @JoinColumn(name = "resulttype_id")
    private ResultType result_type;

    @Column(name="created_at", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @CreationTimestamp
    private Timestamp timestamp;
>>>>>>> b3ac223 (feat: add DB schema for survey contents)
}