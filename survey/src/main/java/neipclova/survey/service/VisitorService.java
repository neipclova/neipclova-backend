package neipclova.survey.service;

import lombok.RequiredArgsConstructor;
import neipclova.survey.domain.Visitor;
import neipclova.survey.repository.OptionRepository;
import neipclova.survey.repository.VisitorRepository;
import neipclova.survey.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class VisitorService {
    @Autowired
    private final VisitorRepository visitorRepository;
    private final QuestionRepository questionRepository;
    private final OptionRepository optionRepository;

    @Transactional
    public Long addVisitor(Visitor visitor) {
        System.out.println("visiisisis");
        visitorRepository.save(visitor);
        return visitor.getId();
    }

}
