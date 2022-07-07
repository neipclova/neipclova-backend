package neipclova.survey.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@NoArgsConstructor
@Getter @Setter
public class Visitor {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "visitor_id", columnDefinition = "serial")
    private Long id;

    private String ip_address;
    private String agent_os;
    private String agent_browser;
    private String access_url;

    @Column(name = "created_at")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss", timezone="Asia/Seoul")
    private Timestamp timestamp;

}
