package com.st.java.codingquestions.level1;

import java.util.Scanner;

public class SumOfNumbers {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while(i<=n){
            sum = sum + i;
            i =i+1;
        }
        System.out.println(sum);
        sc.close();
    }
}
