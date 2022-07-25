package com.platzi.javatests.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumeralsShould {

    @Test
    public void return_value_of_an_roman_number() {
        assertEquals("I", RomanNumerals.arabicToRoman(1));
        assertEquals("IV", RomanNumerals.arabicToRoman(4));
        assertEquals("X", RomanNumerals.arabicToRoman(10));
        assertEquals("XVI", RomanNumerals.arabicToRoman(16));
        assertEquals("LXX", RomanNumerals.arabicToRoman(70));
        assertEquals("MMDVII", RomanNumerals.arabicToRoman(2507));
    }
}