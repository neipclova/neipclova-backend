package neipclova.survey.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import neipclova.survey.repository.VisitorRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HomeService {
    private final VisitorRepository visitorRepository;

    public Integer getTotalVisitorNum() {
        return visitorRepository.findAll().size();
    }


}
