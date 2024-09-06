/*
  Utilizando a estrutura de repetição WHILE, escreva um programa que mostre na tela todos os números
  ímpares entre os números 0 e 100.
*/

package com.ctseducare.java.j06_repetition_structures;

public class NumerosImpares {

    public static void main(String[] args) {
        System.out.println("Números ímpares entre 0 e 100");
        System.out.println("");

        var numero = 0;
        while (numero <= 100) {
            if (numero % 2 != 0) {
                System.out.println(numero);
            }
            numero++;
        }
    }

}
