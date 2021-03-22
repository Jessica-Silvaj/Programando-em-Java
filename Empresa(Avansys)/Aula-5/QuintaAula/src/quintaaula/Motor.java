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
public class Motor {
    private float cilindrada;

    public void setCilindrada(float cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    public float getVelocidade(){
        if(cilindrada <= 1.0){
            return 140;
        }else{
            if(cilindrada > 1.0 && cilindrada <=1.6){
                return 180;
            }else{
                if(cilindrada > 1.6 && cilindrada <=2.0){
                    return 220;
                }else{
                    return 260;
                }
            }
        }
    }
}
