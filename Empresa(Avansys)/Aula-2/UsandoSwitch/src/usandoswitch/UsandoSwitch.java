/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usandoswitch;

/**
 *
 * @author Jéssica SIlva
 */
public class UsandoSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        n = 10;
        
        // usando switch
         switch (n){
             case 1 :
                 
                 System.out.println("Você selecionou o numero 1");
       
                break;
                
             case 2: 
                 
                 System.out.println("Você selecionou o numero 2 ");
                 
                 break;
                 
             default:
                 
                 System.out.println("Numero inválido");
         }
         
         // Estrutura de reptição
        int i;
        i =1;
        
        while(i <=10){
            
            System.out.println("Curso de Java");
            
            i++;
            
        }
        

    }
    
}
