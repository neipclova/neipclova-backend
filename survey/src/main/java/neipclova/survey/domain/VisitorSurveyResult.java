package neipclova.survey.domain;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@NoArgsConstructor
@Getter @Setter
public class VisitorSurveyResult implements Serializable {

    @Id
    @OneToOne
    @JoinColumn(name = "visitor_id")
    private Visitor visitor;

    @Enumerated(EnumType.STRING)
    @Column(name = "EnumSurveyResultType")
    private EnumSurveyResultType result_type;

    @Column(name="created_at", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @CreationTimestamp
    private Timestamp timestamp;
}

enum EnumSurveyResultType {
    TRIP, BAND, DANCE, CLIMBING, READING, STOCK_INVESTMENT, DEBATE, CALLIGRAPHY, STAY_HYDRATED
}