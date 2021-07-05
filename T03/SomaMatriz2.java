/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios03;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class SomaMatriz {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o tamanho da Matriz");
        int tamanho = input.nextInt();
        int[][] mat = new int[tamanho][tamanho];
        leMatriz(mat);
        int res = somaDiagonal(mat);
        System.out.printf("O resultado da Soma é: %d\n", 
                        res);
        
        
    }
    
    public static void leMatriz(int mat[][]) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < mat.length; i++) {
            for (int c = 0; c < mat[i].length; c++) {

                System.out.printf("Informe %do valor da %da linha : ", 
                        c + 1, i + 1);
                mat[i][c] = input.nextInt();
            }
        }
    }
    
    public static int somaDiagonal(int mat[][]) {
        int soma = 0;
        int c = 0;
        for (int i = 0; i < mat.length; i++) {
            soma += mat[i][c];
            c++;
        }
        return soma;
    }
}