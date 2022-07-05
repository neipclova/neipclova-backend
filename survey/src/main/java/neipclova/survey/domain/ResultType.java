package neipclova.survey.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class ResultType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // TRIP, BAND, DANCE, CLIMBING, READING, STOCK_INVESTMENT, DEBATE, CALLIGRAPHY, STAY_HYDRATED
    @Column(name = "result_type")
    private String resultType;

    @ManyToOne
    @JoinColumn(name = "surveytype_id")
    private SurveyType surveyType;

}
