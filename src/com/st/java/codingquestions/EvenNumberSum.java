package com.st.java.codingquestions;

import java.util.Scanner;

public class EvenNumberSum {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = sc.nextInt();
        int i = 1;
        int evenSum = 0;
        while(i<=n){
            if (i%2==0){
                System.out.println(i);
                evenSum = evenSum + i;
            }
             i = i + 1;
        }
        System.out.println("enter the sum : ");
        System.out.println(evenSum);
        sc.close();
    }
}
