package com.st.java.fundamentals;

import java.util.Scanner;

public class MembershipPurchase {
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
        if (memberShip == 'S'){
            discountPercentage = 10;
            shippingCharges = 50;
        } else if (memberShip =='G') {
            discountPercentage = 15;
            shippingCharges = 20;
        } else if (memberShip =='D') {
            discountPercentage = 20;
            shippingCharges = 0;
        } else {
            discountPercentage = 0;
            shippingCharges =100;
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
