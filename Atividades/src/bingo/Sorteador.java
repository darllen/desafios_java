package bingo;

import java.util.List;
import java.util.Random;

public abstract class Sorteador {

    public int sortearNumero(List<Integer> numerosSorteados) {
        Random random = new Random();
        int numeroSorteado;

        do {
            numeroSorteado = random.nextInt(75) + 1;
        } while (numerosSorteados.contains(numeroSorteado));

        numerosSorteados.add(numeroSorteado);
        return numeroSorteado;
    }
}
