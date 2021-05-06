package airlineapp;

import static org.junit.Assert.*;
import org.junit.Test;

import airlineapp.PassengerInformation;
import org.junit.Test;

public class PassengerInformationTest {

	@Test
	public void travellerNameDisplay() {
	//PassengerInformation.addUser("annie", 2);
	boolean valid = PassengerInformation.travellerName("annie", 2);
	// assertExpected(actual)
	assertTrue(valid);

	}
	
	@Test
	public void mobileNumberTestCase1() {
		boolean valid = PassengerInformation.passengerMobile(8220551086L);
		assertTrue(valid);
	}
	@Test
	public void mobileNumberTestCase2() {
		boolean valid = PassengerInformation.passengerMobile(99943265378L);
		assertFalse(valid);
	}
	
	@Test
	public void addressTestCase() {
		PassengerInformation.passengerAddress("470,first floor, krr,sb colony,xbe-11");
	}
	
	@Test
	public void pincodeTestCase1() {
		boolean valid=PassengerInformation.addressPincode("641011");
		assertTrue(valid);
	}
	@Test
	public void pincodeTestCase2() {
		boolean valid = PassengerInformation.addressPincode("64101111");
		assertFalse(valid);
	}
	
	@Test
	public void agevalidationTestcase1() {
		PassengerInformation.travellersAge(4);
	}
	
	@Test
	public void agevalidationTestcase2() {
		PassengerInformation.travellersAge(88);
	}
	@Test
	public void agevalidationTestcase3() {
		PassengerInformation.travellersAge(15);
	}
	
	@Test
	public void foodValidationTestCase1() {
		String valid=PassengerInformation.needFood("Yes");
	}
	
	@Test
	public void foodValidationTestCase2() {
		String valid=PassengerInformation.needFood("No");
	}


	
}
