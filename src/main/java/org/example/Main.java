package org.example;

import java.util.Scanner;

public class Main {
    public static StockAccountManagement stockAccountManagement = new StockAccountManagement();
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Welcome to Stock Account Management!");
        while(true) {
            System.out.print("\nWhat do you want to do?\n");
            System.out.print("\n1.Show Stock List\n2.Add Stocks\n3.Show Added Stocks\n0.Exit");
            System.out.print("\nEnter your choice : ");
            int usrChoice = scnr.nextInt();
            switch (usrChoice) {
                case 1 :
                    stockAccountManagement.readStocksFromFile();
                    break;
                case 2 :
                    stockAccountManagement.addStocks();
                    break;
                case 3 :
                    stockAccountManagement.printAddedStocks();
                    break;
                case 0 :
                    return;
                default :
                    System.out.println("\nPlease Give Valid Input...");
                    break;
            }
        }
    }
}