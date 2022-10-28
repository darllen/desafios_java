package application;

import entities.Calculator;

import java.util.Scanner;

public class run_calculator {
    public static void main(String args[]){
        Scanner leia = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = leia.nextDouble();

        double c = Calculator.circumference(radius);
        double v = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n",c);
        System.out.printf("Volume: %.2f%n",v);
        System.out.printf("PI value: %.2f%n",Calculator.PI);
    }
}
