/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.pkg5;

/**
 *
 * @author Jéssica SIlva
 */
public class Produto {
      private int Id;
      private String nome;
      
      public Produto (int Id, String nome){
          
          this.Id = Id;
          this. nome = nome;
      }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
      
}
