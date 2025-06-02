package com.humanbooster;

public class FizzBuzzmethod {
    public String FizzBuzz(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz"; // /3 et /5
        } else if (n % 3 == 0) {
            return "Fizz"; // /3
        } else if (n % 5 == 0 ) {
            return "Buzz"; // /5
        } else {
            return String.valueOf(n);
        }
    }
}
