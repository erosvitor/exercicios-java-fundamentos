/*
  Escreva um programa que armazene os números 1, 2, 3, 4, 5 e 6 num vetor e depois mostre os dados em
  ordem decrescente.
 */

package com.ctseducare.java.j07_arrays;

public class OrdemDecrescente {

    public static void main(String[] args) {
        System.out.println("Ordem decrescente");
        System.out.println("");

        int numeros[] = { 1, 2, 3, 4, 5, 6 };

        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }

}
