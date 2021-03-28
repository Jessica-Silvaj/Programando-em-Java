
package pessoas;

/**
 *
 * @author Jéssica SIlva
 */
public class Mulher extends Pessoa{
    
      private int idade = 35;
     private String nome = "Maria";
     
     @Override
     
     public void dadosPessoais(){
         System.out.println("Nome:" + this.nome);
         
         if(idade < 40){
         System.out.println("Idade máxima e de 35 anos " );
            
     }else {
             
           System.out.println("Idade: " + this.idade);
}
}
}
