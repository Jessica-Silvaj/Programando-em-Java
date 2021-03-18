/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veiculo;

/**
 *
 * @author Jéssica SIlva
 */
public class Veiculo {
    
    private int Id;
    private String cor;
    private int AnoFabricacao;
    
    public Veiculo (int Id){
    
    this.Id = Id;
        
    }

    public int getId() {
        return Id;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAnoFabricacao() {
        return AnoFabricacao;
    }

    public void setAnoFabricacao(int AnoFabricacao) {
        this.AnoFabricacao = AnoFabricacao;
    }
    
    
}
