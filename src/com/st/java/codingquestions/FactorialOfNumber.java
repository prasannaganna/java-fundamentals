package com.st.java.codingquestions;

import java.util.Scanner;

public class FactorialOfNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n=sc.nextInt();
        int i=n,factorial = 1;
        do {
            factorial = factorial * i;
            i--;
        }
        while(i>=1);
        System.out.println(factorial);
    }
}
