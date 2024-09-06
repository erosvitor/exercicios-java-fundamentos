/*
  Utilizando a estrutura de repetição FOR, escreva um programa que solicite ao usuário um número
  inteiro e depois mostre na tela a tabuada do número informado no seguinte formato:

    N x 1 = Y
    N x 2 = Y
    ...
    N x 10 = Y

    onde:
      N é o número informado pelo usuário
      Y é o resultado da multiplicação
*/

package com.ctseducare.java.j06_repetition_structures;

import java.util.Scanner;

public class TabuadaDeUmNumero {

    public static void main(String[] args) {
        System.out.println("Tabuada de um número");
        System.out.println("");

        var leitura = new Scanner(System.in);

        System.out.print("Digite um número inteiro entre 1 e 10: ");
        var numero = leitura.nextInt();

        for (var i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", numero, i, numero * i);
        }

        leitura.close();
    }

}
