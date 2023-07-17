package bingo;

public class Main {
    public static void main(String[] args) {
        Bingo bingo = new Bingo();
        int quantidadeCartelas = 50;

        bingo.gerarCartelas(quantidadeCartelas);

        int numerosSorteados = 50; // Exemplo: Sorteio de 50 números
        for (int i = 0; i < numerosSorteados; i++) {
            int numeroSorteado = bingo.sortearNumero();
            System.out.println("Número sorteado: " + numeroSorteado);
            bingo.verificarCartelasPremiadas();
        }
    }
}

