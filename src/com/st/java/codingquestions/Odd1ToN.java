package com.st.java.codingquestions;

import java.util.Scanner;

public class Odd1ToN {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = sc.nextInt();
        int i = 1;
        while (i<=n){
            if(i%2!=0){
                System.out.println(i);
            }
            i = i+1;
        }
        sc.close();
    }
}
