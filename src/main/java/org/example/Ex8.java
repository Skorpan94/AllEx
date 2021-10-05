package org.example;

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {

        int hiddenNumber;
        //gave hiddenNumber a variable

        //Q : Why write (int) and how come we write math.random * 99 + 1?
        hiddenNumber = (int) (Math.random() * 499 + 1);
        // System.out.println("The hidden number is " + hiddenNumber);

        Scanner scanner = new Scanner(System.in);
        int count = 1;
        //counts starts at one

        int guess;

        do {

            System.out.print("Guess the right number form 1 to 500: \n");
            guess = scanner.nextInt();

            if (guess > hiddenNumber)
                System.out.println(" Haha, aiming for the sun? xD \n try again =) ");

            else if (guess < hiddenNumber)
                System.out.println(" Haha, go swim with the fish! xD \n try again =) ");

            else if (guess == hiddenNumber)
                System.out.println(" Did it really take you " + count + " times " + "to get the right answer? xD \n OMG :P");

            count++;

        }while (guess != hiddenNumber);

    }
}