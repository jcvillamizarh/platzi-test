package com.platzi.javatests.util;

public class FizzBuzz {
    public static String fizzBuzz(int number) {
        String value = "";
        if (number % 3 == 0) {
            value = "Fizz";
        } if (number % 5 == 0) {
            value += "Buzz";
        }
        return !value.isEmpty() ? value : String.valueOf(number);
    }
}
