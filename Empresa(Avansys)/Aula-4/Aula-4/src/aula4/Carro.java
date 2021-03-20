/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4;

/**
 *
 * @author Jéssica SIlva
 */
public class Carro {
    
      private static boolean vendido =  true;
      
      private double valor = 10000;

    public static boolean isVendido() {
        return vendido;
    }

    public double getValor() {
        return this.valor;
    }
      
    public boolean isTeste(){
        return vendido;
    
    }
    
   
}
  