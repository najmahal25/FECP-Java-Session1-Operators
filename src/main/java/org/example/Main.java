package org.example;

import java.sql.SQLOutput;
import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); //initializes scanner for input purposes

        System.out.print("Enter temperature in Celsius: ");
        int tempInCelsius = s.nextInt(); // used for getting input

        float tempInFahrenheit = tempInCelsius * ((float) 9 /5) + 32; // formula for converting Celsius to Fahrenheit

        System.out.format("Temperature in Fahrenheit: %.2f", tempInFahrenheit); //Outputs Fahrenheit









    }
}