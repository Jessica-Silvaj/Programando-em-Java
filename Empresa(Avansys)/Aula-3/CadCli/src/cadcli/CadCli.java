/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadcli;

import cliente.Cliente;
import java.util.Scanner;

/**
 *
 * @author Jéssica SIlva
 */
public class CadCli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Pegar o resultado do Cliente
    Scanner teclado = new Scanner (System.in);
        
        //Instanciando a classe Cliente
        Cliente cliente = new Cliente();
        
        System.out.println("* Informe o seu nome: ");
        cliente.setNomecliente(teclado.nextLine());
        System.out.print("\n");
      
     System.out.println(" * Informe o a sua idade: ");
         cliente.setIdade(teclado.nextInt());
         System.out.print("\n");
         
        System.out.println("* Informe o seu cpf: ");
         cliente.setCpf(teclado.nextLine());
         System.out.print("\n");
         
         System.out.println("------------//---------------------// ---------//");
         
         System.out.println("Impressão do dado cliente");
        System.out.println("Nome do cliente: " + cliente.getNomecliente());
        System.out.println("Idade do cliente: "+cliente.getIdade());
        System.out.println("Cpf do cliente: " +cliente.getCpf());


       
        
      
     
        
    }
    
}
