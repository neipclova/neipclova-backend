package neipclova.survey.repository;

import neipclova.survey.domain.ApiCallLog;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ApiCallLogRepository extends JpaRepository<ApiCallLog, Long> {
}