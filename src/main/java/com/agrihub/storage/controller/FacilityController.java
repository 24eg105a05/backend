package com.agrihub.storage.controller;

import com.agrihub.storage.entity.ColdStorageFacility;
import com.agrihub.storage.repository.ColdStorageFacilityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/facilities")
@RequiredArgsConstructor
public class FacilityController {

    private final ColdStorageFacilityRepository facilityRepository;

    @GetMapping
    public ResponseEntity<List<ColdStorageFacility>> getAllFacilities() {
        return ResponseEntity.ok(facilityRepository.findAll());
    }

    @PostMapping
    public ResponseEntity<ColdStorageFacility> createFacility(@RequestBody ColdStorageFacility facility) {
        return ResponseEntity.ok(facilityRepository.save(facility));
    }
}
