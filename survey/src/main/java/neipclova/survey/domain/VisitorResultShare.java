package neipclova.survey.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import org.hibernate.annotations.CreationTimestamp;


@Getter
@NoArgsConstructor
@Entity
public class VisitorResultShare {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "visitor_id")
    private Visitor visitor;


    @Enumerated(EnumType.STRING)
    @Column(name = "EnumActionType")
    private EnumActionType action_type;

    @Column(name="created_at", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @CreationTimestamp
    private Timestamp created_at;
}

enum EnumActionType {
    KAKAO_SHARE, URL_SHARE
}