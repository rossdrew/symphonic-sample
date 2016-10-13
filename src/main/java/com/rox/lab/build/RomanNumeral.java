package com.rox.lab.build;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author rossdrew
 * @Created 05/08/16.
 */
public class RomanNumeral {
    private static Pattern romanNumeralPattern = Pattern.compile("[IVXLCDM]*");

    private String numeralString;

    public static boolean isValid(String string){
        Matcher m = romanNumeralPattern.matcher(string);
        return m.matches();
    }

    public RomanNumeral(String numeralString){
        this.numeralString = numeralString;
    }

    public Integer numericalValue() {
        int value = 0;
        int lastValue = 0;

        char[] numerals = numeralString.toCharArray();

        for (int i = numerals.length-1; i >= 0; i--){
            int tmpValue = getValueOfCharacter(numerals[i]);
            value += (tmpValue < lastValue) ? -tmpValue : tmpValue;
            lastValue = tmpValue;
        }

        return value;
    }

    private int getValueOfCharacter(char romanNumeralChar){
        int value = 0;

        switch (romanNumeralChar){
            case 'I': value = 1; break;
            case 'V': value = 5; break;
            case 'X': value = 10; break;
            case 'L': value = 50; break;
            case 'C': value = 100; break;
            case 'D': value = 500; break;
            case 'M': value = 1000; break;
        }

        return value;
    }
}
