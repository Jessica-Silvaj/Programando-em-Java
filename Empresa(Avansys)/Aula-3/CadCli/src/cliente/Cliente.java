package cliente;

/**
 *
 * @author Jéssica SIlva
 */
public class Cliente {
    
     private String Nomecliente;
     private int Idade;
     private long Cpf;
     
     public Cliente(){
     
         this.Nomecliente = " ";
         this.Idade = 0;
         this.Cpf = Cpf;
     
     }   

    public Long getCpf() {
        return Cpf;
    }

    public void setCpf(Long Cpf) {
            
        this.Cpf = Cpf;
        
    }
    
    public String getNomecliente() {
        return Nomecliente;
    }

    public void setNomecliente(String Nomecliente) {
        
        //Validação do campo nome
     
        if( Nomecliente.length() >= 2){
               
            this.Nomecliente = Nomecliente;
                 
          } else  {
           
            System.out.println("O seu nome está inválido, tente novamente!");  
            
        }
        
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        
        //Validação do campo Idade
      boolean valido = true;
      
        if (Idade >= 0 && Idade <= 100){
            
          this.Idade = Idade;
          
        } else {
            
           System.out.println("Sua idade é inválida, tente novamente!");
         
           valido = false;
        
        }
        
    }
   
}