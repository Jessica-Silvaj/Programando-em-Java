/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tratamentoexception;

import java.util.Scanner;

/**
 *
 * @author Jéssica SIlva
 */
public class TratamentoException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* O tratamento de execeções, ocorre através do bloco
        * try, ela interrompe a excução do código dentro dele e passa
        * para o catch se este suportar, ou seja tratamento de erro
        */ 
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite um numerador:  ");
        String xs = teclado.nextLine();
        
        System.out.println("Digite um denominador: ");
        String ys = teclado.nextLine();
        
        teclado.close();
        
        int x = Integer.parseInt(xs);
        int y =Integer.parseInt(ys);
        
//        int divisao =  x / y;
        
//        System.out.println("Resultado da divisão: " + divisao);
        
        /*Para corrigir o erro, teremos que utilizar o try catch e expecifica que tipo de dados que quero pega */
        
        try {
        int divisao =  x / y;
        System.out.println("Resultado da divisão: " + divisao);
        } catch (ArithmeticException erro) {
            
            System.err.println(" Erro " + erro.getMessage());
        
        }
        
    }
    
}
