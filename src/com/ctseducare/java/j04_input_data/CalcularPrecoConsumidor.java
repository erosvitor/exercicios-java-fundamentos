/*
  O preço consumidor de um carro novo é a soma do custo de fábrica com a porcentagem do distribuidor
  e dos impostos (aplicados ao custo de fábrica). Supondo que a porcentagem do distribuidor seja de
  28% e os impostos sobre o custo de fábrica seja de 45%, crie um programa que leia o custo de
  fábrica de um determinado carro e depois mostre na tela o preço consumidor.
*/

package com.ctseducare.java.j04_input_data;

import java.util.Scanner;

public class CalcularPrecoConsumidor {

    public static void main(String[] args) {
        System.out.println("Calcular preço consumidor");
        System.out.println("");

        var leitura = new Scanner(System.in);

        var porcentagemDistribuidor = 28f / 100;
        var impostos = 45f / 100;

        System.out.print("Informe o custo de fábrica: ");
        var custoFabrica = leitura.nextFloat();

        var precoConsumidor = custoFabrica + (custoFabrica * porcentagemDistribuidor);
        precoConsumidor = precoConsumidor + (precoConsumidor * impostos);
        System.out.println("O preço consumidor é de " + precoConsumidor);

        leitura.close();
    }

}
