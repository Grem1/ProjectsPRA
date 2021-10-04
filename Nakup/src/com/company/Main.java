package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] products = {"1.Rohlík", "2.Mléko", "3.Jogurt", "4.Salám", "5.Sýr", "6.Dobrá 42", "7.Hanácká Tuzemák"};
        int[] prize = {1, 35, 20, 15, 12, 110, 0};
        int payment = 0;
        String help = "Help";

        if (args.length == 0) {
            System.out.println("Try to type 'Help' to see commands");
            System.exit(1);
        }

        if (args[0].equals(help)) {
            System.out.println("Type number of products you want to buy");
            System.exit(1);
            for (String product : products) {
                System.out.println(product);
            }
        }

        int[] order = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            order[i] =Integer.parseInt(args[i]);
            payment += prize[order[i]];
        }

        System.out.println("Your products ");
        for (int i = 0; i < order.length; i++) {
            System.out.println(products[order[i]]);
        }
        System.out.println(" Prize " + payment);
    }
}
