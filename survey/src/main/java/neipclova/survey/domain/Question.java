package neipclova.survey.domain;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import neipclova.survey.domain.enums.EnumSurveyType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

@Getter
@Setter
@NoArgsConstructor
@Entity
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "question_order")
    private Integer questionOrder;

    @Type(type = "jsonb")
    @Column(name = "question", columnDefinition = "jsonb")
    private QuestionJson question;

    @Column(name = "image_uri", nullable = true)
    private String imageUri;

    @Column(name = "survey_type")
    @Enumerated(EnumType.STRING)
    private EnumSurveyType surveyType;
}

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
class QuestionJson {
    @JsonProperty("student")
    public String student;

    @JsonProperty("worker")
    public String worker;
}
