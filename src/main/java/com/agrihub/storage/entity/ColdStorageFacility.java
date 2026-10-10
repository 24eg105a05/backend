package com.agrihub.storage.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cold_storage_facilities")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ColdStorageFacility {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String location;

    private String contactNumber;

    @Builder.Default
    @OneToMany(mappedBy = "facility", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<StorageCompartment> compartments = new ArrayList<>();
}
