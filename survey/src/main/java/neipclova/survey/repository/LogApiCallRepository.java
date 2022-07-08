package neipclova.survey.repository;

import neipclova.survey.domain.LogApiCall;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description : API 호출 로그
 */
public interface LogApiCallRepository extends JpaRepository<LogApiCall, Long> {
}