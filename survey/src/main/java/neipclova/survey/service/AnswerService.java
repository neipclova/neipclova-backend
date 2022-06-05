package neipclova.survey.service;

import lombok.RequiredArgsConstructor;
import neipclova.survey.domain.Answer;
import neipclova.survey.repository.AnswerRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class AnswerService {

    private final AnswerRepository answerRepository;

    @Transactional
    public Long addAnswer(Answer answer) {
        answerRepository.save(answer);
        return answer.getId();
    }

}
