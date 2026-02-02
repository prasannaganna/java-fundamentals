package com.st.java.codingquestions;

import java.util.Scanner;

public class GCDOfTwoNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num1 : ");
        int num1=sc.nextInt();
        System.out.println("Enter Num2 : ");
        int num2=sc.nextInt();
        //Euclid method
        while (num2!=0){
            int remainder=num1%num2;
            num1=num2;
            num2=remainder;
        }
        System.out.println("GCD OF 2 NUMBERS : "+ num1);
        sc.close();
    }
}
