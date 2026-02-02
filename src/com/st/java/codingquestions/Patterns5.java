package com.st.java.codingquestions;

import java.util.Scanner;

public class Patterns5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int i = 1;
        while (n >= i) {
            int j = 1;
            while (n >= j) {
                System.out.print(" " + "*" + " ");
                j++;
            }
            System.out.println(" ");
            n--;
        }
        sc.close();
    }
}
