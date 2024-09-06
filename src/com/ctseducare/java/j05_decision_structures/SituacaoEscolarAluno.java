/*
  Escreva um programa que mostre a situação escolar de um determinado aluno. O programa deverá
  solicitar ao usuário quatro notas bimestrais e depois mostrar se o aluno foi aprovado, reprovado ou
  recuperação. Se média for igual ou maior do que 70.0, mostrar APROVADO. Se a média for igual ou maior
  do que 40.0, mostrar EM RECUPERAÇÃO. Caso seja menor do que 40.0, mostrar REPROVADO.
 */

package com.ctseducare.java.j05_decision_structures;

import java.util.Scanner;

public class SituacaoEscolarAluno {

  public static void main(String[] args) {
    var leitura = new Scanner(System.in);

    System.out.println("Verificar a situção escolar de um aluno");
    System.out.println("");
   
    System.out.print("Digite a nota do primeiro bimestre: ");
    var nota1 = leitura.nextInt();

    System.out.print("Digite a nota do segundo bimestre: ");
    var nota2 = leitura.nextInt();

    System.out.print("Digite a nota do terceiro bimestre: ");
    var nota3 = leitura.nextInt();

    System.out.print("Digite a nota do quarto bimestre: ");
    var nota4 = leitura.nextInt();

    var media = (nota1+nota2+nota3+nota4) / 4;
    
    if (media >= 70.0) {
      System.out.println("O aluno esta aprovado");
    } else if (media < 40.0) {
      System.out.println("O aluno esta reprovado");
    } else {
      System.out.println("O aluno esta em recuperação");
    }
    
    leitura.close();
  }

}
