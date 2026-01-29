package com.st.java.codingquestions;

import java.util.Scanner;

public class CountFactorsN {
    static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number : ");
        int n = sc.nextInt();
        int count = 0;
        for( int i =1; i<=n;i++){
            if(n % i == 0)
                count = count +1 ;
        }
        System.out.println(" count the factaors of given number :" + count);

    }
}
