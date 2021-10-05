package org.example;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Why doesn't "char" work instead of "String"?
        String a;

        System.out.println("Enter name here");
        a = scanner.next();
        System.out.println("Hello " + a);
    }
}
