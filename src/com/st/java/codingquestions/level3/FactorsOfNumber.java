package com.st.java.codingquestions.level3;
 //find the factors of number
import java.util.Scanner;

public class FactorsOfNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = sc.nextInt();
        System.out.println("factors of given number : ");
        for (int i = 1; i <= n; i++) {
            if (n % 1 == 0) {
                System.out.println(i);
            }
        }
     sc.close();

    }
}


