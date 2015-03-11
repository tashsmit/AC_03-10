package nyc.c4q.tashsmit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //int someNum;
        int initialNum;
        int maxNum;
        int incrementNum;

        //First Excercise
       /* System.out.println("Give me a number");
        someNum = input.nextInt();

        for (int i = 0; i <= someNum; i++) {
            System.out.println(i);*/

        //Second Excercise
        /*System.out.println("Initial value: ");
        initialNum = input. nextInt();

        System.out.println("Max num: ");
        maxNum = input.nextInt();

        System.out.println("Increment value: ");
        incrementNum = input.nextInt();

        for (int i = initialNum; i <= maxNum; i = i + incrementNum)
            System.out.println(i);*/

        //Third Excercise
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("fizzbuzz");
            else if (i % 3 == 0)
                System.out.println("fizz");
            else if (i % 5 == 0)
                System.out.println("buzz");
            else
                System.out.println(i);

        }
    }
}