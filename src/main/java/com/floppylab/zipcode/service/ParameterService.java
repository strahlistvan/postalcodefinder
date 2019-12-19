package com.floppylab.zipcode.service;

import com.floppylab.zipcode.repository.ParameterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ParameterService {

    private final ParameterRepository parameterRepository;

    public String getLastModificationDate() {
        return findValueByCode("date.lastModification");
    }

    private String findValueByCode(String code) {
        return parameterRepository.findByCode(code).getValues();
    }

}
