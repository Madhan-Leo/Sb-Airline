package com.ams.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import jakarta.persistence.Column;

@Entity
@Table(name = "tbl_flight")
public class Flights {

	@Id
	@Column(name = "flight_no")
	private String flightNo;
	@Column(name = "flight_name")
	private String flightName;
	@Column(name = "seatcapacity")
	private int seatCapacity;
	@Column(name = "departure")
	private String departure;
	@Column(name = "arrival")
	private String arrival;
	@Column(name = "duration")
	private int duration;

	public Flights() {
		super();
		
	}

	public Flights(String flightNo, String flightName, int seatCapacity, String departure, String arrival,
			int duration) {
		super();
		this.flightNo = flightNo;
		this.flightName = flightName;
		this.seatCapacity = seatCapacity;
		this.departure = departure;
		this.arrival = arrival;
		this.duration = duration;
	}

	public String getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public int getSeatCapacity() {
		return seatCapacity;
	}

	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

}
