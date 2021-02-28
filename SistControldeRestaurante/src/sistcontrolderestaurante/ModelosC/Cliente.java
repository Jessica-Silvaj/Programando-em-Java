
package sistcontrolderestaurante.ModelosC;

public class Cliente {
    private String nome,Cpf,QantidadedeP; 
    private double Mesas;
   

     public Cliente(String nome, String Cpf, String QuantidadeP) {
        this(nome, Cpf, QuantidadeP,0);
        
    }

    public Cliente(String nome, String Cpf, String QantidadedeP,double Mesas) {
        
        this.nome = nome;
        this.Cpf = Cpf;
        this.QantidadedeP = QantidadedeP;
      this.Mesas = Mesas;
       
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getQantidadedeP() {
        return QantidadedeP;
    }

    public void setQantidadedeP(String QantidadedeP) {
        this.QantidadedeP = QantidadedeP;
    }

    public double getMesas() {
        return Mesas;
    }

    public void setMesas(double Mesas) {
        this.Mesas = Mesas;
    }

  
    }

  
    

    

