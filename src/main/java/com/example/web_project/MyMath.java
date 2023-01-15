package com.example.web_project;

public class MyMath {
    public static double divide(int number1, int number2) {
        if (number1 == number2)
            throw new ArithmeticException("Деление на 0");
        return number1/number2;
    }
}
