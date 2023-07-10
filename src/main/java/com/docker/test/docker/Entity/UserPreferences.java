package com.docker.test.docker.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;

@Entity
@Table(name = "user_preferences")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserPreferences {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "vehicle_id")
    private String vehicleId;

    @Column(name = "participating")
    private Boolean participating;

    @Column(name = "wants_full_charge_by", columnDefinition = "TIMESTAMP WITH TIME ZONE")
    private ZonedDateTime wantsFullChargeBy;

    @Column(name = "caseid")
    private Integer caseId;

    @Column(name = "current_region")
    private String currentRegion;
}
