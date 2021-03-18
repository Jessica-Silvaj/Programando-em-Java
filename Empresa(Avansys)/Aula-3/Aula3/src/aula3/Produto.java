
package aula3;

/**
 *
 * @author Jéssica Silva
 */

// private só terá acesso dentro da classe Produto
public class Produto {
    
    //Criação de classe privada o tipo e seus atributos
    
    private  int  id;
    private String nome;
    private String desc;

    // get e set
    //buscar valores que esta dentro da classe
    public int getId() {
        return id;
    }

    //Para modificar valores  usamos o set
    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
//        if (nome == "Computador"){
//       
//            this.nome = nome;
//        
//        } else {
//            
//            System.out.println("Erro!");
//        }

            this.nome = nome;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    
  
    
}
