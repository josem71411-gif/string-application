package com.plurasight;

public class Reciept {
    public static void main(String[] args) {    String itemName = "Potatoes";
    double itemPrice = 15.00;

    int quanity = 3;

    double total = itemPrice * quanity;

    System.out.println("You bought " + quanity + " " + itemName + " for $" + total);
    }
}

