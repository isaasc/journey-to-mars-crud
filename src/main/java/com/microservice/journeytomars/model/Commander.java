package com.microservice.journeytomars.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.sql.Date;

@Data
@Entity
public class Commander {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull(message = "O nome do comandante é obrigatório.")
    private String name;

    @Pattern(regexp = "^[A-Za-z]{3}-\\d{4}-[A-Za-z]\\d[A-Za-z]$",
            message="No  formato  XXX-9999-X9X")
    private Integer interspaceLicensePlate;

}
