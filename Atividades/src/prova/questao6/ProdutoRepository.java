package prova.questao6;

import java.util.ArrayList;

public class ProdutoRepository {


    public ArrayList<Produto> filtrarProdutosMenorPreco(ArrayList<Produto> lista1, ArrayList<Produto> lista2){
        ArrayList<Produto> lista3 = new ArrayList<>();


        for (Produto produtoLista1 : lista1){
            for (Produto produtoLista2 : lista2){
                if (produtoLista1.getNome().equalsIgnoreCase(produtoLista2.getNome())){
                    if (produtoLista1.getValor() < produtoLista2.getValor()){
                        lista3.add(produtoLista1);
                    } else {
                        lista3.add(produtoLista2);
                    }
                }
            }
        }

        return lista3;
    }
}
