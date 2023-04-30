package com.microservice.journeytomars.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "TB_SPACECRAFT")
public class Spacecraft {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "spacecraft_id")
    private Long id;


    @Column(name = "seats_available")
    private Integer seatsAvailable;


    @Column(name = "shipModel_name")
    private String shipModelName;

}
