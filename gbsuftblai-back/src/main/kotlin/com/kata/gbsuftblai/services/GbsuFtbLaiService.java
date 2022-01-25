package com.kata.gbsuftblai.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kata.gbsuftblai.converters.ContaintsConvertibleNumber;
import com.kata.gbsuftblai.converters.DivisibleConvertibleNumber;


@Component
public class GbsuFtbLaiService {


    @Autowired
    private  DivisibleConvertibleNumber divisibleConverter;
    @Autowired
	private  ContaintsConvertibleNumber containsConverter;


    public String  convertNumber(Integer inputNumber) {

        // P1 - call DivisibleConvertibleNumber.convertNumber
        String numberConverted = divisibleConverter.convertNumber(inputNumber);

        // P2 - call ContaintsConvertibleNumber.convertNumber
        numberConverted += containsConverter.convertNumber(inputNumber);

        // If no match, return the input number as a string.
        String caseNoMatch = String.valueOf(inputNumber);

		return "".equals(numberConverted) ? caseNoMatch : numberConverted;

    }

}