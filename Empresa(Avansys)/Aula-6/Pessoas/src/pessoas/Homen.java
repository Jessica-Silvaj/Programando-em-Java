package pessoas;

/**
 *
 * @author Jéssica SIlva
 */
public class Homen extends Pessoa {
    
     private int idade = 15;
     private String nome = "Roberto";
     
     @Override
     
     public void dadosPessoais(){
         System.out.println("Nome:" + this.nome);
         
         if(idade <18 ){
         System.out.println("Idade minima 18 ");
            } else {
          System.out.println("Idade: " + this.idade);
         }
     }
    
    
}
