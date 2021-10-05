package org.example;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //why should it say System.in?
        int year;

        System.out.println(" Enter year : ");
        year = scanner.nextInt();

        if (year % 4 == 0) {
            System.out.println(year + " is a leap year ");
            System.out.println(" Made by Adam and David ");

        } else {
            System.out.println(" is NOT a leap year ");
            System.out.println(" Made by Adam and David ");
        }

    }

}
