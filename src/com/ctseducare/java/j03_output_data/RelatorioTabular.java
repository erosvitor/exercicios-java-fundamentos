/*
  Escreva um programa que mostre na tela o conteúdo abaixo na forma tabular.

    Linguagem             Autor                Ano lançamento
    =========================================================
    Linguagem C           Dennis Ritchie       1972
    Linguagem C++         Bjarne Stroustrup    1982
    Linguagem Java        James Gosling        1991
*/

package com.ctseducare.java.j03_output_data;

public class RelatorioTabular {

    public static void main(String[] args) {
        System.out.printf("Linguagem\t\tAutor\t\t\t\tAno lançamento\n");
        System.out.println("======================================================================");
        System.out.printf("Linguagem C\t\tDennis Ritchie\t\t\t1972\n");
        System.out.printf("Linguagem C++\t\tBjarne Stroustrup\t\t1982\n");
        System.out.printf("Linguagem Java\t\tJames Gosling\t\t\t1991\n");
    }

}
