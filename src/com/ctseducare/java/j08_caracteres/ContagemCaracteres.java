/*
  Criar um programa que leia um texto e depois mostre na tela a quantidade de caracteres excluindo os
  espaços em branco.
*/

package com.ctseducare.java.j08_caracteres;

import java.util.Scanner;

public class ContagemCaracteres {

    public static void main(String[] args) {
        System.out.println("Contagem de Caracteres");
        System.out.println("");

        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite um texto qualquer: ");
        String texto = leitura.nextLine();

        int totalCaracteres = 0;
        char caractere;
        for (int i = 0; i < texto.length(); i++) {
            caractere = texto.charAt(i);
            if (!Character.isWhitespace(caractere)) {
                totalCaracteres++;
            }
        }

        System.out.printf("O texto informado possui %d caracteres, excluindo os espaços em branco.", totalCaracteres);

        leitura.close();
    }

}
