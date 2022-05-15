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
public class VisitorPageEntryLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = 'visitor_id')
    private Visitor visitor;

    @Enumerated
    @Column(name = 'EnumSurveyResultType')
    private String page_type;

    @Column(name="created_at", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @CreationTimestamp
    private LocalDateTime created_at;
}

public enum EnumSurveyResultType {

}