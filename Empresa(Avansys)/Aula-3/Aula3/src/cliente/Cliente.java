
package cliente;

/**
 *
 * @author Jéssica Silva
 */
public class Cliente {
    
    private String nome;
    private long cpf;
    private int idade;
    private int Id;

    //Metodo construtor (metodo especial)
    public  Cliente( int Id){
       // System.out.println("Entrei no construtor");
       this.Id = Id;
    };
    
    //Sobrecarga de métodos, a diferenã e de assinatura
    public Cliente ( int id, String nome){
        
        this.Id = Id;
        this.nome =  nome;
        
        
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
    
    public String getNome() {
        return nome;
    }

    //
    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // método
    public int getAnoNascimento(){
       return 2021 - this.idade; 
    }

   
}
