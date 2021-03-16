/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiroprograma;

/**
 *
 * @author Jéssica SIlva
 */
public class PrimeiroPrograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declaração de variavel
         int idadeAluno, idadeProfessor ,  totalIdade;
        idadeAluno = 20;
        idadeProfessor = 30;
        
        totalIdade =  idadeAluno + idadeProfessor;
        
        String nome , sobrenome;
        nome = "Jéssica";
        sobrenome = "Silva";
        
        //Imprimir algo na tela
        System.out.println("O total da idade: "  + totalIdade);
        System.out.println(idadeAluno);
        System.out.println("Meu primeiro Programa!");
        System.out.println("Meu segundo Programa!");
        System.out.println("A idade do aluno é: " + idadeAluno);
        System.out.println("Olá "+ nome + sobrenome);
        
    }
    
}
