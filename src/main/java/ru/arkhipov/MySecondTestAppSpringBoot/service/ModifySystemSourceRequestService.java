package ru.arkhipov.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.arkhipov.MySecondTestAppSpringBoot.model.Request;

@Service
public class ModifySystemSourceRequestService implements ModifyRequestService {
    @Override
    public void modify(Request request) {
        request.setSource("Изменение source");
    }
}