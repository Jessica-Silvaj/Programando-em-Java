/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversao;

/**
 *
 * @author Jéssica SIlva
 */
public class Conversao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String n, f;
         int n1;
         float f1;
          n = "10";
          f = "10f";
          
          n1 = Integer.parseInt(n);
          f1 = Float.parseFloat(f);
          System.out.println(n1);
          System.out.println(f1);
    }
    
    
}
