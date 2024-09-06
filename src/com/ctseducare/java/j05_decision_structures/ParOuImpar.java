/*
  Escreva um programa que leia um número inteiro e depois mostre na tela se o número é par ou ímpar.
*/

package com.ctseducare.java.j05_decision_structures;

import java.util.Scanner;

public class ParOuImpar {

  public static void main(String[] args) {
    var leitura = new Scanner(System.in);

    System.out.println("Verificar se um número é par ou ímpar");
    System.out.println("");
    
    System.out.print("Digite um número inteiro maior que zero: ");
    var numero = leitura.nextInt();
    
    if (numero % 2 == 0) {
      System.out.println("O número é PAR");
    } else {
      System.out.println("O número é ÍMPAR");
    }
    
    leitura.close();
  }

}
