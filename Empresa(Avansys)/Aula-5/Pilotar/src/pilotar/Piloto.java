/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilotar;

/**
 *
 * @author ralme
 */
public class Piloto {
    String nome;
    
    public Piloto(String nome){
        this.nome = nome;
    }
    
    public void pilotar(Aviao aviao){
        aviao.setVoando(true);
    }
}
