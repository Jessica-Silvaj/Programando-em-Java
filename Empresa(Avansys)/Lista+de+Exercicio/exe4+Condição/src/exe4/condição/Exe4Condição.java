
package exe4.condição;

import java.util.Scanner;

/**
 *
 * @author Jéssica SIlva
 */
public class Exe4Condição {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Faça um algoritmo para ler dois números inteiros A e B e informar se A é divisível por B. */
        
        int a, b, resto;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite 1 numero");
        a =  teclado.nextInt();
        
        System.out.println("Digite 2 numero");
        b = teclado.nextInt();
        
        resto = a % 2;
        
        if( resto == 0){
            
            System.out.println("Numero 1 é divisivel por 2");
        }
        else {
            System.out.println("Numero 1 não é divisivel por 2 !");
        }
        
    }
    
}
