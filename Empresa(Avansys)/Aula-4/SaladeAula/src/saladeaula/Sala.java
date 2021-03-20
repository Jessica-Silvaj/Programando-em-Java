/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saladeaula;

/**
 *
 * @author Jéssica SIlva
 */
public class Sala {
    
    private double tamanho;
    private int andar;
    private static int capacidade = 100;
    private static boolean fechadaouAberta = true;

    public static int getCapacidade() {
        return capacidade;
    }

    public static boolean isFechadaouAberta() {
        return fechadaouAberta;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }
   
    
    
    
}
