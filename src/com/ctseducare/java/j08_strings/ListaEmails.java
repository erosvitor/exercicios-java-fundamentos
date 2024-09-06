/*
  Criar um programa que prepare uma lista de emails para uma mala direta. O programa deverá armazenar
  as linhas abaixo num vetor, extrair de cada linha o email e armazenar num outro vetor. O programa
  deverá mostrar na tela a lista de email processada.

    Beltrano da Silva;beltrano@gmail.com
    Siclano Goncalves;siclano@yahoo.com.br
    Fulano Pereira Alves;fulanoalves@gmail.com
    Alvarenga Pedroso;pedroso@hotmail.com
*/

package com.ctseducare.java.j08_strings;

public class ListaEmails {

    public static void main(String[] args) {
        System.out.println("Lista de emails para mala direta");
        System.out.println();

        String dados[] = {
                "Beltrano da Silva;beltrano@gmail.com",
                "Siclano Goncalves;siclano@yahoo.com.br",
                "Fulano Pereira Alves;fulanoalves@gmail.com",
                "Alvarenga Pedroso;pedroso@hotmail.com"
        };

        String emails[] = new String[dados.length];

        int posicaoDoCorte;
        for (int i = 0; i < dados.length; i++) {
            posicaoDoCorte = dados[i].indexOf(";") + 1;
            emails[i] = dados[i].substring(posicaoDoCorte);
        }

        for (int i = 0; i < emails.length; i++) {
            System.out.println(emails[i]);
        }
    }

}
