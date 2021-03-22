/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe2.condição;

import java.util.Scanner;

/**
 *
 * @author Jéssica SIlva
 */
public class Exe2Condição {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Faça um algoritmo para ler dois números inteiros e informar se estes são iguais ou diferentes.
*/
        int x, y;
        
       Scanner teclado = new Scanner(System.in);
       
        System.out.println("Informe o primeiro numero: ");
        x = teclado.nextInt();
        
        System.out.println("Informe o segundo numero: ");
        y = teclado.nextInt();
        
        // condição
        if( x == y){
            
            System.out.println("Esses numeros são iguais!");
            
        } else {
            
            System.out.println("Esses numeros são diferentes!");
        }
    }
    
}
