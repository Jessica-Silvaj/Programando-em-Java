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
public class Aula4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out.println(Teste.Valor);

/* não precisou da instancia, pois e o metodo static*/
        System.out.println(Carro.isVendido());
        
        // precisou da instancia
        Carro c = new Carro();
        
        System.out.println(c.getValor());
        System.out.println(c.isTeste());
    }
    
}
