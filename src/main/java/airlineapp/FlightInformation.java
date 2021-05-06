package airlineapp;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class FlightInformation {

	// place

	public static void placeNameTest() {
		System.out.println("Select your travel location");
		for (String place : placeName) {
			System.out.println(place);
		}
	}

	static ArrayList<String> placeName = new ArrayList<String>();

	public static void addPlaceTravelling() {
		placeName.add("Australia");
		placeName.add("Aufghanistan");
		placeName.add("United kingdom");

	}

	public static void checkPlaceName() {
		for (String name : placeName) {
			System.out.println(name);
		}
	}

	public static boolean searchPlaceName(String name) {
		boolean validPlaceName = true;
		if (placeName.contains(name)) {
			validPlaceName = true;
		} else {
			validPlaceName = false;
		}
		return validPlaceName;
	}

	public static void flightNameTest() {
		System.out.println("Select your flight name");
		for (String flight : flightName) {
			System.out.println(flight);
		}
	}

	static ArrayList<String> flightName = new ArrayList<String>();

	public static void addFlightName() {
		flightName.add("IndiGo");
		flightName.add("AirIndia");
		flightName.add("SpiceJet");

	}

	public static boolean searchFlightName(String name) {
		boolean validFlightName = true;
		if (flightName.contains(name)) {
			validFlightName = true;
		} else {
			validFlightName = false;
		}
		return validFlightName;
	}

	public static void displayFlightName() {
		for (String nameflight : flightName) {
			System.out.println(nameflight);
		}
	}

	// flight id

	public static void flightId() {
		int id;
	}

	// flightClass
	public static void flightClass() {

	}

	// date

	public static boolean dateValidation(String estimatedDate) {
		boolean valid = false;
		LocalDate givenDate = LocalDate.parse(estimatedDate);
		LocalDate actualdate = LocalDate.now();
		if (givenDate.isAfter(actualdate) || givenDate.isEqual(actualdate)) {
			valid = true;
		} else if (actualdate.isBefore(givenDate)) {
			valid = false;
		}
		return valid;

	}

	// time
	public static boolean timeValidation(String estimatedTime) {
		boolean valid = true;
		LocalTime givenTime = LocalTime.parse(estimatedTime);
		LocalTime actualTime = LocalTime.now();
		if (givenTime.isAfter(actualTime)) {
			valid = true;
		} else if (actualTime.isBefore(givenTime)) {
			valid = false;
		}
		return valid;
	}

	static HashMap<String, String> flightAvailability = new HashMap<String, String>();

	public static boolean flightAvailabilityTest(String flight, String place, String estimatedDate,
			String estimatedTime) {
		boolean validDetails = false;
		if (timeValidation(estimatedTime) && dateValidation(estimatedDate) == true) {
			if (flightName.contains(flight) && placeName.contains(place)) {
				// String value = flightAvailability.get(flight);
				validDetails = true;
			}
		}
		return validDetails;
	}

	static HashMap<String, String> placeDetails = new HashMap<String, String>();

	public static boolean searchPlaceDetails(String placeName) {
		boolean validFlightName = false;
		Set<String> keys = placeDetails.keySet();
		for (String key : keys) {
			String value = placeDetails.get(key);
			System.out.println(key + ":" + value);
		}
		if (placeDetails.containsKey(placeName)) {
			String value = placeDetails.get(placeName);
			validFlightName = true;
		}
		return validFlightName;
	}
}
