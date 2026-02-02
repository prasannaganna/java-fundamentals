package com.st.java.codingquestions.level2;

import java.util.Scanner;

public class PrimeFrom1ToN {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number N : ");
        int N = sc.nextInt();
        for (int i = 2; i <= N; i++) {
            int flag = 1;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                System.out.println(i);
            }
            sc.close();
        }
    }
}
