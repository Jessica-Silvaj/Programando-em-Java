
package sistcontrolderestaurante.MenuComida;


public class SairdoPedido  extends ItemdoCardapio {

    @Override
    public String getDescricao() {
        return "SAIR DO PEDIDO";
    }

    @Override
    public boolean executar() {
         System.out.println("-----------------:------------------------------:--------------------\n");
         System.out.println("          -> *** SAIR DO PEDIDO FOI REALIZADO COM SUCESSO ***! ");
          System.out.println("-----------------:------------------------------:--------------------\n");
        return true;
    }
    
}
