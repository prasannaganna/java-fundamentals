package com.st.java.codingquestions;

import java.util.Scanner;

public class HarshadNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int N = sc.nextInt();
        int sum = 0;
        int digit;
        int temp = N;
        while (temp > 0) {
            digit = temp % 10;
            sum = sum + digit;
            temp = temp / 10;
        }
        if (N % sum == 0) {
            System.out.println("Hazard Number");
        } else {
            System.out.println(" Not a Hazard Number");
        }
        sc.close();
    }
}
