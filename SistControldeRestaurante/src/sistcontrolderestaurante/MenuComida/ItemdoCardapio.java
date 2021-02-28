
package sistcontrolderestaurante.MenuComida;

import sistcontrolderestaurante.Leitordedados.Leitor;
import sistcontrolderestaurante.dao.Dao;
import sistcontrolderestaurante.dao.DaoArrayList;


public abstract class ItemdoCardapio {
    
    protected Leitor leitor;
     protected Dao dao;
   
     public ItemdoCardapio(){
    

     leitor = new Leitor();
     dao = new DaoArrayList();
     
  }  
    public abstract String getDescricao();
    public abstract boolean executar();
}
