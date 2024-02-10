package com.ams.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name = "tbl_booking")
public class Booking {

	@Id
	@Column(name = "booking_id")
	private int bookingId;
	@Column(name = "user_id")
	private int userId;
	@Column(name = "flight_no")
	private String flightNo;
	@Column(name = "date_of_travel")
	private String travellingDate;
	@Column(name = "no_of_tickets")
	private int noOfTickets;

	public Booking() {
		super();
		
	}

	public Booking(int bookingId, int userId, String flightNo, String travellingDate, int noOfTickets) {
		super();
		this.bookingId = bookingId;
		this.userId = userId;
		this.flightNo = flightNo;
		this.travellingDate = travellingDate;
		this.noOfTickets = noOfTickets;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public String getTravellingDate() {
		return travellingDate;
	}

	public void setTravellingDate(String travellingDate) {
		this.travellingDate = travellingDate;
	}

	public int getNoOfTickets() {
		return noOfTickets;
	}

	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}

}
