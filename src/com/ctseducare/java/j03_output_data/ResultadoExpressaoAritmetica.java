/*
  Escreva um programa que mostre na tela o resultado que será armazenado na variável x pela expressão
  aritmética x = 1000 * (1,5 / 100) * 6.
*/

package com.ctseducare.java.j03_output_data;

public class ResultadoExpressaoAritmetica {

    public static void main(String[] args) {
        System.out.println("Resultado da expressão aritmética 'x = 1000 * (1.5 / 100) * 6'");
        System.out.println("");

        var x = 1000 * (1.5 / 100) * 6;
        System.out.println(x);
    }

}
