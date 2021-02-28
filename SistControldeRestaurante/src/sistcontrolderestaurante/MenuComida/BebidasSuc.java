
package sistcontrolderestaurante.MenuComida;


public class BebidasSuc  extends ItemdoCardapio {

    @Override
    public String getDescricao() {
         return "BEBIDAS SUCOS";
    }

    @Override
    public boolean executar() {
         System.out.println("-----------------:------------------------------:--------------------\n");
        System.out.println(" BEBIDAS SUCOS EM CONSTRUÇÃO, POR  FAVOR AGUARDE ");
          System.out.println("-----------------:------------------------------:--------------------\n");
         return false;
    }
    
}
