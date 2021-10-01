package main;

import java.util.Scanner;

import static java.lang.StrictMath.round;

public class HealthyHearts {

    public static void main(String[] args) {

        System.out.println("What is your age?");
        Scanner myScanner = new Scanner(System.in);
        int age = myScanner.nextInt();
        int max = 220-age;

        System.out.println("Your maximum heart rate should be " + (max) + " beats per minute");
        System.out.println("Your target HR Zone is " + (round(max*0.5)) + " - " + (round(max*0.85)) + " beats per minute");
    }
}
