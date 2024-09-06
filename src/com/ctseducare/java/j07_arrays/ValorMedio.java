/*
  Escreva um programa que armazene 5 valores num vetor e depois mostre na tela o valor médio informado.
  Os valores devem ser informados pelo usuário.
 */

package com.ctseducare.java.j07_arrays;

import java.util.Scanner;

public class ValorMedio {

    public static void main(String[] args) {
        System.out.println("Valor Médio");
        System.out.println("");

        var leitura = new Scanner(System.in);

        var valores = new int[5];

        for (var i = 0; i < valores.length; i++) {
            System.out.println("Digite o valor " + (i + 1));
            valores[i] = leitura.nextInt();
        }

        var totalValores = 0;
        for (var i = 0; i < valores.length; i++) {
            totalValores += valores[i];
        }

        var valorMedio = totalValores / valores.length;
        System.out.println("O valor médio é " + valorMedio);

        leitura.close();
    }

}
