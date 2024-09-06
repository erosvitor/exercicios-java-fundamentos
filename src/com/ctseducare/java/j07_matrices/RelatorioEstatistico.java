/*
  Os dados abaixo representam um levantamento realizado por uma prefeitura de uma determinada cidade.
  A primeira coluna é o salário e a segunda coluna representa a quantidade de filhos.

    1450.40, 1
    2630.00, 2
    970.00, 2
    1790.30, 1
    2150.10, 3
    1080.00, 2
    1920.60, 2
    2530.80, 3

  Com base nos dados acima a prefeitura deseja um relatório que contenha as seguintes informações:

    a) Média do salário da população
    b) Média do número de filhos
    c) Maior salário
*/

package com.ctseducare.java.j07_matrices;

public class RelatorioEstatistico {

  public static void main(String[] args) {
    System.out.println("Relatório Estatístico");
    System.out.println("");
    
    double dados[][] = { {1450.40, 1},
                         {2630.00, 2},
                         {970.00, 2},
                         {1790.30, 1},
                         {2150.10, 3},
                         {1080.00, 2},
                         {1920.60, 2},
                         {2530.80, 3}};
    
    var totalSalarios = 0.0;
    var totalNumeroFilhos = 0.0;
    var maiorSalario = 0.0;
    
    for (var i=0; i < dados.length; i++) {
      totalSalarios += dados[i][0];
      totalNumeroFilhos += dados[i][1];
      if (dados[i][0] > maiorSalario) {
        maiorSalario = dados[i][0];
      }
    }
    
    var salarioMedio = totalSalarios / dados.length;
    System.out.println("O salário médio é de: " + salarioMedio);
    
    var mediaQtdeFilhos = totalNumeroFilhos / dados.length;
    System.out.println("A quantidade média de filhos é: " + mediaQtdeFilhos);

    System.out.println("O maior salário é: " + maiorSalario);
  }

}
