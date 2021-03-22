/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quintaaula;

/**
 *
 * @author ralme
 */
public class Carro {
    private Motor motor;
    private int velocidade;
    private String modelo;
    public Carro(String modelo, float cilindrada){
        Motor m = new Motor();
        this.motor = m;
        m.setCilindrada(cilindrada);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidade() {
        return velocidade;
    }
    
    
    public void acelera(){
        this.velocidade ++;
    }
}
