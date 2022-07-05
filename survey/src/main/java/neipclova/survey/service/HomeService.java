package neipclova.survey.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import neipclova.survey.domain.Visitor;
import neipclova.survey.repository.VisitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HomeService {

    private final VisitorRepository visitorRepository;

    public List<Visitor> getTotalVisitor() {
        return visitorRepository.findAll();
    }


}
