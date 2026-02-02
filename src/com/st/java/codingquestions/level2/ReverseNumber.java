package com.st.java.codingquestions.level2;

import java.util.Scanner;

public class ReverseNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");
        int N = sc.nextInt();
        int digit;
        int revNum = 0;
        while (N > 0) {
            digit = N % 10;
            revNum = revNum * 10 + digit;
            N = N / 10;
        }
        System.out.println(revNum);
        sc.close();
    }
}
