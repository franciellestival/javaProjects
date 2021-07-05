/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios03;

import java.util.Scanner;
import java.util.*;

/**
 *
 * @author ADMIN
 */
public class Palindromo {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String checaPalindromo = "";
        
        System.out.println("Digite uma frase:");
        
        String sequencia;
        sequencia = input.nextLine();
        sequencia = sequencia.replace(" ", "").toLowerCase();
        
        for(int i = sequencia.length() - 1; i >= 0; i--) {
            
            checaPalindromo += sequencia.charAt(i);
            
        }
    
        if (checaPalindromo.equals(sequencia)){
            System.out.println("É um palíndromo.");
        } else {
            System.out.println("Não é um palíndromo");
        }
             
    }
    
}
