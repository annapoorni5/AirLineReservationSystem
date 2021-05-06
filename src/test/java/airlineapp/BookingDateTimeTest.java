package airlineapp;

import static org.junit.Assert.*;

import org.junit.Test;

import airlineapp.BookingDateTime;

public class BookingDateTimeTest {

	/*
	 * This method test with futuredate and futuretime for booking It should return
	 * true
	 */
	@Test
	public void dateTimevalidateTestCase1() {
		boolean valid = BookingDateTime.dateTimeValidator("2021-05-30", "18:03");
		// assertExpected(actual)
		assertTrue(valid);
	}

	
	/*
	 * This method test with pastdate and pasttime for booking It should return
	 * false
	 */
	@Test
	public void dateTimevalidateTestCase2() {
		boolean valid = BookingDateTime.dateTimeValidator("2021-04-25", "12:59:03");
		// assertExpected(actual)
		assertFalse(valid);
	}

	/*
	 * This method test with currentdate and currenttime for booking It should
	 * return false
	 */
	@Test
	public void dateTimevalidateTestCase3() {
		boolean valid = BookingDateTime.dateTimeValidator("2021-04-30", "15:35:03");
		// assertExpected(actual)
		assertFalse(valid);
	}

	/*
	 * This method test with futuredate and pasttime for booking It should return
	 * false
	 */
	@Test
	public void dateTimevalidateTestCase4() {
		boolean valid = BookingDateTime.dateTimeValidator("2020-05-29", "05:12:03");
		// assertExpected(actual)
		assertFalse(valid);
	}

	/*
	 * This method test with futuredate and currenttime for booking It should return
	 * false
	 */
	@Test
	public void dateTimevalidateTestCase5() {
		boolean valid = BookingDateTime.dateTimeValidator("2021-05-30", "15:04:03");
		// assertExpected(actual)
		assertTrue(valid);
	}

	/*
	 * This method test with pastdate and futuretime for booking It should return
	 * false
	 */
	@Test
	public void dateTimevalidateTestCase6() {
		boolean valid = BookingDateTime.dateTimeValidator("2021-04-24", "18:59:03");
		// assertExpected(actual)
		assertFalse(valid);
	}

	/*
	 * This method test with pastdate and currenttime for booking It should return
	 * false
	 */
	@Test
	public void dateTimevalidateTestCase7() {
		boolean valid = BookingDateTime.dateTimeValidator("2021-04-24", "03:27:03");
		// assertExpected(actual)
		assertFalse(valid);
	}



}
