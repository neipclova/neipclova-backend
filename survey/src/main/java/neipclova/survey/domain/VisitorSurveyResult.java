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
    private Long visitor_id;

    @OneToOne
    @PrimaryKeyJoinColumn
    private Visitor visitor;

    @ManyToOne
    @JoinColumn(name = "result_type_id")
    private ResultType result_type;

    @Column(name="created_at", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @CreationTimestamp
    private Timestamp timestamp;
}