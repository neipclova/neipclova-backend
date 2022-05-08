package neipclova.survey.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Getter @Setter
public class Visitor {

    @Id @GeneratedValue
    @Column(name = "visitor_id")
    private Long id;

    private String ip_address;
    private String agent_os;
    private String agent_browser;
    private String access_url;

    private Timestamp created_at;
}
