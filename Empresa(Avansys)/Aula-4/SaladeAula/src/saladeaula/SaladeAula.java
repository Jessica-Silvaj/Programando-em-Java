/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saladeaula;

/**
 *
 * @author Jéssica SIlva
 */
public class SaladeAula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Classes Staticas*/
        System.out.println("A sala esstá aberta? " + Sala.isFechadaouAberta() + "");
        System.out.println("A capacidade da sala é de  " +Sala.getCapacidade() +" alunos");
        
        //instancia outros metodos
        
        Sala s = new Sala();

       // valores        
        s.setAndar(5);
        s.setTamanho(40.6);
        
        System.out.println("o sala estta no " + s.getAndar() + " andares");
        System.out.println("o tamanho da sala tem " + s.getTamanho() + "m");
        
    }
    
}
