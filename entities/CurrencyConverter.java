package entities;

public class CurrencyConverter {
    public static final double dollarPrice = 3.10;

    public static double converter(double dollarBuy){
        double aux = dollarBuy * dollarPrice;
        return aux + ((aux * 6)/100);
    }

}
