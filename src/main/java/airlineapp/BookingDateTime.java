package airlineapp;

import java.time.LocalDate;
import java.time.LocalTime;

public class BookingDateTime {
	
	public static boolean dateTimeValidator(String departureDate, String departureTime) {
		boolean valid = false;
		System.out.println("Please wait .....until Checking your date and time...");
		System.out.println();
		LocalDate departureDate_obj = LocalDate.parse(departureDate); // date to obj //
		LocalTime departureTime_obj = LocalTime.parse(departureTime); // time to obj //

		LocalDate currentdate = LocalDate.now(); // current date //
		LocalTime currenttime = LocalTime.now();// current time //

		if ((departureDate_obj.isBefore(currentdate)) || (departureTime_obj.isBefore(currenttime))
				|| (departureDate_obj.isEqual(currentdate))) {
			System.out.println("Entered date/time is incorect");
			System.out.println("Sorry!Unbale to book");
			valid = false;
		}

		else if (departureDate_obj.isAfter(currentdate) && departureTime_obj.isAfter(currenttime)) {
			System.out.println("You are eligible for booking,Go ahead..");
			valid = true;
		}

		return valid;

	}


}
