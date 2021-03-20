
package exemplomap;


import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author Jéssica SIlva
 */
public class ExemploMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Definir o <k - chave, v - valor
        Map<Integer, String> map = new HashMap();
        
        //Colocar Valotes
        map.put(1, "Jéssica Silva");
        map.put(2, "Jenifer Silva");
        map.put(3, "Jamile Silva");
        map.put(4, "João Delfino");
        map.put(5, "Maria do Carmo");
 
        // interação com a chave map
        
        for (Integer key: map.keySet()){
        
            System.out.println(key);
        }
        
        System.out.println("----------------------------------------");
           // interação com valores map
           
           for(String key: map.values()) {
                System.out.println(key);
           }
    
             System.out.println("---------------------------------------- \n");
             
             System.out.println(map);
    }
    
}
