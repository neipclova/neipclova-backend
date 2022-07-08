package neipclova.survey.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import neipclova.survey.domain.common.TimeEntity;
import neipclova.survey.domain.enums.EnumMethodType;

@Entity
@NoArgsConstructor
@Getter @Setter
public class LogApiCall extends TimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "client_server_info")
    private String clientServerInfo;

    @Enumerated(EnumType.STRING)
    @Column(name = "method_type")
    private EnumMethodType method_type;

    private String header;

    @Column(name = "request_body")
    private String requestBody;

    @Column(name = "response_body")
    private String responseBody;
}

