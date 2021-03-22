package turma;

/**
 *
 * @author Jéssica SIlva
 */
public class Turma {

    public static void main(String[] args) {
        
        System.out.println("---------------------------------------------");
        System.out.println(" **** Dados dos alunos ****");
        System.out.println("---------------------------------------------");
        Alunos a = new Alunos("Jéssica");
        
        Disciplina d = new Disciplina("Introdução a Java");
        
        // média do aluno a
        d.setmediaAluno(8.5);
        d.ImprimirNomes(a);
        
        System.out.println("---------------------------------------------");
        
            Alunos b = new Alunos("Felipe");
            d.setmediaAluno(5.5);
            d.ImprimirNomes(b);
        
        
 
        
    }
    
}
