package com.ams.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ams.model.Booking;


public interface BookingDAO extends JpaRepository<Booking, Integer> {

}
