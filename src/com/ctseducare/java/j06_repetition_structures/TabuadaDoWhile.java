/*
  Reescreva o programa Tabuada (que utiliza a estrutura FOR) utilizando a estrutura de repetição
  DO..WHILE.
*/

package com.ctseducare.java.j06_repetition_structures;

import java.util.Scanner;

public class TabuadaDoWhile {

    public static void main(String[] args) {
        System.out.println("Tabuada de um número");
        System.out.println("");

        var leitura = new Scanner(System.in);

        System.out.print("Digite um número inteiro entre 1 e 10: ");
        var numero = leitura.nextInt();

        var i = 1;
        do {
            System.out.printf("%d x %d = %d\n", numero, i, numero * i);
            i++;
        } while (i <= 10);

        leitura.close();
    }

}
