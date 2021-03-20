/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familia;

/**
 *
 * @author Jéssica SIlva
 */
public class Pessoas {
    
    private static  String  [] pessoa  = {"Jéssica", "Jenifer", "Jamile", "Francisco","Alex"};


    public  static void getPessoa() {
         int i;
       
         for(i = 0; i < pessoa.length; i ++){
         
             System.out.println(pessoa[i]);
             
         }
      
        }
        
    }
    
    

