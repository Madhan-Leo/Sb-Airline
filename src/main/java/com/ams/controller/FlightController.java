package com.ams.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ams.model.Flights;

import com.ams.service.FlightService;

@RestController
@CrossOrigin("http://localhost:4200")

public class FlightController {
	@Autowired
	FlightService flightservice;

	@PostMapping("/addFlight")
	public void flightInsert(@RequestBody Flights newFlight) {

		flightservice.addFlight(newFlight);

	}

	@PutMapping("/modifyFlight")
	public void modifyFlight(@RequestBody Flights updateflight) {
		flightservice.modifyFlight(updateflight);
	}

	@DeleteMapping("/removeFlight/{id}")
	public void removeFlight(@PathVariable("id") Flights flightNo) {
		flightservice.removeFlight(flightNo);
	}

	@GetMapping("/viewAllFlight")
	public List<Flights> viewAllFlight() {
		Iterator<Flights> it = flightservice.viewAllFlight().iterator();
		List<Flights> list = new ArrayList<Flights>();
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}

}
