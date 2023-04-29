package com.microservice.journeytomars.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import lombok.Data;

import java.sql.Date;
import java.time.LocalDate;

@Data
@Entity
public class Travel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date takeoffDate;

    @Min(value = 1, message = "Favor selecionar um fornecedor.")
    private Integer daysOnMars;
    private Spacecraft spacecraft;
    private Commander firstCommander;
    private Commander secondCommander;

}
