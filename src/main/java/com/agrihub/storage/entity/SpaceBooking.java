package com.agrihub.storage.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "space_bookings")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SpaceBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long facilityId;

    private String facilityName;

    private Integer crates;

    private LocalDate startDate;

    private LocalDate endDate;

    private Integer durationDays;

    private Boolean needPickup;

    private String pickupAddress;

    private Double totalCost;

    private String status; // PENDING, CONFIRMED, CANCELLED
}
