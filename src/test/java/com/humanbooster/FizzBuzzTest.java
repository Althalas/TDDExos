package com.humanbooster;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    private final FizzBuzzmethod fizz = new FizzBuzzmethod();
    @Test
    void doisreturnFizz() {
        assertEquals("Fizz",fizz.FizzBuzz(3));// return Fizz si il est divisible par 3
    }
    @Test
    void doisreturnBuzz() {
        assertEquals("Buzz",fizz.FizzBuzz(5));// return Buzz si il est divisible par 5
    }
    @Test
    void doisreturnFizzBuzz() {
        assertEquals("FizzBuzz",fizz.FizzBuzz(15));// return FizzBuzz si il est divisible par 3 et 5
    }
    @Test
    void doisreturnnenstring(){
        assertEquals("2",fizz.FizzBuzz(2));// return le nombre si il n'est pas divisible par 3 ou 5
    }
}