/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe3.condição;

import java.util.Scanner;

/**
 *
 * @author Jéssica SIlva
 */
public class Exe3Condição {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        /*Faça um algoritmo para ler um número inteiro e informar se o número é par ou ímpar.*/
        
        int x;
        
        System.out.println("Digite um numero: ");
        Scanner teclado =  new Scanner(System.in);
        x = teclado.nextInt();
         
        if( x % 2 ==0){
            System.out.println("Esse numero é par!");
        }else {
            System.out.println("Esse numero é impar!");
        }
        
      
    }
    
}
