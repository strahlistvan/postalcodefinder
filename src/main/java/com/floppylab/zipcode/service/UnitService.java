package com.floppylab.zipcode.service;

import com.floppylab.zipcode.domain.Unit;
import com.floppylab.zipcode.repository.UnitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UnitService {

    private final UnitRepository unitRepository;

    public List<Unit> findAllUnits() {
        return unitRepository.findAll();
    }
}
