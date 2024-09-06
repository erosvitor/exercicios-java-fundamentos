/*
  Escreva um programa que permita o usuário escolher um produto de um menu de lanches de uma lanchonete.
  Após o usuário selecionar o item, o programa deve mostrar na tela qual foi o item selecionado pelo
  usuário. O menu de lanches que deve ser exibido pelo programa é o seguinte:

    1 – X-Salada
    2 – X-Bacon
    3 – X-Egg
    4 – Refrigerante
    5 – Finalizar pedido
 */

package com.ctseducare.java.j05_decision_structures;

import java.util.Scanner;

public class MenuLanchonete {

  public static void main(String[] args) {
    var leitura = new Scanner(System.in);

    System.out.println("Menu lanchonete");
    System.out.println("");
    System.out.println("1 – X-Salada");
    System.out.println("2 – X-Bacon");
    System.out.println("3 – X-Egg");
    System.out.println("4 – Refrigerante");
    System.out.println("5 – Finalizar pedido");
    
    System.out.print("Escolha um item do menu: ");
    var item = leitura.nextInt();
    
    switch (item) {
      case 1:
        System.out.println("Você escolheu X-Salada");
        break;
      case 2:
        System.out.println("Você escolheu X-Bacon");
        break;
      case 3:
        System.out.println("Você escolheu X-Egg");
        break;
      case 4:
        System.out.println("Você escolheu Refrigerante");
        break;
      case 5:
        System.out.println("Você escolheu finalizar pedido");
        break;
      default:
        System.out.println("Item inexistente");
        break;
    }
    
    leitura.close();
  }

}
