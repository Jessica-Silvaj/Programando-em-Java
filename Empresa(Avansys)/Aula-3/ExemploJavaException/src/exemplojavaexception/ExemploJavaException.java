/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplojavaexception;

import java.util.Scanner;

/**
 *
 * @author Jéssica Sllva
 */
public class ExemploJavaException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Exemplo de tratamento de exeção
        
        //Caso o Denominador for zero, ocorrerá um erro
        
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
            
            System.err.println(" Ocorreu um Erro, pois usou o denominado zero ou ocorreu uma exceção " + erro.getMessage());
        
        }
        
    }
    
}
