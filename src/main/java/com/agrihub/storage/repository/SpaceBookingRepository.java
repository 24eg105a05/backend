package com.agrihub.storage.repository;

import com.agrihub.storage.entity.SpaceBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpaceBookingRepository extends JpaRepository<SpaceBooking, Long> {
}
