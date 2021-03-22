
package exe1.condição;

import java.util.Scanner;

/**
 *
 * @author Jéssica SIlva
 */
public class Exe1Condição {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        /*Faça um algoritmo para ler um número inteiro e informar se este é maior que 10.*/
       int numero;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe um numero: ");
      numero =  teclado.nextInt();
        
        //Verificar se o numero é maior que 10
        if (numero > 10){
        
            System.out.println("Esse numero é maior que 10!");
        }else{
            System.out.println("Esse numero é menor que 10!");        
        }
    }
    
}
