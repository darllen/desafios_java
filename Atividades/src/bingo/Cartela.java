package bingo;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Cartela {
    private static final int TAMANHOCARTELA = 25;
    private static final int NUMEROSPOSSIVEIS = 75;
    private static final int COLUNAS = 5;

    private int[][] numeros;

    public Cartela() {
        numeros = new int[COLUNAS][COLUNAS];
    }
    public void gerarCartela() {
        Set<Integer> numerosGerados = new HashSet<>();
        Random random = new Random();

        int colunasPreenchidas = 0;
        while (colunasPreenchidas < COLUNAS) {
            int coluna = random.nextInt(COLUNAS);
            if (numerosGerados.size() < TAMANHOCARTELA) {
                int numero = random.nextInt(NUMEROSPOSSIVEIS) + 1;
                if (!numerosGerados.contains(numero)) {
                    numeros[coluna][colunasPreenchidas] = numero;
                    numerosGerados.add(numero);
                    colunasPreenchidas++;
                }
            } else {
                break;
            }
        }
    }

    // Métodos para verificar linhas, colunas, diagonais, etc.
}

