package neipclova.survey.service;

import lombok.RequiredArgsConstructor;
import neipclova.survey.domain.Question;
import neipclova.survey.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class QuestionService {
    @Autowired
    private final QuestionRepository questionRepository;

    @Transactional
    public Long addQuestion(Question question) {
        questionRepository.save(question);
        return question.getId();
    }

}
