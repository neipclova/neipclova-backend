package neipclova.survey.repository;

import neipclova.survey.domain.VisitorPageEntryLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitorPageEntryLogRepository extends JpaRepository<VisitorPageEntryLog, Long> {
}