package neipclova.survey.service;

import lombok.RequiredArgsConstructor;
import neipclova.survey.domain.Visitor;
import neipclova.survey.repository.VisitorRepository;
import neipclova.survey.repository.QuestionRepository;
import neipclova.survey.repository.AnswerRepository;
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
    private final AnswerRepository answerRepository;

    @Transactional
    public Long addVisitor(Visitor visitor) {
        System.out.println("visiisisis");
        visitorRepository.save(visitor);
        return visitor.getId();
    }

    public Visitor findOne(Long visitorId) { return visitorRepository.findOne(visitorId); }

}
