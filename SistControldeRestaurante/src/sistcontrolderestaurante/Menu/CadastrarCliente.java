
package sistcontrolderestaurante.Menu;

import java.util.Random;
import java.util.Scanner;

import sistcontrolderestaurante.ModelosC.Cliente;
import sistcontrolderestaurante.dao.Dao;
import sistcontrolderestaurante.dao.DaoArrayList;

public class CadastrarCliente extends ItemDeMenu {
 
    @Override
    public String getDescricao() {
       return "CADASTRAR NOVO CLIENTE";
    }
    
    @Override
    public boolean executar() {
        System.out.println("-----------------:------------------------------:--------------------\n");
        System.out.println("                *** CADASTRO DE UM NOVO CLIENTE ***");
        
         String Nome = leitor.lerString("-> NOME COMPLETO DO CLIENTE: ");
         
         
         String Cpf = leitor.lerString("ATENÇÃO(MAX 11 DIGITO)! -> NUMERO DO CPF: ");
        
         // Criar método de  Verificação do cpf

         
        String QantidadedeP = leitor.lerString("-> QUANTIDADE DE PESSOAS: ");
      
      // Mesas
      
       String [] Mesas = {"1", "2","3","4","5"," 6"," 7"," 8"," 9","10","11", "12","13"," 14"," 15","16"," 17",
       "18"," 19","20"};
       
          Random random = new Random();
       
           int quantDeMesas = Mesas.length;
           
             int indiceSorteado = random.nextInt(quantDeMesas);
            String sorteada = Mesas[indiceSorteado];
          
                          
               System.out.println("\n *** -> ESTÁ DISPONIVEL A MESA "+sorteada+" <- ***");
  
               // GARÇOM
               
              // String [] Garcom = {"CAUÃ REYMOND","ANGELINA JOLIE"};
               
              // Random gar = new Random();
       
          // int quantGarcom = Garcom.length;
           
           //  int indicedoSorteado = random.nextInt(quantGarcom);
           // String sorteado = Garcom[indicedoSorteado];
            
             if(( indiceSorteado % 2 ) == 0){
                 
                 System.out.println("*** -> O GRAÇOM DE IRÁ ATENDER É : CAUÃ REYMOND");
                 
             } else{
                 
                  System.out.println("*** -> O GRAÇOM DE IRÁ ATENDER É : ANGELINA JOLIE");
             }
             
            
            //System.out.println("\n  ");
    
          Cliente cliente = new Cliente(Nome,Cpf,QantidadedeP);  
       // ArryList  para amarzenamentodas informações
        Dao dao = new DaoArrayList();
        dao.cadastrar(cliente);
       
       
        System.out.println("-----------------:------------------------------:--------------------\n");
        System.out.println("           *** -> O  CADASTRADO FOI REALIZADO COM SUCESSO!! <- *** \n");
        System.out.println("-----------------:------------------------------:--------------------\n");       
      
       return false;
    }

       
    
}
