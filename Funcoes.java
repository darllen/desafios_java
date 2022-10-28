import java.util.Scanner;

public class Funcoes {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = leia.nextInt();
        int b = leia.nextInt();
        int c = leia.nextInt();

        int higher = maximo(a,b,c);
        showResult(higher);

        leia.close();
    }
    //Retorna algo
    public static int maximo(int x, int y, int z){
        int auxiliar;
        if (x > y && x > z){
            auxiliar = x;
        } else if (y > z) {
            auxiliar = y;
        } else {
            auxiliar = z;
        }

        return auxiliar;
    }
    //Retorna nada, só mostra na tela
    public static void showResult(int value){
        System.out.println("Higher = " + value);
    }



}
