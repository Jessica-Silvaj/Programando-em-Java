
package sistcontrolderestaurante.MenuComida;


public class BebidasAlc  extends ItemdoCardapio {

    @Override
    public String getDescricao() {
         return "BEBIDAS ALCÓOLICAS";
    }

    @Override
    public boolean executar() {
         System.out.println("-----------------:------------------------------:--------------------\n");
        System.out.println(" BEBIDAS ALCÓOLICAS EM CONSTRUÇÃO, POR  FAVOR AGUARDE ");
          System.out.println("-----------------:------------------------------:--------------------\n");
         return false;
    }
    
}
