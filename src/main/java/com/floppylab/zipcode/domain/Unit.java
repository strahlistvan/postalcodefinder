package com.floppylab.zipcode.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
@JsonInclude(Include.NON_NULL)
public class Unit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private Integer zipCode;

    @Column(length = 100, nullable = false)
    private String settlement;

    @Column(length = 100)
    private String settlementPart;

    @Column(length = 100)
    private String streetName;

    @Column(length = 100)
    private String streetSuffix;

    private Integer firstNumber;

    private Integer secondNumber;

    @Column(length = 10)
    private String district;

}
