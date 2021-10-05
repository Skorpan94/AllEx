package org.example;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter First number here ");
        int num1 = scanner.nextInt();
        System.out.println(" Enter second number here ");
        int num2 = scanner.nextInt();
        System.out.println(" Enter third number here ");
        int num3 = scanner.nextInt();


        int result = (num1 + num2 + num3) / 3;

        System.out.println( " (" + num1 + " + " + num2 + " + " + num3 + ") " + " / " + 3 + " = " + result );

        System.out.println(" Made By Adam and David ");


    }
}
