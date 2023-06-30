package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
    public static void main(String[] args){

        //-Tamanho da lista: size()
        //-Inserir elemento na lista: add(obj), add(int, obj)
        //-Remover elementos da lista: remove(obj), remove(int), removeIf(Predicate)
        //-Encontrar posição de elemetnso: indexOf(obj), lastIndexOf(obj)
        //-Filtrar lista com base em predicado:
        //List<Integer> result = list.stream().filter(x -> x > 4).collect(Collectors.toList());
        //-Filtrar a primeira ocorrência com base em predicado:
        //Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null);

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            list.add(i+1);
        }
        System.out.println(list);
        int tamanho = list.size();
        System.out.println("A lista tem tamanho: " + tamanho);
        System.out.println("======================");
        /*
        for (Integer x : list){
            System.out.println(x);
        }*/

        list.add(2,300); // isso vai empurrar os outros caras para indices posteriores
        System.out.println(list);
        tamanho = list.size();
        System.out.println("A lista tem tamanho: " + tamanho);
        System.out.println("======================");

        list.remove(2);
        System.out.println(list);
        // removerTodo x tal que x seja par
        //list.removeIf(x -> x % 2 == 0);
        System.out.println(list);
        System.out.println("======================");
        System.out.println("Número 5 está na posição: " + list.indexOf(5));/*se o indexOf não encontrar na lista ele retorna -1*/
        System.out.println("======================");

        System.out.println("Só quero números pares agora:");
        //primerio converto pra stream, depois faço a operação lambda que quero, e converto para lista de novo com o collect
        List<Integer> pares = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(pares);
        System.out.println("======================");

        System.out.println("Encontrar o primeiro número ímpar:");
        Integer par = pares.stream().filter(x -> x % 2 == 0).findFirst().orElse(null);
        System.out.println(par);
    }


}

