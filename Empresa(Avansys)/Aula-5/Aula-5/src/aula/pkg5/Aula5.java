
package aula.pkg5;

/**
 *
 * @author Jéssica SIlva
 */
public class Aula5 {

    public static void main(String[] args) {
    
        // criar um vetor da classe produto (lista)
        Produto[] lista = new Produto[4];
        
        lista[0] = new Produto(1, "Computador");
        lista[1] = new Produto(2, "teclado");
        lista[2] = new Produto(3, "Mouse");
        lista[3] = new Produto(4, "Placa de rede");
        
        int i;
        
           /* for(i = 0; i < lista.length; i ++){
           System.out.println(lista[i]);
                
           }*/
            
           for(Produto p : lista){
               System.out.println(p.getId());
               System.out.println(p.getNome());
           }
        
    }
    
}
