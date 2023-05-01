package com.microservice.journeytomars.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

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

    @Positive
    @Column(name = "DAYS_ON_MARS")
    private Integer daysOnMars;

    @Positive
    @Column(name = "travel_days_to_mars")
    private Integer travelDaysToMars;

    @Positive
    @Column(name = "travel_days_to_earth")
    private Integer travelDaysToEarth;

    @Pattern(regexp = "^[a-z]{4}-\\d{4}$",
            message = "No  formato  aaaa-9999,  onde  a são letras  de  a-z  e  9  representam  números  de  0  a  9")
    @Column(name = "ship_model_name")
    private String shipModelName;

    @Positive
    @Digits(integer = Integer.MAX_VALUE, fraction = 0)
    @Column(name = "seats_available")
    private Integer seatsAvailable;

    @NotNull(message = "O nome do comandante é obrigatório.")
    @Column(name = "first_commander_name")
    private String firstCommanderName;

    @Pattern(regexp = "^[A-Za-z]{3}-\\d{4}-[A-Za-z]\\d[A-Za-z]$",
            message = "No  formato  XXX-9999-X9X")
    @Column(name = "first_commander_interspace_license_plate")
    private String firstCommanderInterspaceLicensePlate;

    @NotNull(message = "O nome do comandante é obrigatório.")
    @Column(name = "second_commander_name")
    private String secondCommanderName;

    @Pattern(regexp = "^[A-Za-z]{3}-\\d{4}-[A-Za-z]\\d[A-Za-z]$",
            message = "No  formato  XXX-9999-X9X")
    @Column(name = "second_commander_interspace_license_plate")
    private String secondCommanderInterspaceLicensePlate;

    private Date dateReturnEarth;

}
