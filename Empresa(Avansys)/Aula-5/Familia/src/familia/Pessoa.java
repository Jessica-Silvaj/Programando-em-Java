
package familia;

/**
 *
 * @author Jéssica SIlva
 */
public class Pessoa {
    
    String nome;
    
    // auto-relacionamento
   Pessoa pai;
   Pessoa mae;
   
   public Pessoa(String nome){
   
       this.nome = nome;
       //Vira uma composição
       //this.pai = new Pessoa("João");
       
   }

    public Pessoa getPai() {
        return pai;
    }

    public void setPai(Pessoa pai) {
        this.pai = pai;
    }

    
    public Pessoa getMae() {
        return mae;
    }

    public void setMae(Pessoa mae) {
        this.mae = mae;
    }
    
 
    public void imprimiNomes (){
        
        System.out.println(this.nome);
        
        if(this.pai != null){
            
            System.out.println(pai.nome);
        }
        
        if(this.mae != null){
            System.out.println(mae.nome);
        }
       
    }
   
   
   
   
   
   
      
    
}
