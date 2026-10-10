package com.agrihub.storage.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "storage_compartments")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StorageCompartment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String compartmentName;

    private String cropCompatibility;

    private Double totalCapacityMt;

    private Double occupiedCapacityMt;

    private Double minTemperature;

    private Double maxTemperature;

    private Double dailyRatePerCrate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "facility_id")
    @JsonIgnore
    private ColdStorageFacility facility;
}
