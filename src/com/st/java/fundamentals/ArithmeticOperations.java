package com.st.java.fundamentals;

import java.util.Scanner;

public class ArithmeticOperations
{
    static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value : ");
        byte number1 = sc.nextByte();
        System.out.println("enter the value : ");
        byte number2 = sc.nextByte();
        int result;
        result = number1 + number2;
        System.out.println(result);
        sc.close();
    }
}

