
package sistcontrolderestaurante.dao;

import java.util.ArrayList;
import sistcontrolderestaurante.ModelosC.Cliente;


public interface Dao {
    
     void cadastrar(Cliente cliente);
    
      ArrayList<Cliente> listar();

      Cliente pesquisar(String Cpf);
  

   
}
