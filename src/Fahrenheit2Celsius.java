package com.company;

public class Fahrenheit2Celsius {
    public static void main (String[] args) {
        int saturdayFahrenheit;
        int sundayFahrenheit;
        saturdayFahrenheit = 75;
        sundayFahrenheit = 81;
        double saturdayCelsius = (5.0/9) * (saturdayFahrenheit - 32);
        double sundayCelsius = (5.0/9) * (sundayFahrenheit - 32);
        System.out.println("Weekend Averages");
        System.out.println("Saturday: " + saturdayCelsius);
        System.out.println("Sunday: " + sundayCelsius);
    }
}