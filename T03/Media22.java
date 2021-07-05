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
public class Media2 {
    public static void main(String args[]){

        String str;
        Scanner sc = new Scanner(System.in);
        double n;
        boolean flag = false;
        Double media = 0.00;
        Double res = 0.00;
        int contador = 0;

        System.out.println("Digite 's' para sair ou um numero para calcular a media" );

        while(!flag){
        
            str=sc.nextLine();
            
            try{

                n = Double.parseDouble(str);
                contador++;
                media += n;
                res = media/contador;

                System.out.printf("\n%s%.2f\n", "Soma =  ", media);
                System.out.printf("%s%.2f\n", "Media =  ", res);
                
                System.out.println("\nDigite a Nota ou 's' para sair:" );

                flag=false;
            }

            catch(NumberFormatException e){

                char end = str.charAt(0);

                if(end == 's'){

                    System.out.println("Voce encerrou o programa. A media total eh " + res);
                    break;

                } else {

                    System.out.println("Digite um numero valido");

                }
            }
        }
    }
}
