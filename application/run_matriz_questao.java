package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class run_matriz_questao {
    public static void main(String args[]){
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2022-11-07");
        LocalDateTime d05 = LocalDateTime.parse("2022-11-07T17:13:26");
        Instant d06 = Instant.parse("2022-11-07T17:13:26Z");



        System.out.println("d01 = " + d01);
        System.out.println("d02  = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04 );
        System.out.println("d05  = " + d05);
        System.out.println("d06 = " + d06);
    }



}
