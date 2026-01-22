package com.st.java.fundamentals;

import java.util.Scanner;

public class TakeInput
{
    static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age : ");
        //using  byte data type

        byte age = sc.nextByte();
        System.out.println("enter the months : ");
        byte months = sc.nextByte();
        System.out.println("enter the daysof Months : ");
        byte daysofMonths = sc.nextByte();
        System.out.println(" enter the temperature : ");
        byte temperature = sc.nextByte();
        System.out.println("enter the rollNo : " );
        byte rollNo = sc.nextByte();

        //using short data type
        System.out.println(" enter the currentyear : ");
        short currentYear = sc.nextShort();
        System.out.println("enter the fourDigitPinNumber : ");
        short fourDigitPinNumber = sc.nextShort();
        System.out.println("enter the jeeRankNumber : ");
        short jeeRankNumber = sc.nextShort();
        System.out.println("enter the bikeNO : ");
        short bikeNo = sc.nextShort();
        System.out.println(" enthe the simpleShoppingPrice : ");
        short simpleShopingPrice = sc.nextShort();

        //using int data type
        System.out.println("enter the  salaryinMonth : ");
        int salaryinMonth = sc.nextInt();
        System.out.println("enter the hyderabadPopulation : ");
        int hyderabadPopulation  = sc.nextInt();
        System.out.println("enter the pinCode : ");
        int pincode = sc.nextInt();
        System.out.println("enter the priceofIPhone : ");
        int priceofIPhone = sc.nextInt();
        System.out.println("enter the secondsinaDay : ");
        int secondsinaDay = sc.nextInt();

        //using long data type
        System.out.println("enter the worldPopulation : ");
        long worldPopulations = sc.nextLong();
        System.out.println("enter the adhaarNumber : ");
        long adhaarNumber = sc.nextLong();
        System.out.println("enter the phoneNumber : ");
        long phoneNumber = sc.nextLong();
        System.out.println("enter thenationBuget : ");
        long nationBuget = sc.nextLong();

        //using float data type
        System.out.println("enter the rating : ");
        float rating = sc.nextFloat();
        System.out.println("enter the studentPercentage : ");
        float studentPercentage = sc.nextFloat();
        System.out.println("enter the makingCharge : ");
        float makingCharges = sc.nextFloat();
        System.out.println("enter the bodyTemperature : ");
        float bodyTemperature = sc.nextFloat();
        System.out.println("enter the personWeight : ");
        float personWeight = sc.nextFloat();

        //using double data type
        System.out.println("enter the piValue : ");
        double piValue = sc.nextDouble();
        System.out.println("enter the distancetoSun : ");
        double distancetoSun = sc.nextDouble();
        System.out.println("enter the taxValue : ");
        double taxValue = sc.nextDouble();
        System.out.println("enter the latitudeofWorld ; ");
        double latitudeofWorld = sc.nextDouble();
        System.out.println("enter the  longitudeofWorld : ");
        double longitudeofWorld = sc.nextDouble();

        //using char data type
        System.out.println("enter the section : ");
        char section = sc.next().charAt(0);
        System.out.println("enter the bloodgroup : ");
        char bloodgroup = sc.next().charAt(0);
        System.out.println("enter the gender : ");
        char gender  = sc.next().charAt(0);
        System.out.println("enter the option : ");
        char option = sc.next().charAt(0);
        System.out.println("enter the directions : ");
        char directions = sc.next().charAt(0);
        System.out.println("enter the isRaining ; ");

        //using boolean data type
        boolean isRaining = sc.nextBoolean();
        System.out.println("enter the isAcOn : ");
        boolean isAcOn = sc.nextBoolean();
        System.out.println("enter the isCouponValid : ");
        boolean isCouponValid = sc.nextBoolean();
        System.out.println("enter the isDoorOpen : ");
        boolean isDoorOpen = sc.nextBoolean();
        System.out.println("enter the isItemInStock : ");
        boolean  isItemInStock = sc.nextBoolean();
        sc.close();
    }
}
