package com.agrihub.storage;

import com.agrihub.storage.entity.ColdStorageFacility;
import com.agrihub.storage.entity.StorageCompartment;
import com.agrihub.storage.repository.ColdStorageFacilityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final ColdStorageFacilityRepository facilityRepository;

    @Override
    public void run(String... args) {
        if (facilityRepository.count() == 0) {
            ColdStorageFacility facility1 = ColdStorageFacility.builder()
                    .name("Kisan Cold Chain Facility A")
                    .location("Zone 4, Agritech Corridor")
                    .contactNumber("+91 98765 43210")
                    .build();

            StorageCompartment comp1 = StorageCompartment.builder()
                    .compartmentName("Vault 1 - Low Temp")
                    .cropCompatibility("Apples, Carrots, Green Veggies")
                    .totalCapacityMt(150.0)
                    .occupiedCapacityMt(30.0)
                    .minTemperature(-2.0)
                    .maxTemperature(4.0)
                    .dailyRatePerCrate(12.0)
                    .facility(facility1)
                    .build();

            facility1.getCompartments().add(comp1);

            ColdStorageFacility facility2 = ColdStorageFacility.builder()
                    .name("Metro Perishables Storage Hub")
                    .location("Sector 9 Industrial Area")
                    .contactNumber("+91 91234 56789")
                    .build();

            StorageCompartment comp2 = StorageCompartment.builder()
                    .compartmentName("Vault 2 - Ambient Chill")
                    .cropCompatibility("Potatoes, Onions")
                    .totalCapacityMt(500.0)
                    .occupiedCapacityMt(50.0)
                    .minTemperature(10.0)
                    .maxTemperature(15.0)
                    .dailyRatePerCrate(8.0)
                    .facility(facility2)
                    .build();

            facility2.getCompartments().add(comp2);

            facilityRepository.saveAll(List.of(facility1, facility2));
        }
    }
}
