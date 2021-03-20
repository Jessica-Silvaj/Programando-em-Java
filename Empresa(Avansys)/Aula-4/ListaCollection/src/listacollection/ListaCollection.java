/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listacollection;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

/**
 *
 * @author Jéssica SIlva
 */
public class ListaCollection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Criando uma lista  
 List fruit;
 int i;
 
 fruit =  new ArrayList();
 fruit = new LinkedList();
 
 // Adicionando elementos na lista  
 fruit.add ( "Manga" );  
 fruit.add ( "Apple" );  
 fruit.add ( "Banana" );  
 fruit.add ( "Uvas" );  
 
 // Iterando o elemento List usando loop for-each  
  System.out.println (fruit + "\n");
  
  for(i = 0; i < fruit.size(); i++){
      System.out.println(fruit.get(i));
  }
    }
    
}
