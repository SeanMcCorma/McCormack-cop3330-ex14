package com.company;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Sean McCormack
 */

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.printf("What is the order amount? ");
        double amount = Double.parseDouble(scan.nextLine());
        System.out.printf("What is the state? ");
        String state = scan.nextLine().toUpperCase(Locale.ROOT);
        System.out.println(output(state,amount));
    }
    public static String output(String state, double amount){
        double tax = 0;
        if(state.equals("WI")){
            tax = amount*0.055;
            double total = amount+tax;
            return "The subtotal is $"+amount+".\n"
                    +"The tax is $"+tax+".\n"
                    +"The total is $"+total+".\n";
        }
        double total = tax+amount;
        return "The total is $"+total+".";

    }
}
