package application;

import entities.Triangle;

import java.util.Scanner;

public class run_triangle {
    public static void main(String args[]) {
        Scanner leia = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X");
        x.a = leia.nextFloat();
        x.b = leia.nextFloat();
        x.c = leia.nextFloat();
        double areaX = x.getArea();

        System.out.println("Enter the measures of triangle Y");
        y.a = leia.nextFloat();
        y.b = leia.nextFloat();
        y.c = leia.nextFloat();
        double areaY = y.getArea();

        System.out.printf("Triangle X area: %.4f %n", areaX);
        System.out.printf("Triangle Y area: %.4f %n", areaY);

        char larger = (areaX > areaY) ? 'X' : 'Y';
        System.out.println("Larger area: " + larger);
    }
}

