package com.microservice.journeytomars.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.sql.Date;

@Data
@Entity
public class Travel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date takeoffDate;
    private Integer daysOnMars;
    private Spacecraft spacecraft;
    private Commander firstCommander;
    private Commander secondCommander;

}
