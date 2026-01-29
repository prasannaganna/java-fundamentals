package com.st.java.codingquestions;

import java.util.Scanner;

public class TableOfN {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : " );
        int n = sc.nextInt();
        int i = 1;
        while (i<=n){
            System.out.println(n + " * " + i + " = " + n * i);
           i = i + 1;
        }
        sc.close();
    }
}
