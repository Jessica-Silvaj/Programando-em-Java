
package sistcontrolderestaurante.Menu;

import java.util.ArrayList;
import sistcontrolderestaurante.ModelosC.Cliente;
import sistcontrolderestaurante.dao.Dao;
import sistcontrolderestaurante.dao.DaoArrayList;


public class ListaCliente extends ItemDeMenu{

    @Override
    public String getDescricao() {
       return "LISTA CLIENTE/PEDIDOS";
    }

    @Override
    public boolean executar() {
        
       Dao dao = new DaoArrayList();
       ArrayList<Cliente> cliente = dao.listar();
   
       for(int i = 0; i < cliente.size(); i++){
           
           Cliente atual = cliente.get(i);
           System.out.println("-----------------:------------------------------:--------------------\n");
           System.out.println("                      *** LISTA CLIENTE/PEDIDOS *** ");
           System.out.println(" -> NOME DO CLIENTE:  " + atual.getNome());
           System.out.println(" -> NÚMERO DO CPF:  " + atual.getCpf());
           System.out.println(" -> QUANTIDADE DE PESSOAS: " + atual.getQantidadedeP());
           System.out.println(" -> NÚMERO DA MESA RESERVADA: " + atual.getNumeroDaMesaReservada());
           System.out.println("-----------------:------------------------------:--------------------\n");
           System.out.println("     *** -> O CLIENTE FOI LISTADO COM SUCESSO!! <- *** \n");
           System.out.println("-----------------:------------------------------:--------------------\n");
           
          
       }
      
     return false;
}

}
