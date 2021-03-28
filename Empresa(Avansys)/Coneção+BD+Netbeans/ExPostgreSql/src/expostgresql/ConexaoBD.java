
package expostgresql;

//Importa o sql importação
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Jéssica Silva
 */
public class ConexaoBD {
    
    //Atributos
    private String url;
    private String usuario;
    private String senha;
    private Connection con;
    
    //Construtor
    public ConexaoBD(){
        //Atribuir a url do banco de dados e os valores
        url  = "jdbc:postgresql://localhost:5432/ConexaoJava";
        usuario = "postgres";
        senha = "Jessica10";
        
        
        //Atribuir conexao com o bd usando try catch para verificar se ocorreu conexão
      
        try {
            
            //Nome do driver
            Class.forName("org.postgresql.Driver");
            /*Através da variavel con irá receber o drive manager com a conexao com a url*/
            con = DriverManager.getConnection(url, usuario, senha);
            
            System.out.println("Conexão realizada com sucesso!!!");
            
        } catch (Exception e) {
            
            //Caso ocorra algum erro irá mostrar na tela 
            e.printStackTrace();
            System.out.println("Ocorreu um erro!!!");
        }
    
    }
   //Criação de metodos
    
    public int executarBD (String sql) {
    
        try {
           
            Statement stm = con.createStatement();
            int res = stm.executeUpdate(sql);
            con.close();
            
            return res;
            
        }catch (Exception e){
        
            e.printStackTrace();
            
          return 0;
          
        } 
    }
    
 //Mostra os resultados ta tabela cliente usando select
    
    public ResultSet executarBuscar (String buscar){
    
             try {
           
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(buscar);
            con.close();
            
            return rs;
            
        }catch (Exception e){
        
            e.printStackTrace();
            
          return null;
        
        }
    
    
    }
}
    

