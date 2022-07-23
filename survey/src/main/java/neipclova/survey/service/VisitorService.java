package neipclova.survey.service;

import lombok.RequiredArgsConstructor;
import neipclova.survey.domain.Visitor;
import neipclova.survey.repository.VisitorRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class VisitorService {
    private final VisitorRepository visitorRepository;

    @Transactional
    public Long addVisitor(Visitor visitor) {
        visitorRepository.save(visitor);
        return visitor.getId();
    }

    public Visitor findOne(Long visitor_id) { return visitorRepository.findOne(visitor_id); }

}