package com.floppylab.zipcode.repository;

import com.floppylab.zipcode.domain.Parameter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParameterRepository extends JpaRepository<Parameter, Long> {

    Parameter findByCode(String code);

}
