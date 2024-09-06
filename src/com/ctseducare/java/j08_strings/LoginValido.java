/*
  Criar um programa que solicite um login e verifique se o login é válido. O login será válido ser for
  diferente de branco. Exibir a mensagem 'Login Válido' caso o login seja diferente de branco, caso
  contrário, exibir a mensagem 'Login inválido'.
*/

package com.ctseducare.java.j08_strings;

import java.util.Scanner;

public class LoginValido {

    public static void main(String[] args) {
        System.out.println("Login");
        System.out.println("");

        Scanner leitura = new Scanner(System.in);

        String login = null;
        boolean loginValido = true;
        do {
            System.out.print("Digite o login: ");
            login = leitura.nextLine();

            if (login.isBlank()) {
                System.out.println("Login inválido, tente novamente.\n");
                loginValido = false;
            } else {
                System.out.println("Login válido.\n");
                loginValido = true;
            }
        } while (!loginValido);

        leitura.close();
    }

}
