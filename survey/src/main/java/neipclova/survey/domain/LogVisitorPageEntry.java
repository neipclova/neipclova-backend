package neipclova.survey.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import neipclova.survey.domain.common.TimeEntity;
import neipclova.survey.domain.enums.EnumPageType;

@Entity
@NoArgsConstructor
@Getter @Setter
public class LogVisitorPageEntry extends TimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "visitor_id")
    private Visitor visitor;

    @Column(name = "page_type")
    @Enumerated(EnumType.STRING)
    private EnumPageType pageType;

    @ManyToOne
    @JoinColumn(name = "question_id", nullable = true)
    private Question question;
}

