package neipclova.survey.repository;

import neipclova.survey.domain.LogVisitorPageEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogVisitorPageEntryRepository extends JpaRepository<LogVisitorPageEntry, Long> {
}