/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animais;

/**
 *
 * @author Jéssica SIlva
 */
public class Animais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Polimorfismo herança
        //Superclasse
       Animal a = new Animal();
       
       //Subclasses
       Gato g =  new Gato();
       Cachorro c = new Cachorro();
       
       a.emitirSom();
       g.emitirSom();
       c.emitirSom();
    }
    
}
