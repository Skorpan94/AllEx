package org.example;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println( " Enter First number here ");
        float num1 = scanner.nextInt();

        System.out.println( " Enter Second number here ");
        float num2 = scanner.nextInt();


        float result = (num1 + num2);
        float result2 = (num1 - num2);
        float result3 = (num1 / num2);
        float result4 = (num1 * num2);


        System.out.println( " Addition " );
        System.out.println(num1 + " + " + num2 + " = " + result);
        System.out.println(" Subtraction ");
        System.out.println(num1 + " - " + num2 + " = " + result2);
        System.out.println(" Division ");
        System.out.println(num1 + " / " + num2 + " = " + result3);
        System.out.println(" Multiplication ");
        System.out.println(num1 + " * " + num2 + " = " + result4);
        System.out.println();

        System.out.println(" Made by Adam and David ");


    }

}
