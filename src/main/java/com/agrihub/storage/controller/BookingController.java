package com.agrihub.storage.controller;

import com.agrihub.storage.entity.SpaceBooking;
import com.agrihub.storage.repository.SpaceBookingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
@RequiredArgsConstructor
public class BookingController {

    private final SpaceBookingRepository bookingRepository;

    @GetMapping
    public List<SpaceBooking> getAllBookings() {
        return bookingRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<SpaceBooking> createBooking(@RequestBody SpaceBooking booking) {
        booking.setStatus("CONFIRMED");
        SpaceBooking savedBooking = bookingRepository.save(booking);
        return ResponseEntity.ok(savedBooking);
    }
}
