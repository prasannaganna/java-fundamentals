package com.st.java.fundamentals;

import java.util.Scanner;

public class MembershipPurchaseSwitch {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float productPrice,totalsaveAmount;
        float centalTax = 2.5f;
        float stateTax = 2.5f;
        float finalPrice, finalQuantityPrice, discountPercentage;
        int quantity, shippingCharges;
        char memberShip;
        System.out.println("enter the productPrice : ");
        productPrice = sc.nextFloat();
        System.out.println("enter the memberShip : ");
        memberShip = Character.toUpperCase(sc.next().charAt(0));
        switch (memberShip) {
            case 'S':
                discountPercentage = 10;
                shippingCharges = 50;
                break;
            case 'G':
                discountPercentage = 15;
                shippingCharges = 20;
                break;
            case 'D':
                discountPercentage = 20;
                shippingCharges = 0;
                break;
            default:
                discountPercentage = 0;
                shippingCharges = 100;
                break;
        }
        discountPercentage = productPrice * discountPercentage / 100;
        finalPrice = productPrice - discountPercentage + (centalTax + stateTax);
        System.out.println("discountPercentage : " + discountPercentage);
        System.out.println("centalTax : " + centalTax);
        System.out.println("stateTax : " + stateTax);
        System.out.println("finalPrice of the  1 product : " + finalPrice);
        System.out.println("membership of the coustomer is : " + memberShip);
        System.out.println(" shipping charges : " + shippingCharges);
        System.out.println("enter the quantity : ");
        quantity = sc.nextInt();
        finalQuantityPrice = quantity * finalPrice;
        System.out.println("finalBill : " + finalQuantityPrice);
        totalsaveAmount = (productPrice * quantity) - finalQuantityPrice;
        System.out.println("Total saved amount : " + totalsaveAmount);
        sc.close();
    }
}
