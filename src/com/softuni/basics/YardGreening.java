package com.softuni.basics;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double squareMeters = Double.parseDouble(sc.nextLine());
        double totalPrice = squareMeters * 7.61;
        double discount = totalPrice * 0.18;
        totalPrice -= discount;

        System.out.printf("The final price is: %.2f lv.\n", totalPrice);
        System.out.printf("The discount is: %.2f lv.\n", discount);
    }
}
