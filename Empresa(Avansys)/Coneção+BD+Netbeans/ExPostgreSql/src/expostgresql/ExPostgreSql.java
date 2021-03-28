
package expostgresql;

/**
 *
 * @author Jéssica SIlva
 */

import java.sql.ResultSet;

public class ExPostgreSql {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Instância  a Classe
        ConexaoBD con = new ConexaoBD();
        
        // fazer uma inserçao no bd
        
        //inserindo o Insert, inserindo dados
        
    String sql = "insert into clientes (id_clientes, nome_clientes , email , data_Nascimento)"
                + "values (1, 'Fernanda Sousa', 'nandaSofc@gmail.com', '11/01/1995'),"
                + " (default, 'Pedro Silva', 'pedrinhojogadorc@gmail.com', '30/08/1980')";          
        
        int res = con.executarBD(sql);
        
        //Condição
        
        if( res > 0){
            
            System.out.println("Cliente Cadastrado com Sucesso !!!");
        }else {
            System.out.println("Ocorreu um erro durante o cadastro, por favor tente novamente !!!");
        }
        
        /*Atualizando a lista*/
        
         String busca = "Select * from clientes";
         ResultSet rs = con.executarBuscar(busca);
        
         
          try {
              
           while(rs.next()){
               
            int id = rs.getInt("id_clientes");
            String nomes = rs.getString(" nome_clientes");
            String email = rs.getString("email");
            String dataNascimento = rs.getString("data_Nascimento");
            
               System.out.println(id +"  -  "+ nomes +"  -  "+ email + "  -  " +dataNascimento);
           }
           
        }catch (Exception e){
        
            e.printStackTrace();
          
        }
    }
    
}
