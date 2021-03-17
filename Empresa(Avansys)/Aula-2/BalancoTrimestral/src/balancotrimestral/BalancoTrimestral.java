/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balancotrimestral;

/**
 *
 * @author Jéssica SIlva
 */
public class BalancoTrimestral {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declaração  variavél referente aos meses 
         float janeiro = 15.000f;
         float fevereiro = 23.000f;
         float marco = 17.000f;
         
         float gastosTrimestral = ( janeiro + fevereiro + marco);
         
         //Imprimir gastosTrimestral
         System.out.printf("O gasto trimestral foi de R$: %.3f",gastosTrimestral);
         System.out.print("\n");
         
         if( gastosTrimestral >= 50.000){
             
                System.out.println("Vish, estouramos o orçamento!");
                
         }else {
             
             System.out.println("Ufa, estamos dentro do orçamento!");
             
         }
             
         
    }
    
}
