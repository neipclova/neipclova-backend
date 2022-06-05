package neipclova.survey.service;

import lombok.RequiredArgsConstructor;
import neipclova.survey.domain.ActionType;
import neipclova.survey.repository.ActionTypeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ActionTypeService {

    private final ActionTypeRepository actionTypeRepository;

    @Transactional
    public Long addActionType(ActionType actionType) {
        actionTypeRepository.save(actionType);
        return actionType.getId();
    }

}