package com.st.java.fundamentals;

import java.util.Scanner;

public class ExampleIO {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String a = scan.nextLine();
        System.out.println("String: " +a);
        System.out.println("Double: " +d);
    }
}
