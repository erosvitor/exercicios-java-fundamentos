/*
  Considerando um capital de R$ 1.000,00, uma taxa de juros mensal de 10% e um período de 1 mês,
  escreva um programa que armazene os dados acima em variáveis e depois produza a seguinte saída
  formatada:

  O juros calculado sobre o capital de R$ 1000,00, durante 1 mês, com uma taxa de 10%, foi de R$ 100,00
*/

package com.ctseducare.java.j03_output_data;

public class JurosCalculado {

    public static void main(String[] args) {
        var capital = 1000.00f;
        var taxa = 10f;
        var periodo = 1;

        System.out.printf(
                "O juros calculado sobre o capital de R$ %.2f, durante %d mês, com uma taxa de %.0f%%, foi de R$ %.2f",
                capital, periodo, taxa, 100.00
        );
    }

}
