/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

/**
 *
 * @author Jéssica SIlva
 */
public class Cliente {
    
    private int Id;
    private String nome;
    private String cpf;
   
 
    
     
    public  Cliente( int Id){     
      this.Id = Id;
      
    };

    public int getId() {
        return Id;
    }
    

    public String getNome() {
        
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
}
