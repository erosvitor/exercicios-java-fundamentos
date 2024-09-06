/*
  Criar um programa que solicite o nome completo do usuário e depois mostre na tela o primeiro nome do
  usuário.
 */

package com.ctseducare.java.j08_strings;

import java.util.Scanner;

public class PrimeiroNome {

    public static void main(String[] args) {
        System.out.println("Primeiro nome");
        System.out.println("");

        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = leitura.nextLine();

        String primeiroNome = nomeCompleto.substring(0, nomeCompleto.indexOf(" "));
        System.out.println("Seu primeiro nome é " + primeiroNome);

        leitura.close();
    }

}
