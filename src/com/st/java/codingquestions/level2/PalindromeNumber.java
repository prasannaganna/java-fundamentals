package com.st.java.codingquestions.level2;

import java.util.Scanner;

public class PalindromeNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number N : ");
        int N = sc.nextInt();
        int digit, temp;
        int revNum = 0;
        temp = N;
        while (temp > 0) {
            digit = temp % 10;
            revNum = revNum * 10 + digit;
            temp = temp / 10;
        }
        if (revNum== N)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
        sc.close();
    }
}
