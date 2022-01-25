package com.kata.gbsuftblai.converters;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class ContaintsConvertibleNumber {
    
    /**
	 * @param number
	 * @return
	 */
	public String convertNumber(Integer number) {

		final StringBuffer text = new StringBuffer();
		// for each on  Stream (char number)  
		number.toString().chars().mapToObj(c -> (char) c).forEach(str -> {
			Arrays.stream(ConvertibleNumber.values()).forEach(convNbr -> {
				if (String.valueOf(convNbr.getNumber()).charAt(0) == str) {
					text.append(convNbr.getNumberStr());
				}
			});
		});

		return text.toString();
	}
}
