package com.st.java.fundamentals;

import java.util.Scanner;

public class StudentScore
{
    static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        byte teluguMarks,hindiMarks,englishMarks,mathsMarks,socialMarks,chemistryMarks;
        System.out.println("enter the teluguMarks : ");
         teluguMarks = sc.nextByte();
        System.out.println("enter the hindiMarks : ");
         hindiMarks = sc.nextByte();
        System.out.println("enter the englishMarks : ");
         englishMarks = sc.nextByte();
        System.out.println("enter the mathsMarks : ");
         mathsMarks = sc.nextByte();
        System.out.println("enter the socialMarks : ");
        socialMarks = sc.nextByte();
        chemistryMarks = sc.nextByte();
        System.out.println("enter the chemistryMarks : ");
        int totalScore = teluguMarks + hindiMarks + englishMarks + mathsMarks + socialMarks + chemistryMarks;
        float averageScore = (float) (totalScore)/6;
        sc.close();

    }
}
