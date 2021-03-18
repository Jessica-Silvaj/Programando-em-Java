/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automoveis;

import cliente.Cliente;
import veiculo.Veiculo;

/**
 *
 * @author Jéssica SIlva
 */
public class Automoveis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cliente cliente = new Cliente(1);
        // pegar dados
       cliente.setNome("Jéssica Silva");
       cliente.setCpf("1234567891011");
       
        System.out.println("Id cliente : " +cliente.getId());
        System.out.println("Nome: " +cliente.getNome());
        System.out.println("Cpf: " +cliente.getCpf());
        
        System.out.print("\n");
       
        System.out.println("Dado do veiculo  \n");
        Veiculo v = new Veiculo( 1); 
        v.setCor("Preto");
        v.setAnoFabricacao(2021);
        
        System.out.println("Id do veiculo: " + v.getId());
        System.out.println("A cor do veiculo : " + v.getCor());
        System.out.println("Ano de fabricação: " + v.getAnoFabricacao());
        
    }
    
}
