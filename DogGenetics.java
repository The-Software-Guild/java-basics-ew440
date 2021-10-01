package main;

import java.util.Random;
import java.util.Scanner;

public class DogGenetics {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("What is your dog's name?");
        String dogName = myScanner.nextLine();
        System.out.println("Well then, I have this highly reliable report on "
                + dogName + "'s prestigious background right here.");
        System.out.println(dogName + " is: ");

        Random randNo = new Random();

        int num1 = randNo.nextInt(40) + 1;
        int num2 = randNo.nextInt(40) + 1;
        int num3 = randNo.nextInt(60-(num1+num2)) + 1;
        int num4 = randNo.nextInt(100-(num1+num2+num3)) + 1;
        int num5 = 100-(num1+num2+num3+num4);

        System.out.println(num1 + "% St. Bernard");
        System.out.println(num2 + "% Chihuahua");
        System.out.println(num3 + "% Dramatic RedNosed Asian Pug");
        System.out.println(num4 + "% Common Cur");
        System.out.println(num5 + "% King Doberman");
        System.out.println("Wow, that's QUITE the dog!");
    }
}
