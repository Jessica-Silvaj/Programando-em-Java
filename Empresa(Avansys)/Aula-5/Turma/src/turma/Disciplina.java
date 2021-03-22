
package turma;

/**
 *
 * @author Jéssica SIlva
 */
public class Disciplina {
    
    private String nomeDisciplina;
    private Alunos aluno;
    private double mediaAluno;

       // Metodo construtor
    public Disciplina (String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    
    }
    
    public double getmediaAluno() {
        return mediaAluno;
    }

    public void setmediaAluno(double mediaAluno) {
        this.mediaAluno = mediaAluno;
    }
    
 
    //Metodo especiais
    public void isAdicionar (Alunos alunos){
        this.aluno = alunos;
        
    }
    
    public void ImprimirNomes (Alunos alunos){
        
    if(mediaAluno >= 7) {
        
         System.out.println("** Alunos a cima da média **");
         System.out.println("Disciplina: " + this.nomeDisciplina);
         System.out.println("Aluno(a):"+alunos.getNomeAluno());
         System.out.println("Nota:  "+this.getmediaAluno());
       
    } else {
    
         System.out.println(" **Alunos a baixo da média**");
         System.out.println(" Disciplina: " + this.nomeDisciplina);
         System.out.println(" Aluno(a):"+alunos.getNomeAluno());
         System.out.println("Nota:  "+this.getmediaAluno());
        
    }
        
    }
    
}
