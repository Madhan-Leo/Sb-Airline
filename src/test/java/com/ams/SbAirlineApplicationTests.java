package com.ams;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.ams.model.Booking;
import com.ams.model.Flights;
import com.ams.model.Login;
import com.ams.model.Users;
import com.ams.service.BookingService;
import com.ams.service.FlightService;
import com.ams.service.LoginService;
import com.ams.service.RegisterService;
import com.ams.service.UserService;

@SpringBootTest
class SbAirlineApplicationTests {

	@Autowired
	LoginService lgservice;

	@Autowired
	RegisterService rgservice;

	@Autowired
	UserService urservice;

	@Autowired
	BookingService bkservice;

	@Autowired
	FlightService flservice;

	boolean res;
	boolean val;
	List<Users> list = new ArrayList<>();
	List<Users> list1 = new ArrayList<>();
	List<Users> list2 = new ArrayList<>();
	List<Users> list3 = new ArrayList<>();
	List<Flights> list4 = new ArrayList<>();
	List<Flights> list5 = new ArrayList<>();
	List<Booking> list6 = new ArrayList<>();
	List<Booking> list7 = new ArrayList<>();

	Users ur = new Users(1001, "Shiva", "User", "9876453456", "shiva@gmail.com", "Madurai");
	Users ad = new Users(1, "Purushoth", "Admin", "9234567812", "purushoth@gmail.com", "Chennai");
	Users ur1 = new Users(1032, "Magesh", "User", "9876453456", "magesh@gmail.com", "Sivakasi");
	Users ur2 = new Users(1032, "Aravind", "User", "9876453456", "aravind@gmail.com", "Madurai");
	Login rs1 = new Login("User Success");
	Login rs2 = new Login("Admin Success");
	Login rs3 = new Login("Login Fail");
	Flights fl = new Flights("10234", "Emirates", 120, "chennai", "bangalore", 5);
	Booking b1 = new Booking(103, 120, "10234", "2024-02-10", 2);

	@Test
	@Order(1)
	void performUserLogin() {
		Login rs = lgservice.login(ur);
		rs1.equals(rs);
	}

	@Test
	@Order(2)
	void performAdminLogin() {
		Login rs = lgservice.login(ad);
		rs2.equals(rs);
	}

	@Test
	@Order(3)
	void performLoginFail() {
		Login rs = lgservice.login(ur2);
		rs3.equals(rs);
	}

	@Test
	@Order(4)
	void performRegister() {
		val = true;
		res = rgservice.Register(ur1);
		assertEquals(val, res);
	}

	@Test
	@Order(5)
	void performUserInsert() {
		val = true;
		res = urservice.performInsert(ur1);
	}

	@Test
	@Order(6)
	void performUserDelete() {
		val = true;
		res = urservice.deleteUser((long) 1031);
		assertEquals(val, res);
	}

	@Test
	@Order(7)
	void performViewAllUsers() {
		list1 = urservice.getAll();
		list.add(ur);
		list.add(ad);
		list.add(ur1);
		list.equals(list1);
	}

	@Test
	@Order(8)
	void performFlightInsert() {
		val = true;
		res = flservice.addFlight(fl);
		assertEquals(val, res);
	}

	@Test
	@Order(9)
	void performFlightUpdate() {
		val = true;
		res = flservice.modifyFlight(fl);
		assertEquals(val, res);
	}

	@Test
	@Order(10)
	void performFlightDelete() {
		val = true;
		res = flservice.modifyFlight(fl);
		assertEquals(val, res);
	}

	@Test
	@Order(11)
	void performViewAllFlights() {
		list4 = flservice.viewAllFlight();
		list4.add(fl);
		list4.equals(list5);
	}

	@Test
	@Order(12)
	void performBookingInsert() {
		val = true;
		res = bkservice.addBooking(b1);
		assertEquals(val, res);
	}

	@Test
	@Order(13)
	void performBookingUpdate() {
		val = true;
		res = bkservice.updateBooking(b1);
		assertEquals(val, res);
	}

	@Test
	@Order(14)
	void performBookingDelete() {
		val = true;
		res = bkservice.deleteBooking(101);
		assertEquals(val, res);
	}

	@Test
	@Order(15)
	void performViewAllBooking() {
		list6 = bkservice.getBookingsList();
		list6.add(b1);
		list6.equals(list7);
	}

}
