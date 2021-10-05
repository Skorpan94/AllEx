package org.example;

import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter number here ");
        int a = scanner.nextInt();



        int b = a / 3600;
        //hours
        int remaining = a % 3600;
        //minutes
        int c = remaining /60;
        //seconds
        int d = remaining % 60;

        System.out.println(" Hours: " + b + " \n " + "Minutes: " + c + " \n " + "Seconds: " + d );
        System.out.println("  \n Result");
        System.out.println( b + ":" + c + ":" + d);

        System.out.println(" Made by Adam and David ");
    }
}
