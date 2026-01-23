package com.st.java.fundamentals;

import java.util.Scanner;

public class ProductPurchase {
    static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float productPrice , discountPercentage , discountAmount;
        float centalTax = 2.5f;
        float stateTax = 2.5f;
        float finalPrice;
        int quantity;
        float finalQuantityPrice, totalsaveAmount;
        System.out.println("enter the productPrice : ");
        productPrice = sc.nextInt();
        System.out.println("enter the discountPercentage ; ");
        discountPercentage = sc.nextFloat();

        discountAmount = productPrice * discountPercentage / 100;
        finalPrice = productPrice - discountAmount + (centalTax + stateTax);
        System.out.println("discountAmount : " + discountAmount);
        System.out.println("centalTax : " + centalTax);
        System.out.println("stateTax : " + stateTax);
        System.out.println("finalPrice of the  1 product : " + finalPrice);
        System.out.println("enter the quantity : " );
        quantity = sc.nextInt();
        finalQuantityPrice = quantity * finalPrice;
        System.out.println("finalBill : " + finalQuantityPrice);
        totalsaveAmount = (productPrice * quantity) - finalQuantityPrice ;
        System.out.println("Total saved amount : " + totalsaveAmount);
        sc.close();
    }
}


