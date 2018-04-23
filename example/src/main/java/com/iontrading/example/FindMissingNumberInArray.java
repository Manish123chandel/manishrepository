package com.iontrading.example;

import java.util.Arrays;
import java.util.BitSet;

public class FindMissingNumberInArray {

	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 3, 4, 6, 7, 8, 9 };
		missingElement(array, 9);

	}

	private static void missingElement(int[] numbers, int count) {
		int missingCount = count - numbers.length;
		BitSet bitSet = new BitSet(count);
		for (int number : numbers) {
			bitSet.set(number - 1);
		}
		System.out
				.printf("Missing numbers in integer array %s, with total number %d is %n",
						Arrays.toString(numbers), count);
		int lastMissingIndex = 0;
		for (int i = 0; i < missingCount; i++) {
			lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
			System.out.println(++lastMissingIndex);
		}
	}

}
