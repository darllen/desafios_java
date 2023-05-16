package prova.questao6;

import java.util.ArrayList;
import java.util.Scanner;

public class ProdutoTest {
    public static void main(String[] args){
        ProdutoRepository produtoRepository = new ProdutoRepository();
        ArrayList<Produto> lista1 = new ArrayList<Produto>();
        ArrayList<Produto> lista2 = new ArrayList<Produto>();

        Produto produto1 = new Produto("Sabonete Protex", 3.50);
        Produto produto2 = new Produto("Biscoito Passatempo", 2.60);
        Produto produto3 = new Produto("Leite Camponesa", 8.60);
        Produto produto4 = new Produto("Feijão Kikaldo", 9.90);

        lista1.add(produto1);
        lista1.add(produto2);
        lista1.add(produto3);
        lista1.add(produto4);

        Produto produto5 = new Produto("Sabonete Protex", 3.40);
        Produto produto6 = new Produto("Biscoito Passatempo", 2.90);
        Produto produto7 = new Produto("Vassoura", 12);
        Produto produto8 = new Produto("Arroz Tio João", 9.90);

        lista2.add(produto5);
        lista2.add(produto6);
        lista2.add(produto7);
        lista2.add(produto8);


        ArrayList<Produto> saida = produtoRepository.filtrarProdutosMenorPreco(lista1, lista2);
        System.out.println(saida);


    }

}
