
package sistcontrolderestaurante.Menu;
import sistcontrolderestaurante.dao.Dao;
import sistcontrolderestaurante.Leitordedados.Leitor;
import sistcontrolderestaurante.dao.DaoArrayList;



public abstract class ItemDeMenu {
    
	// Leitor � uma forma de diminuir a quantidade de Scanner no projeto
     protected Leitor leitor;
     protected Dao dao;
   
      
       public  ItemDeMenu(){
           
        leitor = new Leitor();
        dao = new DaoArrayList();
}
    public abstract String getDescricao();
    public abstract boolean executar();
    
}
