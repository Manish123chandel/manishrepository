package com.iontrading.example;

import java.util.Calendar;

public class DifferenceDateExample {

	public static void main(String[] args) {

		// input first Date
		Calendar cal = Calendar.getInstance();
		cal.set(2019, 11, 31);

		// input second date
		Calendar cal1 = Calendar.getInstance();
		cal1.set(2020, 00, 01);


	 CalculateDifferenceBetweenDates(cal, cal1);
	}

	private static void CalculateDifferenceBetweenDates(Calendar cal,
			Calendar cal1) {
		// Compare year for both date
		if (cal.get(Calendar.YEAR) == cal1.get(Calendar.YEAR)) {

			// if year Equal then Compare Month
			if (cal.get(Calendar.MONTH) == cal1.get(Calendar.MONTH)) {
				System.out.println("Both date ar1e in same Month");
			}
			// if second date month is just after the first date month Example:
			// 12-05-2018 && 12-06-2018
			else if (cal1.get(Calendar.MONTH) == cal.get(Calendar.MONTH) + 1) {

				// compare date logic only
				CompareDate(cal, cal1);
			} else {
				System.out.println("more than One month");
			}
		}
		// if second date year is just after first date year Example take
		// 31-12-2018 && 01-01-2019
		else if (cal1.get(Calendar.YEAR) == cal.get(Calendar.YEAR) + 1) {
			{
				if (cal.get(Calendar.MONTH) % 11 == 0
						&& (cal1.get(Calendar.MONTH)) == 0) {
					CompareDate(cal, cal1);

				} else {
					System.out.println("more than One Month");
				}
			}
		}
		// other wise more than one year Gap
		else
			System.out.println("more than One Year");
	}

	private static void CompareDate(Calendar cal, Calendar cal1) {
		if (cal.get(Calendar.DATE) > cal1.get(Calendar.DATE)) {
			System.out.println("Less than One Month");
		} else if (cal.get(Calendar.DATE) < cal1.get(Calendar.DATE)) {
			System.out.println("greater Than One Month");
		} else {
			System.out.println("exact equal to one Month");
		}
	}
}
