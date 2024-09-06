/*
  Escreva um programa que armazene temperaturas num vetor e depois mostre na tela a menor e a maior
  temperatura. As temperaturas que devem ser armazenadas no vetor estão relacionadas abaixo.

  27,8  26,9  24,7  26,9  25,8  27,6  23,0  21,2  29,1  25.4
*/

package com.ctseducare.java.j07_arrays;

public class TemperaturaMinMax {

    public static void main(String[] args) {
        System.out.println("Temperatura mínima e máxima");
        System.out.println("");

        float temperaturas[] = { 27.8f, 26.9f, 24.7f, 26.9f, 25.8f, 27.6f, 23.0f, 21.2f, 29.1f, 25.4f };

        var tempMinima = 999.9f;
        var tempMaxima = 0.0f;

        for (var i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] < tempMinima) {
                tempMinima = temperaturas[i];
            }
            if (temperaturas[i] > tempMaxima) {
                tempMaxima = temperaturas[i];
            }
        }

        System.out.println("Temperatura mínima: " + tempMinima);
        System.out.println("Temperatura máxima: " + tempMaxima);
    }

}
