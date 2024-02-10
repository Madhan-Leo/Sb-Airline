package com.ams.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ams.dao.FlightDAO;
import com.ams.model.Flights;

@Service
public class FlightService {

	@Autowired
	FlightDAO flightdao;

	public boolean addFlight(Flights newFlight) {

		flightdao.save(newFlight);
		return true;

	}

	public boolean modifyFlight(Flights flight) {
		flightdao.save(flight);
		return true;
	}

	public boolean removeFlight(Flights flightNo) {
		flightdao.delete(flightNo);
		return true;
	}

	public List<Flights> viewAllFlight() {
		Iterator<Flights> it = flightdao.findAll().iterator();
		List<Flights> list = new ArrayList<Flights>();
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}

}
