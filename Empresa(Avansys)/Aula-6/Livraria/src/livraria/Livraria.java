package livraria;

/**
 *
 * @author Jéssica SIlva
 */
public class Livraria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // superClasse
        Produto p = new Produto ();
        
        //subClasse
        Livro l = new Livro ();
        
        p = l;
        
       
    }
    
}
