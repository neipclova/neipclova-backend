package neipclova.survey.service;

import lombok.RequiredArgsConstructor;
import neipclova.survey.domain.ResultType;
import neipclova.survey.repository.ResultTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ResultTypeService {
    @Autowired
    private final ResultTypeRepository resultTypeRepository;

    @Transactional
    public Long addResultType(ResultType resultType) {
        resultTypeRepository.save(resultType);
        return resultType.getId();
    }

}
