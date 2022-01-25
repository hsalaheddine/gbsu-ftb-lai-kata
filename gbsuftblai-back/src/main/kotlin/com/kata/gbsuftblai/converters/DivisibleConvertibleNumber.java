package com.kata.gbsuftblai.converters;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class DivisibleConvertibleNumber {

	/**
	 * @param number
	 * @return
	 */
	public String convertNumber(Integer number) {

		final StringBuffer text = new StringBuffer();

		// filter to get only divisble number
		Arrays.stream(ConvertibleNumber.values()).filter(cvrNbr -> cvrNbr.isDivisible()).forEach(str -> {
			if (isDivisibleByConvertibleNumber(number, str.getNumber())) {
				text.append(str.getNumberStr());
			}
		});

		return text.toString();
	}

	/**
	 * return true if input number is divisible by convertible number
	 * 
	 * @param number
	 * @param convNumber
	 * @return
	 */
	private static boolean isDivisibleByConvertibleNumber(Integer number, Integer convNumber) {
		return (number % convNumber == 0);
	}

}
