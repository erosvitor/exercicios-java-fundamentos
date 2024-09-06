/*
  Criar um programa para verificar se um nome de pessoa é um nome válido. Um nome válido para pessoa é
  aquele que contem apenas letras e espaços em branco.
*/

package com.ctseducare.java.j08_caracteres;

import java.util.Scanner;

public class NomeValido {

    public static void main(String[] args) {
        System.out.println("Nome válido");
        System.out.println("");

        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite o nome completo de uma pessoa: ");
        String nome = leitura.nextLine();

        char caractere;
        boolean nomeValido = true;
        for (int i = 0; i < nome.length(); i++) {
            caractere = nome.charAt(i);
            if (!Character.isLetter(caractere) && !Character.isWhitespace(caractere)) {
                nomeValido = false;
                break;
            }
        }

        if (nomeValido) {
            System.out.println("O nome informado é válido");
        } else {
            System.out.println("O nome informado é inválido");
        }

        leitura.close();
    }

}
