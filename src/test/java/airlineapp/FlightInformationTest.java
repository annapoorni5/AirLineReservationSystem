package airlineapp;

import static org.junit.Assert.*;

import org.junit.Test;



public class FlightInformationTest {
	
	
	@Test
	public void placeNameDisplay() {
		FlightInformation.placeNameTest();
	}
	
	/* 
	 * Here is the list of flight name user can select
	 */

	@Test
	public void placeNameValidation() {
		FlightInformation.addPlaceTravelling();	

	}
	@Test
	public void displayPlaceName() {
		FlightInformation.checkPlaceName();
	}
	
	
	/*
	 * Here is the list of place names users can select
	 * 
	 */
	
	@Test
	public void flightNameDisplay() {
		FlightInformation.addFlightName();

	}

	@Test
	public void flightNameValidation() {
		FlightInformation.flightNameTest();

	}
	
	@Test
	public void displayFlightName() {
		FlightInformation.addFlightName();

	}
	@Test
	public void flightId() {
		FlightInformation.flightId();
		
	}
	
	
	/*
	 * To validate date
	 */

	@Test
	public void dateValidation() {
		boolean date = FlightInformation.dateValidation("2021-06-05");
		assertTrue(date);
	}
	
	@Test
	public void timeValidation() {
		boolean time=FlightInformation.timeValidation("15:00");
		assertTrue(time);
	}
	
	@Test
	public void flightAvailabilityTestCase1() {
		//FlightInformation.dateFormat("2021-05-05");
		//FlightInformation.timeFormat("15:00");
		FlightInformation.addFlightName();
		FlightInformation.addPlaceTravelling();
		boolean valid=FlightInformation.flightAvailabilityTest("IndiGo", "Australia","2021-05-05","15:00");
		assertFalse(valid);
		
		
	}
	
	
	@Test
	public void flightAvailabilityTestCase2() {
		//FlightInformation.dateFormat("2021-05-05");
		//FlightInformation.timeFormat("15:00");
		FlightInformation.addFlightName();
		FlightInformation.addPlaceTravelling();
		boolean valid=FlightInformation.flightAvailabilityTest("IndiGo", "Australia","2021-11-05","15:00");
		assertTrue(valid);
		
		
	}
	
	
	
	
	
	@Test
	public void searchDetailsTestCase1() {
		FlightInformation.addFlightName();
		boolean valid=FlightInformation.searchFlightName("IndiGo");
		assertTrue(valid);
		}
	
	@Test
	public void searchDetailsTestCase2() {
		FlightInformation.addPlaceTravelling();
		boolean valid=FlightInformation.searchPlaceName("Australia");
		assertTrue(valid);
		
				}



}
