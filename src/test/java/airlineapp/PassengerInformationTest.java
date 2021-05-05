package airlineapp;

import static org.junit.Assert.*;
import org.junit.Test;
import airlineapp.PassengerInformation;


import org.junit.Test;

public class PassengerInformationTest {

	@Test
	public void nameValidation() {
		PassengerInformation.displayAllUser();
	}
	
	@Test
	public void userLoginTestCase1() {
	PassengerInformation.addUser("pritha", "123");
	boolean valid = PassengerInformation.login("pritha", "123");
	// assertExpected(actual)
	assertTrue(valid);
	}

	

	@Test
	public void userLoginTestCase2() {
	PassengerInformation.addUser("gracewed", "7172");
	boolean valid = PassengerInformation.login("grace", "71");
	// assertExpected(actual)
	assertFalse(valid);
	}

	// TestCases for searchDetails()

	
	@Test
	public void searchDetailsTestCase1() {
	PassengerInformation.addUser("gracewed", "7172");
	boolean valid = PassengerInformation.searchDetails("gracewed", "7172");
	// assertExpected(actual)
	assertTrue(valid);
	}

	
	@Test
	public void searchDetailsTestCase2() {
	boolean valid = PassengerInformation.searchDetails("karthi", "kart7172");
	// assertExpected(actual)
	assertFalse(valid);
	}

	// Test cases for addUser

	
	@Test
	public void addUserTestCase1() {
	boolean valid = PassengerInformation.addUserStatus("karthi", "kart7172");
	// assertExpected(actual)
	assertFalse(valid);
	}

	
	@Test
	public void addUserTestCase2() {
	UserManager.addUser("gracewed", "7172");
	boolean valid = PassengerInformation.addUserStatus("gracewed", "7172");
	// assertExpected(actual)
	assertTrue(valid);
	}

	// Test cases for delUser

	
	@Test
	public void deleteUserTestCase1() {
	UserManager.delUser("gracewed", "7172");
	boolean valid = PassengerInformation.delUserStatus("gracewed", "7172");
	// assertExpected(actual)
	assertTrue(valid);
	}

	
	@Test
	public void deleteUserTestCase2() {
	UserManager.delUser("pritha", "123");
	boolean valid = PassengerInformation.delUserStatus("grace", "717");
	// assertExpected(actual)
	assertTrue(valid);
	}

	// TestCases for updateUserName

	
	@Test
	public void updateUserNameTestCase1() {
	PassengerInformation.addUser("gracewed", "7172");
	PassengerInformation.updUserName("gracewed", "gracewedding", "7172");
	boolean valid = PassengerInformation.updUserNameStatus("gracewed");
	// assertExpected(actual)
	assertFalse(valid);
	}

	// here the gracewed username changes to gracewedding username

	
	@Test
	public void updateUserNameTestCase2() {
	PassengerInformation.addUser("gracewed", "7172");
	PassengerInformation.updUserName("gracewed", "gracewedding", "7172");
	boolean valid = PassengerInformation.updUserNameStatus("gracewedding"); // checking whether the gracewedding is updated.
	// assertExpected(actual)
	assertTrue(valid);
	}

	// TestCases for updatePassWord

	/*
	@Test
	public void updatePasswordTestCase1() {
	Passenger_information.addUser("gracewed", "7172");
	Passenger_information.updUserPass("7172", "717273", "gracewed");
	boolean valid = Passenger_information.updUserPassStatus("7172");
	// assertExpected(actual)
	assertFalse(valid);
	}
	*/

	
	/*@Test
	public void updatePasswordTestCase2() {
	Passenger_information.addUser("gracewed", "7172");
	Passenger_information.updUserPass("7172", "717273", "gracewed");
	boolean valid = Passenger_information.updUserPassStatus("717273");
	// assertExpected(actual)
	assertFalse(valid);
	}

	}
      */

}
