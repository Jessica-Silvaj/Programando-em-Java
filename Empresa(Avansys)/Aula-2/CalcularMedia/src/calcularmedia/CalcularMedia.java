/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularmedia;

/**
 *
 * @author Jéssica SIlva
 */
public class CalcularMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    /* Criar um projeto no netbeans  com um programa em java que possua
 a nota1, nota2, nota3. Calcule a média  das 3 notas e  exiba na tela
 se ele foi aprovado ou reprovado com base na media 7.   */
        
        float nota1 , nota2, nota3 , media;
        nota1 = 7.0f;
        nota2 = 8.5f;
        nota3 = 6.5f;   
        
        media = (nota1 + nota2 + nota3) / 3;
        
        if (media >= 7.0){
            
            System.out.println("Parabéns,você foi Aprovado!");
            
        }else {
       
            System.out.println(" Que pena, infelizmente você foi reprovado!");
            
        }
        
        System.out.println(media >=7 ? "Aprovado" : "Reprovado");
        
    }
    
    
}
