/*
  Escreva um programa que calcule o juros simples sobre um determinado valor. A fórmula para calcular
  simples simples é a seguinte:

    J = C x I x N

    onde:
      J = juros calculado
      C = capital
      I = taxa
      N = período

      Obs.: Considerar taxa mensal e o período em meses.
*/

package com.ctseducare.java.j04_input_data;

import java.util.Scanner;

public class CalcularJurosSimples {

    public static void main(String[] args) {
        System.out.println("Calcular Juros Simples");
        System.out.println("");

        var leitura = new Scanner(System.in);

        System.out.print("Digite o capital: ");
        var capital = leitura.nextFloat();

        System.out.print("Digite a taxa de juros (mensal): ");
        var taxa = leitura.nextFloat();

        System.out.print("Digite o período (em meses): ");
        var periodo = leitura.nextInt();

        var juros = capital * (taxa / 100) * periodo;
        System.out.println("O juros calculado foi de " + juros);

        leitura.close();
    }

}
