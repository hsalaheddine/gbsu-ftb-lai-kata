package com.kata.gbsuftblai.converters;

public enum ConvertibleNumber {

	//(number, numberStr, divisible)
	THREE(3, "Gbsu", true), FIVE(5, "Ftb", true), SEVEN(7, "Lai", false);

	private final Integer number;
	private final String numberStr;
	private final boolean divisible;

	private ConvertibleNumber(int number, String numberStr, boolean divisible) {
		this.number = number;
		this.numberStr = numberStr;
		this.divisible = divisible;
	}

	public Integer getNumber() {
		return number;
	}

	public String getNumberStr() {
		return numberStr;
	}

	public boolean isDivisible() {
		return divisible;
	}

}