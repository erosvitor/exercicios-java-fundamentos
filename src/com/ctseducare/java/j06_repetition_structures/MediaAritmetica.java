/*
  Utilizando a estrutura de repetição WHILE, escreva um programa que solicite ao usuário quatro números
  inteiros e depois mostre na tela a média aritmética dos números informados.
*/

package com.ctseducare.java.j06_repetition_structures;

import java.util.Scanner;

public class MediaAritmetica {

    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        System.out.println("Média Aritmética");
        System.out.println("");

        var qtde = 1;
        var nota = 0.0f;
        var somaDasNotas = 0.0f;
        while (qtde <= 4) {
            System.out.print("Digite a nota " + qtde + ": ");
            nota = leitura.nextFloat();
            somaDasNotas += nota;
            qtde++;
        }

        var media = somaDasNotas / 4;
        System.out.print("A média aritmética é: " + media);

        leitura.close();
    }

}
