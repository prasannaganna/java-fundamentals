package com.st.java.codingquestions;

import java.util.Scanner;

public class PerfectNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int N = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < N; i++) {
            if (N % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == N) {
            System.out.println("Perfect Number");
        } else {
            System.out.println(" Not a Perfect Number");
        }
        sc.close();
    }
}
