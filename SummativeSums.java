package main;

public class SummativeSums {

    public static int summer(int [] numbers){

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return sum;
    }

    public static void main(String[] args) {

        int[] array1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int[] array2 = { 999, -60, -77, 14, 160, 301 };
        int[] array3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130,
                140, 150, 160, 170, 180, 190, 200, -99 } ;


        System.out.println("#1 Array sum = " + summer(array1));
        System.out.println("#2 Array sum = " + summer(array2));
        System.out.println("#3 Array sum = " + summer(array3));

    }
}
