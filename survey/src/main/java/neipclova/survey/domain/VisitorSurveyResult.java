package neipclova.survey.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@NoArgsConstructor
@Getter @Setter
public class VisitorSurveyResult {

    @Id
    @ManyToOne
    @JoinColumn(name = "visitor_id")
    private Visitor visitor;

    @Enumerated
    @Column(name = "EnumSurveyResultType")
    private String result_type;

    @Column(name="created_at", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @CreationTimestamp
    private Timestamp timestamp;
}

enum EnumSurveyResultType {
    TRIP, BAND, DANCE, CLIMBING, READING, STOCK_INVESTMENT, DEBATE, CALLIGRAPHY, STAY_HYDRATED
}