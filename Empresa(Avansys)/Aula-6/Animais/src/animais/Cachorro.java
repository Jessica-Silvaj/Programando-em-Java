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
public class Cachorro  extends Animal {
    
    @Override
    public void emitirSom (){
    
//        System.out.println("Som do cachorro");
//        System.out.println("Au Au Au");


//Para garantir o mesmo som qu o superclasse

              super.emitirSom();
    }
    
}
