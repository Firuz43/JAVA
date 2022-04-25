package com.example.helloworld;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;
//import java.util.Date;

public class HelloWorld {
    public static void main(String[] args) {
        // Implicit casting
        // byte -> short -> int -> long -> float
//        int x = 1;
//        int y = x + 2;
//        double x = 1.1;
//        int y = (int)x + 2;
//        System.out.println(y);
//        String x = "1";
//        int y = Integer.parseInt(x) + 2;
//        System.out.println(y);
//        int result = (int)Math.ceil(1.1F);
//        System.out.println(result);
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Your age: ");
//        byte age = scanner.nextByte();
//        System.out.println("You are " + age + " years old");
//        byte age = 16;
//        if (age >= 18) {
//            System.out.println("You are old enough");
//        } else {
//            System.out.println("You are not allowed");
//        }
//    }
//    int income = 120_000;
//    boolean hasHighIncome = (income > 100_00);
//        int income = 120_000;
//        String className = income > 100_000 ? "First" : "Economy";
//            if (income > 100_000);
//                className = "First";
        String[] fruits = {"Apple", "Mango", "Banana"};
//        for (int i = 0; i < fruits.length; i++) ;
//             System.out.println(fruits[i]);

        for (String fruit : fruits)
            System.out.println(fruit);
    }
}
