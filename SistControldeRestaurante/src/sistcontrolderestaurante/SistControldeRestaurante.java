package sistcontrolderestaurante;

import java.util.Scanner;
import sistcontrolderestaurante.Menu.CadastrarCliente;
import sistcontrolderestaurante.Menu.CadastrarPedido;
import sistcontrolderestaurante.Menu.ItemDeMenu;
import sistcontrolderestaurante.Menu.SairdoRestaurante;

public class SistControldeRestaurante {

   
    public static void main(String[] args) {

        // Instânciando a entrada de teclado
     Scanner teclado = new Scanner(System.in);
        
      // Nome Do Restaurante ->  Tela Principal
      
        System.out.println("\t\t SEJAM BEM VINDOS AO GRANDE ABACATE!"
                + "\n\n CONHECA OS PRATOS MAIS INUSITADOS E SABOROSOS FEITOS COM A FRUTA "
                + "MAIS VERSÁTIO DO MUNDO!"
                + "\n\n -> *** MENU PRINCIPAL *** <-\n");
        
        
       // Item que fazerá parte do Menu
       
       ItemDeMenu [] principal = new ItemDeMenu[]{
           
           new CadastrarCliente(), //OK
           new CadastrarPedido(), // OK
           new SairdoRestaurante(), //OK
              
       };
       /* Verificar ser  a opção Sair do restaurante foi Solicitada, 
          senão ela é falsa.... Repeter o Menu */
       
         boolean SairdoRestaurante = false;
         
        do{
           
        for (int i = 0; i < principal.length; i++){
            System.out.println(i + " <-> * " + principal[i].getDescricao()); // Muda o "-" depois
            
        }
         System.out.print("\n");
        System.out.print("* QUAL É A OPÇAO DESEJADA: ");
        int opcao = Integer.parseInt(teclado.nextLine());
            
        SairdoRestaurante = principal[opcao].executar();
         
        
      }while(!SairdoRestaurante);
    }
    
}
