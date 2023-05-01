package com.microservice.journeytomars.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TRAVEL_ID")
    private Long id;

    @Column(name = "TAKEOFF_DATE")
    private Date takeoffDate;

    @Min(value = 1, message = "Favor selecionar um fornecedor.")
    @Column(name = "DAYS_ON_MARS")
    private Integer daysOnMars;

    @Pattern(regexp = "^[a-z]{4}-\\d{4}$",
            message="No  formato  aaaa-9999,  onde  a são letras  de  a-z  e  9  representam  números  de  0  a  9")
    @Column(name = "ship_model_name")
    private String shipModelName;

//    @Pattern(regexp = "[0-9]*[0369]",
//            message=" Somente inteiros, positivos, multiplos de 3")
    @Column(name = "seats_available")
    private Integer seatsAvailable;

    @NotNull(message = "O nome do comandante é obrigatório.")
    @Column(name = "first_commander_name")
    private String firstCommanderName;

    @Pattern(regexp = "^[A-Za-z]{3}-\\d{4}-[A-Za-z]\\d[A-Za-z]$",
            message="No  formato  XXX-9999-X9X")
    @Column(name = "first_commander_interspace_license_plate")
    private String firstCommanderInterspaceLicensePlate;

    @NotNull(message = "O nome do comandante é obrigatório.")
    @Column(name = "second_commander_name")
    private String secondCommanderName;

    @Pattern(regexp = "^[A-Za-z]{3}-\\d{4}-[A-Za-z]\\d[A-Za-z]$",
            message="No  formato  XXX-9999-X9X")
    @Column(name = "second_commander_interspace_license_plate")
    private String secondCommanderInterspaceLicensePlate;

}
