package com.st.java.codingquestions.level3;

import java.util.Scanner;

public class StrongNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int N = sc.nextInt();
        int sum = 0;
        int digit;

        int temp=N;
        while (temp>0){
            digit=temp%10;
            int factorialDigit=1;
            for (int i=1; i<=digit; i++){
                factorialDigit=factorialDigit*i;
            }
            temp=temp/10;
            sum=sum+factorialDigit;
        }
        if (sum == N) {
            System.out.println("Strong Number");
        } else {
            System.out.println(" Not a Strong Number");
        }
        sc.close();
    }
}
