/*
  Escreva um programa para converter a moeda Real para a moeda Dolar. O programa deve solicitar ao
  usuário um valor em reais e depois mostrar na tela o valor em dólares. Assumir como cotação do
  dolar o valor de 3,35.
*/

package com.ctseducare.java.j04_input_data;

import java.util.Scanner;

public class ConverterRealParaDolar {

    public static void main(String[] args) {
        System.out.println("Converter reais para dólares");
        System.out.println("");

        var leitura = new Scanner(System.in);

        var cotacaoDolar = 3.35f;

        System.out.print("Digite um valor em reais: ");
        var reais = leitura.nextInt();

        var dolares = reais / cotacaoDolar;
        System.out.printf("%d reais equivalem a %f dolares\n", reais, dolares);

        leitura.close();
    }

}
