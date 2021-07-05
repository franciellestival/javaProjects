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
public class SomaPares {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        int res = 0;     
        int aux = 0;  
        int contador = 1;
        System.out.println("\nDigite 20 numeros: ");


        while (contador <= 20) {

            String str = input.nextLine();

            try{
        
                int num = Integer.parseInt(str);
                contador++;
                
                if (num % 2 == 0 ) {

                    res = aux + num;
                    aux = res;

                }
            }

            catch(NumberFormatException e){

                    System.out.println("Digite um numero valido");

            } 

        }

    System.out.println("\nO resultado da soma dos pares eh: " + res);

    }
}
