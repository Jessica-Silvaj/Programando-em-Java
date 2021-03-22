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
public class Familia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pessoa eu = new Pessoa("Jessica");
        Pessoa  pai = new Pessoa("Francisco");
        Pessoa  mae = new Pessoa("Jamile");
        
        eu.setPai(pai);
        eu.setMae(mae);
        eu.imprimiNomes();
        
    }
    
}
