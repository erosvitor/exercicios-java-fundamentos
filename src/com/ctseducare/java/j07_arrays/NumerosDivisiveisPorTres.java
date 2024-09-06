/*
  Escreva um programa que armazene os números 8, 6, 27, 13, 36 e 9 num vetor e depois mostre na tela
  os números que são divisíveis por 3.
*/

package com.ctseducare.java.j07_arrays;

public class NumerosDivisiveisPorTres {

    public static void main(String[] args) {
        System.out.println("Números divisíveis por três");
        System.out.println("");

        int numeros[] = { 8, 6, 27, 13, 36, 9 };

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 3 == 0) {
                System.out.println(numeros[i]);
            }
        }
    }

}
