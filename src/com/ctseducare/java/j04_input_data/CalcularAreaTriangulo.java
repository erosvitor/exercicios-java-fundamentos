/*
  Escreva um programa para calcular a área de um triângulo. O programa deve solicitar ao usuário a
  base e a altura do triângulo. Deve calcular a área e depois mostrar o resultado na tela. A fórmula
  para calcular a área de um triângulo é A = (base x altura) / 2.
*/

package com.ctseducare.java.j04_input_data;

import java.util.Scanner;

public class CalcularAreaTriangulo {

    public static void main(String[] args) {
        System.out.println("Calcular área de um triângulo");
        System.out.println("");

        var leitura = new Scanner(System.in);

        System.out.print("Digite a base do triângulo: ");
        var base = leitura.nextInt();

        System.out.print("Digite a altura do triângulo: ");
        var altura = leitura.nextInt();

        var area = (base * altura) / 2;
        System.out.println("A área do triângulo é: " + area);

        leitura.close();
    }

}
