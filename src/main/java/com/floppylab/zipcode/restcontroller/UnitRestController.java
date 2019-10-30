package com.floppylab.zipcode.restcontroller;

import com.floppylab.zipcode.domain.Unit;
import com.floppylab.zipcode.service.UnitService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UnitRestController {

    private final UnitService unitService;

    @GetMapping("/postalcodes")
    public List<Unit> findAll() {
        return unitService.findAllUnits();
    }

}
