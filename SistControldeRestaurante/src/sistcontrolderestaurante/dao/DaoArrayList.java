
package sistcontrolderestaurante.dao;

import java.util.ArrayList;
import sistcontrolderestaurante.ModelosC.Cliente;



public class DaoArrayList implements Dao {

    private static ArrayList<Cliente> bd = new ArrayList <Cliente>();
  
    
    @Override
    public void cadastrar(Cliente cliente) {
      bd.add(cliente);
    }

    @Override
    public ArrayList<Cliente> listar() {
       return bd;
             
}

    @Override
    public Cliente pesquisar(String Cpf) {
        
        Cliente resultado = null;
        
        for(int i = 0; i < bd.size(); i++){
            Cliente atual = bd.get(i);
            
            if(atual.getCpf().equals(Cpf)){
                resultado  = atual;
                break;
            }
        }
        
        return resultado;
    }

    

}
