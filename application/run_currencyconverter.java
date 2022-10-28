package application;

import entities.CurrencyConverter;

import java.util.Scanner;

public class run_currencyconverter {
    public static void main(String args[]){
        Scanner leia = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = leia.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double dollarBuy = leia.nextDouble();
        System.out.printf("Amount to be paid in reais: %.2f", CurrencyConverter.converter(dollarBuy));


        leia.close();
    }
}
