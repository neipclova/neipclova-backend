package neipclova.survey.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import neipclova.survey.domain.common.TimeEntity;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class Visitor extends TimeEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private Long id;

    @Column(name = "ip_address")
    private String ipAddress;

    @Column(name = "agent_os")
    private String agentOs;

    @Column(name = "agent_browser")
    private String agentBrowser;

    @Column(name = "access_url")
    private String accessUrl;

}
