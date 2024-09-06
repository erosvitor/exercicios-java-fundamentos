/*
  Utilizando a estrutura de repetição FOR, escreva um programa que mostre na tela os números divisíveis
  por 3 que estão entre os números de 0 e 100.
*/

package com.ctseducare.java.j06_repetition_structures;

public class NumerosDivisiveisPorTres {

    public static void main(String[] args) {
        System.out.println("Números divisíveis por 3 entre 0 e 100");
        System.out.println("");

        for (var numero = 0; numero <= 100; numero++) {
            if (numero % 3 == 0) {
                System.out.println(numero);
            }
        }

    }

}
