/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3;

import cliente.Cliente;

/**
 *
 * @author Jéssica SIlva
 */
public class Aula3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Crianção de um objeto
        Produto p =  new Produto();
     // Pega valor na classe /produto
        p.setNome("Computador");
        
       // imprimir o valor
        System.out.println(p.getNome());
        //-------------------------------------------------------------------------------------
        
        //Objeto cliente
        Cliente clientec = new Cliente (1);
        
        // valores da classe cliente, dentro da classe cliente
        clientec .setNome("Jéssica Silva");
        clientec.setCpf(1234567891011l);
        clientec.setIdade(21);
        
        
        //Imprimir esse valores
        System.out.println("O seu nome é: "+clientec.getNome());
        System.out.println(" O seu cpf: " +clientec.getCpf());
        System.out.println("Sua idade é: " +clientec.getIdade());
        System.out.println("ID : " + clientec.getId());
        System.out.println("Ano de nascimento: " +clientec.getAnoNascimento());

        
        
        //---------------------------------------------------------------------
         Cliente clientec2 = new Cliente (2 , "Jenifer");
        
        // valores da classe cliente, dentro da classe cliente
        clientec2 .setNome("Jenifer Silva");
        clientec2.setCpf(45789745415l);
        clientec2.setIdade(13);
        
        //Imprimir esse valores
        System.out.println("O seu nome é: "+clientec2.getNome());
        System.out.println(" O seu cpf: " +clientec2.getCpf());
        System.out.println("Sua idade é: " +clientec2.getIdade());
        System.out.println("Ano de nascimento: " +clientec2.getAnoNascimento());
   
        //---------------------------------------------------------------------------------
        //Sobrecarga de métodos
        
        
        
        
    }
    
}
