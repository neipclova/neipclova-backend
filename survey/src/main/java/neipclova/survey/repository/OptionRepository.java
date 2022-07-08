package neipclova.survey.repository;

import neipclova.survey.domain.Option;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface OptionRepository extends JpaRepository<Option, Long> {

    List<Option> findAllByQuestionIdInOrderByQuestionIdAsc(List<Long> question_ids);
}
