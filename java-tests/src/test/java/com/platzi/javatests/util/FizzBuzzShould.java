package com.platzi.javatests.util;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzShould {

    private FizzBuzz fizzBuzz;

    @Before
    public void setup() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void return_fizz_if_number_is_divisble_by_3() {
        assertEquals("Fizz", fizzBuzz.fizzBuzz(3));
    }

    @Test
    public void return_buzz_if_number_is_divisible_by_5() {
        assertEquals("Buzz", fizzBuzz.fizzBuzz(5));
    }

    @Test
    public void return_fizzbuzz_if_number_is_divisible_by_3_and_5() {
        assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(15));
    }

    @Test
    public void return_number_in_other_case() {
        assertEquals("2", fizzBuzz.fizzBuzz(2));
    }
}