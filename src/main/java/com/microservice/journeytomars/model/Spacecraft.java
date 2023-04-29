package com.microservice.journeytomars.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Entity
public class Spacecraft {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Pattern(regexp = "^[1-9]\\d*(0{2,}|[3,6,9])$",
            message=" Somente inteiros, positivos, multiplos de 3")
    private Integer seatsAvailable;

    @Pattern(regexp = "^[a-z]{4}-\\d{4}$",
            message="No  formato  aaaa-9999,  onde  a são letras  de  a-z  e  9  representam  números  de  0  a  9")
    private String shipModelName;

}
