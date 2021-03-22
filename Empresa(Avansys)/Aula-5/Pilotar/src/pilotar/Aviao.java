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
public class Aviao {
    private String numero;
    private Poltrona poltrona;
    private boolean voando;
    
    public Aviao(String numero){
        this.numero = numero;
        this.poltrona = new Poltrona(1, "1A");
    }
    
    public boolean isVoando(){
        return this.voando;
    }

    public void setVoando(boolean voando) {
        this.voando = voando;
    }
    
    
}
