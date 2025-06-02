package com.humanbooster;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    FizzBuzzmethod fizz = new FizzBuzzmethod();
        for (int i = 1; i <= 50; i++) {
            System.out.println(fizz.FizzBuzz(i));
        }
    }
}
