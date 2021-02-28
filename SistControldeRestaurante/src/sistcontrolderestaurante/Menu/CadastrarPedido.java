
package sistcontrolderestaurante.Menu;

import java.util.Scanner;
import sistcontrolderestaurante.MenuComida.Bebidas;
import sistcontrolderestaurante.MenuComida.Entradas;
import sistcontrolderestaurante.MenuComida.ItemdoCardapio;
import sistcontrolderestaurante.MenuComida.Petiscos;
import sistcontrolderestaurante.MenuComida.Refeicoes;
import sistcontrolderestaurante.MenuComida.SairdoPedido;
import sistcontrolderestaurante.MenuComida.Sobremesas;
import sistcontrolderestaurante.ModelosC.Cliente;
import sistcontrolderestaurante.dao.Dao;

public class CadastrarPedido extends ItemDeMenu {
Scanner teclado = new Scanner(System.in);
    @Override
    public String getDescricao() {
        return"CADASTRAR PEDIDO";
    }

    @Override
    public boolean executar() {
        System.out.println("-----------------:------------------------------:--------------------\n");
        System.out.println("                *** CADASTRO DE UM NOVO PEDIDO ***");
        System.out.println("\n              *** FAÇA O SEU PEDIDO POR AQUI ***\n");
        
        String Cpf = leitor.lerString("-> *NUMERO DO CPF: ");
        System.out.print("\n");
       Cliente cliente = dao.pesquisar(Cpf);
       
       if(cliente == null){
            System.out.println("-----------------:------------------------------:--------------------\n");
           System.out.println("-> ** O CLIENTE NÃO FOI ENCONTRADO, TENTE NOVAMENTE !! **");
           System.out.print("\n");
            System.out.println("-----------------:------------------------------:--------------------\n");
       }else{
       
           System.out.print("\n");
        ItemdoCardapio[] pedido = new ItemdoCardapio[]{
           
           new Entradas(),
           new Refeicoes(),
           new Sobremesas(),
           new Petiscos(),
           new Bebidas(),
           new SairdoPedido()
           
       };
         boolean SairdoPedido = false;
         
        do{
           
        for (int i = 0; i < pedido.length; i++){
            System.out.println(i + " -> * " + pedido[i].getDescricao()); 
            
        }
         System.out.print("\n");
        System.out.print("ÓLA "+ cliente.getNome()+", "+"QUAL É A OPÇAO DO SEU PEDIDO: ");
        int opcao = Integer.parseInt(teclado.nextLine());
       
        
        SairdoPedido = pedido[opcao].executar();
        
      }while(!SairdoPedido);
        
       }
        return false;
        
    }
    
}
