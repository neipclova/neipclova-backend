package neipclova.survey.domain;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import neipclova.survey.domain.enums.EnumMbtiType;
import neipclova.survey.domain.enums.EnumSurveyType;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Option {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "option_order")
    private Integer optionOrder;

    @Column(name = "option")
    private String option;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;

    @ManyToOne
    @JoinColumn(name = "next_question_id", nullable = true)
    private Question nextQuestion;

    @Column(name = "mbti_type", nullable = true)
    @Enumerated(EnumType.STRING)
    private EnumMbtiType mbtiType;


}
