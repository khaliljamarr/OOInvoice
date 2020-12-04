package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Inventory> allInventory = new ArrayList<Inventory>();
        ArrayList<Purchases> allPurchases = new ArrayList<Purchases>();

        Inventory inventory = new Inventory();

        inventory.setProduct("Bison Sweater");
        inventory.setPrice(55.99);
        allInventory.add(inventory);

        inventory.setProduct("Bison Tee");
        inventory.setPrice(14.99);
        allInventory.add(inventory);

        inventory.setProduct("Bison Hoodie");
        inventory.setPrice(23.99);
        allInventory.add(inventory);

        inventory.setProduct("Bison Bumper Sticker");
        inventory.setPrice(4.99);
        allInventory.add(inventory);

        String answer = " ";
        input = new Scanner(System.in);
        String item;
        double sum = 0.0;
        int index = -1;
        do {
            System.out.println("What did you purchase?: ");
            item = input.nextLine();
            Purchases order = new Purchases();
            for (int i = 0; i < allInventory.size(); i++) {
                if (item.equals(allInventory.get(i))) {
                    index = i;
                    String in = allInventory.get(index).getProduct();
                    double c = allInventory.get(index).getPrice();
                    order.setPurchaseditem(in);
                    order.setPurchasprice(c);
                    allPurchases.add(order);
                }
            }
        } while (!item.equals("Done"));
        double cost = 0.0;
        for (int i = 0; i < allPurchases.size(); i++) {
            double itemPurchased = allPurchases.get(i).getPurchasprice();
            cost += itemPurchased;
        }
        System.out.println("Your total is $" + cost);
    }
}