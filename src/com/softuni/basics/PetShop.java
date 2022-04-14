package com.softuni.basics;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dogFoodPackagesCount = Integer.parseInt(sc.nextLine());
        int catFoodPackagesCount = Integer.parseInt(sc.nextLine());

        Double dogFoodPrice = dogFoodPackagesCount * 2.5;
        Double catFoodPrice = catFoodPackagesCount * 4.0;
        Double totalFoodPrice = dogFoodPrice + catFoodPrice;

        System.out.printf("%.1f lv.%n", totalFoodPrice);
    }
}
