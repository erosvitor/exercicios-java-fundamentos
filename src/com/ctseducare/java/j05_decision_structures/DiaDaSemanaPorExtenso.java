/*
  Escreva um programa que solicite um dia da semana (entre 1 a 7) e depois mostre o nome por extenso do
  dia informado. Caso o usuário informe um dia inválido, o programa deverá mostrar uma mensagem
  informando que o dia é inválido. Por exemplo, o usuário digitou o dia da semana 1, o programa deverá
  mostrar na tela 'Domingo'.
 */

package com.ctseducare.java.j05_decision_structures;

import java.util.Scanner;

public class DiaDaSemanaPorExtenso {

  public static void main(String[] args) {
    System.out.println("Dia da semana por extenso");
    System.out.println("");
    
    var leitura = new Scanner(System.in);
    
    System.out.print("Digite o dia da semana (1-7): ");
    var diaSemana = leitura.nextInt();
    
    switch (diaSemana) {
      case 1:
        System.out.println("Domingo");
        break;
      case 2:
        System.out.println("Segunda-feira");
        break;
      case 3:
        System.out.println("Terça-feira");
        break;
      case 4:
        System.out.println("Quarta-feira");
        break;
      case 5:
        System.out.println("Quinta-feira");
        break;
      case 6:
        System.out.println("Sexta-feira");
        break;
      case 7:
        System.out.println("Sábado");
        break;
      default:
        System.out.println("Dia da semana inválido");
        break;
    }
    
    leitura.close();
  }

}
