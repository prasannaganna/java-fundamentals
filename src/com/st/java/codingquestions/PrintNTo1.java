package com.st.java.codingquestions;

import java.util.Scanner;

public class PrintNTo1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = sc.nextInt();
        int num = 1;
        while (n>=num){
            System.out.println(n);
            n=n -1;
        }
        sc.close();
    }
}
