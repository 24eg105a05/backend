package com.agrihub.storage.repository;

import com.agrihub.storage.entity.ColdStorageFacility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColdStorageFacilityRepository extends JpaRepository<ColdStorageFacility, Long> {
}
