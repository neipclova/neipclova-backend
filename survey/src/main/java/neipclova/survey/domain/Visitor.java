package neipclova.survey.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import org.hibernate.annotations.CreationTimestamp;

@Entity
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

    @Column(name="created_at", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @CreationTimestamp
    private Timestamp timestamp;
}
