package com.iontrading.example;

import java.time.LocalDate;
import java.time.Period;

public class DifferenceDateExampleWithJava8 {

	public static void main(String[] args) {

		LocalDate date = LocalDate.of(2018, 05, 20);

		LocalDate date1 = LocalDate.of(2018, 06, 12);

		Period period = Period.between(date, date1);
		
		// print Number of days between two days with Java 8 .
		System.out.println(period.getDays());

	}
}
