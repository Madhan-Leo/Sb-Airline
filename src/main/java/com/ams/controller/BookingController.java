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

import com.ams.model.Booking;
import com.ams.service.BookingService;

@RestController
@CrossOrigin("http://localhost:4200")

public class BookingController {
	@Autowired
	BookingService bookservice;

	@PostMapping("/addBooking")
	public void insertBooking(@RequestBody Booking newBooking) {

		bookservice.addBooking(newBooking);

	}

	@PutMapping("/updateBooking")

	public void modifyBooking(@RequestBody Booking updateBooking) {

		bookservice.updateBooking(updateBooking);
	}

	@DeleteMapping("/deleteBooking/{id}")

	public void deleteBookingByID(@PathVariable("id") int bookingId) {

		bookservice.deleteBooking(bookingId);
	}

	@GetMapping("/getBookingsList")
	public List<Booking> getBookingsList() {
		Iterator<Booking> it = bookservice.getBookingsList().iterator();
		List<Booking> list = new ArrayList<Booking>();
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}

}
