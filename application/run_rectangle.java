package application;

import entities.Rectangle;

import java.util.Scanner;

public class run_rectangle {
    public static void main(String args[]) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Enter rectangle width and height: ");

        Rectangle retangulo = new Rectangle();

        retangulo.width = leia.nextDouble();
        retangulo.height = leia.nextDouble();
        //System.out.printf("");
        System.out.printf("AREA = %.2f %n", retangulo.getArea(retangulo.height, retangulo.width));
        System.out.printf("PERIMETER = %.2f %n", retangulo.getPerimeter(retangulo.height, retangulo.width));
        System.out.printf("DIAGONAL = %.2f %n", retangulo.getDiaginal(retangulo.height, retangulo.width));

        leia.close();

    }

}
