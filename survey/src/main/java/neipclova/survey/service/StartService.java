package neipclova.survey.service;

import lombok.RequiredArgsConstructor;
import neipclova.survey.domain.Visitor;
import neipclova.survey.repository.VisitorRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class StartService {

    private final VisitorRepository visitorRepository;

    @Transactional
    public Long saveVisitor(Visitor visitor){
        visitorRepository.save(visitor);
        return visitor.getId();
    }

}
