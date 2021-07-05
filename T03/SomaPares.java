
/** 
TAREFA 03
Faça uma classe executável que dado um conjunto de 20 elementos numéricos,
informe a soma de todos os números pares. Faça a validação de dados inválidos informando
o usuário, e fazendo-o repetir a digitação.
**/

import java.util.Scanner;

public class SomaPares{

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        int res = 0;     
        int aux = 0;  
        int contador = 1;
        System.out.println("\nDigite 20 numeros: ");


        while (contador <= 5) {

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


            