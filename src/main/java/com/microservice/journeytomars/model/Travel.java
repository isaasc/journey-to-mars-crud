package com.microservice.journeytomars.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "TB_TRAVEL")
public class Travel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "TRAVEL_ID")
    private Long id;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date takeoffDate;

    @Min(value = 1, message = "Favor selecionar um fornecedor.")
    @Column(name = "daysOn_mars")
    private Integer daysOnMars;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TB_SPACECRAFT")
    private Spacecraft spacecraft;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TB_COMMANDER")
    private Commander firstCommander;

}
