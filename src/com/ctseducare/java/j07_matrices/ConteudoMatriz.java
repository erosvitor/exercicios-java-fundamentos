/*
  Escreva um programa que leia 4 números inteiros e guarde-os numa matriz 2x2. Depois da leitura dos
  números, mostrar na tela o conteúdo da matriz.
*/

package com.ctseducare.java.j07_matrices;

import java.util.Scanner;

public class ConteudoMatriz {

  public static void main(String[] args) {
    System.out.println("Mostra conteúdo de uma matriz");
    System.out.println("");
    
    var leitura = new Scanner(System.in);
    
    var matriz = new int[2][2];
    
    for (var i=0; i < matriz.length; i++) {
      for (var j=0; j < matriz[i].length; j++) {
        System.out.printf("Digite o elemento para a posição %d,%d da matriz: ", i, j);
        matriz[i][j] = leitura.nextInt();
      }
    }

    for (var i=0; i < matriz.length; i++) {
      for (var j=0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j]);
      }
      System.out.println("");
    }

    leitura.close();
  }

}
