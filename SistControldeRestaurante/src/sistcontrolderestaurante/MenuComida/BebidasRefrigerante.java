/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistcontrolderestaurante.MenuComida;

/**
 *
 * @author JESSICA
 */
public class BebidasRefrigerante extends  ItemdoCardapio {

    @Override
    public String getDescricao() {
        return "BEBIDAS REFRIGERANTES";
    }

    @Override
    public boolean executar() {
         System.out.println("-----------------:------------------------------:--------------------\n");
        System.out.println("REFRIGETANTE EM CONSTRUÇÃO, POR  FAVOR AGUARDE ");
          System.out.println("-----------------:------------------------------:--------------------\n");
          
        return false;
    }
    
    
}
