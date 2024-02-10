package com.ams.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ams.model.Flights;


public interface FlightDAO extends JpaRepository<Flights, Integer> {

}
