package com.rox.lab.build

import spock.lang.Specification

/**
 * @Author rossdrew
 * @Created 04/08/16.
 */
class RomanNumeralTest extends Specification {
    def "Single numeral : 'I'-> 1"() {
        when: RomanNumeral numeral = new RomanNumeral("I");
        then: numeral.numericalValue() == 1
    }

    def "Two numerals: 'II'-> 2"() {
        when: RomanNumeral numeral = new RomanNumeral("II");
        then: numeral.numericalValue() == 2
    }

    def "Multiple numerals : 'III'-> 3"() {
        when: RomanNumeral numeral = new RomanNumeral("III");
        then: numeral.numericalValue() == 3
    }

    def "Higher numeral on right: 'IV'-> 4"() {
        when: RomanNumeral numeral = new RomanNumeral("IV");
        then: numeral.numericalValue() == 4
    }

    def "Higher numeral on left 'VI'-> 6"() {
        when: RomanNumeral numeral = new RomanNumeral("VI");
        then: numeral.numericalValue() == 6
    }

    def "High, low, high 'XIV'-> 14"() {
        when: RomanNumeral numeral = new RomanNumeral("XIV");
        then: numeral.numericalValue() == 14
    }

    def "Succesive additions 'CLXVI'-> 166"() {
        when: RomanNumeral numeral = new RomanNumeral("CLXVI");
        then: numeral.numericalValue() == 166
    }

}


