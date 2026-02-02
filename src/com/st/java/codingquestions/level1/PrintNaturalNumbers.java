package com.st.java.codingquestions.level1;

import java.util.Scanner;

public class PrintNaturalNumbers {
    static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = sc.nextInt();
        int num = 1;
        while (num<=n){
            System.out.println(num);
            num =num +1;
            sc.close();
        }
    }
}
