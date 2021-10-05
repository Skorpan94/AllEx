package org.example;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter First number here ");
        float a = scanner.nextInt();
        System.out.println(" Enter second number here ");
        float b = scanner.nextInt();

        float  result = (a + b);
        float  result2 = (a * b);
        float  result3 = (a / b);
        float  result4 = (a - b);

        System.out.println(a + " + " + b + " = " + result);
        System.out.println(a + " * " + b + " = " + result2);
        System.out.println(a + " / " + b + " = " + result3);
        System.out.println(a + " - " + b + " = " + result4);

        System.out.println(" Made by Adam and David ");


    }
}
