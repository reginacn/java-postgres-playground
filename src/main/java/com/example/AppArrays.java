package com.example;

import java.util.Arrays;

public class AppArrays {
    
    public static void main(String[] args) {
        double vetorDouble[] = {10, 20, 30};
        System.out.println("listando todo vetor: " + Arrays.toString(vetorDouble));
        double vetorDouble2[] = vetorDouble;
        System.out.println("listando todo vetor 2: " + Arrays.toString(vetorDouble2));

        System.out.println("valor da posição 0: " + vetorDouble[0]);
        System.out.println("valor da posição 1: " + vetorDouble[1]);
        System.out.println("valor da posição 2: " + vetorDouble[2]);

        vetorDouble[0] = 1;
        System.out.println("novo valor da posição 0: " + vetorDouble[0]);        

        int vetor[] = new int[4];
        vetor[0] = 0;
        vetor[1] = 1;
        System.out.println("resultado: " + Arrays.toString(vetor));

        for (int j = 0; j < vetor.length; j++) {
         System.out.println(vetor[j]);   
        }

        int ii = 10;
        double d = ii;
        System.out.println(d);

        double matriz [][] = { { 10, 20, 30}, {40, 50, 60} };
        System.out.println(Arrays.toString(matriz[0]));
        System.out.println(Arrays.toString(matriz[1]));
        matriz[0][1] = -20;
        System.out.println(Arrays.toString(matriz[0]));
        matriz[1] = new double[]{1,2};
        System.out.println(Arrays.toString(matriz[1]));

        System.out.println("testando matriz");
        double matrizVazia[][] = new double[2][3]; //2 linhas e 3 colunas
        for (int j = 0; j < matrizVazia.length; j++) { //matriz.lenght pega o total de linhas
            for (int j2 = 0; j2 < matrizVazia[j].length; j2++) { //percorre a matriz na linha j
                matrizVazia[j][j2] = j * matriz[j].length + j2;        
            }
        }

        for (int i = 0; i < matrizVazia.length; i++) {
            for (int j = 0; j < matrizVazia[i].length; j++) {
                System.out.printf("%5.1f ", matrizVazia[i][j]);
            }
            System.out.println();
        }
        

    }


}
