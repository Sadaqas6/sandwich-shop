package com.Pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sandwich size: ");
        System.out.println("\n1: Regular: base price $5.45");
        System.out.println("2: Large: base price $8.95");
        System.out.print("\nSelect between option 1 or 2: ");

        int sandwichSize = sc.nextInt();
        sc.nextLine();

        double price = 0.0;

        if (sandwichSize == 1) {
            price = 5.45;
            System.out.println("\nYour choice: Regular: base price $5.45");
        } else if (sandwichSize == 2) {
            price = 8.95;
            System.out.println("\nYour choice: Large: base price $8.95");
        } else
            System.out.println("\nTry again! Please select option 1 or 2.");

        System.out.println();
        System.out.print("Would you like it loaded? (yes/no) ");
        String loaded = sc.nextLine();  // sc.nextLine() reads the input from user


        double loadedCost = 0.0;  // starts at 0 and only changes if yes

        if (loaded.equalsIgnoreCase("yes"))
        {

            if (sandwichSize == 1) {
                loadedCost = 1.00;
                System.out.println("\nThere is an additional charge: $1.00");
            } else if (sandwichSize == 2) {
                loadedCost = 1.75;
                System.out.println("\nThere is an additional charge: $1.75");
            } else {
                System.out.println("\nPlease select an option: yes or no");
            }
        }


        System.out.print("\nEnter your age: ");
        int age = sc.nextInt();

        double originalPrice = price + loadedCost;
        double discount = 0.0;

        if (age <= 17) {
            discount = price * .10;
            System.out.println("\nYou will receive a 10% discount!!");
        } else if (age >= 65) {
            discount = price * .20;
            System.out.println("\nYou will receive a 20% discount!!");
        } else {
            System.out.println("\nYou don't qualify for any discounts. :(");
        }


        double totalPrice = originalPrice - discount;

        System.out.println();
        System.out.println("\tOrder Receipt ");
        System.out.println("\tOriginal Price:    $" + price);
        System.out.println("\tLoaded Price:      $" + loadedCost);
        System.out.println("\tDiscount Price:   -$" + discount);
        System.out.printf("\tTotal Price:       $%.2f%n", totalPrice);

    }


    }