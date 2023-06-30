package application;

import java.util.Scanner;

public class run_matriz {
    public static void main(String args[]){
        Scanner leia = new Scanner(System.in);

        int n = leia.nextInt();
        int[][] mat = new int[n][n];
        int negative = 0;

        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                mat[i][j] = leia.nextInt();
                if (mat[i][j] < 0){
                    negative++;
                }
            }
        }
        System.out.println("Main diagonal: ");
        for (int i = 0; i < mat.length; i++){
            System.out.print(mat[i][i] + " ");
        }

        System.out.println("\nNegative numbers = "+ negative);

        leia.close();
    }
}
