/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoas;

/**
 *
 * @author Jéssica SIlva
 */
public class Pessoas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Pessoa p = new Pessoa();
       Homen h = new Homen();
       Mulher m =new Mulher();
      //Metodo 1
       System.out.println("Primeiro jeito");
       p.dadosPessoais();
       h.dadosPessoais();
       m.dadosPessoais();
       
       System.out.println("-------------------------------------");

       //Metodo 2
       Teste t = new Teste();
        System.out.println("Segundo jeito");
       t.dadosPessoais(p);
       t.dadosPessoais(h);
       t.dadosPessoais(m);
    }
    
}
