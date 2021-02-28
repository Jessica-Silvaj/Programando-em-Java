
package sistcontrolderestaurante.Leitordedados;

import java.util.Scanner;


public class Leitor {
     private Scanner teclado;
    
    public  Leitor(){
        
        teclado = new Scanner(System.in);
    }
    
    public String lerString(String rotulo){
        
        System.out.print("\n");
        System.out.print(rotulo);
        return rotulo = teclado.nextLine();
         
    }
    
    public double lerDouble( String rotulo){
        return Double.parseDouble(lerString(rotulo));
    }
}
    

