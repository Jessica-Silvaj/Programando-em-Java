/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaodeidade;

/**
 *
 * @author Jéssica SIlva
 */
public class ComparacaoDeIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int  idade;
        idade = 10;
        
        if (idade < 14) {
            
            System.out.println("Você é Criança!");
            
        } else if ( idade > 14 && idade < 18){
            
            System.out.println("você é adolescente!");
            
        } else if ( idade >= 18 && idade < 60){
            
            System.out.println(" você é adulta!");
            
        } else{
            
            System.out.println("você é idoso!");
        }
        
    }
    
}
