package com.microservice.journeytomars.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "TB_COMMANDER")
public class Commander {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "commander_id")
    private Long id;

    @NotNull(message = "O nome do comandante é obrigatório.")
    private String name;

    @Pattern(regexp = "^[A-Za-z]{3}-\\d{4}-[A-Za-z]\\d[A-Za-z]$",
            message="No  formato  XXX-9999-X9X")
    @Column(name = "interspaceLicense_plate")
    private String interspaceLicensePlate;

}
