package conta.teste;

import conta.Conta;

public class TesteConta {
    public static void main(String[] arg){

        Conta conta1 = new Conta(444, "Ana", 800, 200);

        conta1.depositar(100);

        conta1.sacar(500);

        conta1.sacar(600);


    }
}
