package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class StockAccountManagement {
    Scanner scnr = new Scanner(System.in);
    ArrayList<Stock> stockList = new ArrayList<>();

    public void readStocksFromFile() {
        BufferedReader br = null;
        try{
            File file = new File("E:\\Projects\\intellijProjects\\StockAccountManagements\\src\\com\\stock_account_managements\\ListOfStocks.txt");
            br = new BufferedReader( new FileReader(file) );

            String line = null;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(br != null){
                try {
                    br.close();
                }catch(Exception ignored){};
            }
        }
    }

    public void addStocks(){
        System.out.print("\nHow many Stocks Do you want to Add? ");
        System.out.print("\nEnter your choice : ");
        int usrInput = scnr.nextInt();
        for(int num = 0; num < usrInput; num++) {
            Stock stockObject = new Stock();
            System.out.print("Enter Share Name : ");
            stockObject.setShareName(scnr.next());
            System.out.print("How many Share do you want to Buy : ");
            stockObject.setNumberOfShare(scnr.nextInt());
            System.out.print("Enter Share Price : ");
            stockObject.setSharePrice(scnr.nextInt());
            stockObject.setBuyingSharePrice(stockObject.getBuyingSharePrice());
            stockList.add(stockObject);
        }
    }

    public void printAddedStocks() {
        boolean empty = stockList.isEmpty();
        if(empty) {
            System.out.println("\nSorry No Record Found...");
            return;
        }
            stockList.forEach(System.out::println);
    }
}