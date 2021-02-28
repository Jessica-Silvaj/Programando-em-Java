package jogodaforca;

import java.util.Random;
import java.util.Scanner;

public class JogoDaForca {
   
    public static void main(String[] args) {
        //Sorteio de Palavras
        Random random = new Random();
       
        //Scanner
        Scanner in = new Scanner(System.in);
       
        //Lista de Palavras
        String[] palavras = {"ALGORITMO", "DESENVOLVIMENTO", "SISTEMAS", "TECNOLOGIA", "CODIGO", "SOFTWARE"};
       
        //Quantidade de Palavras
        int quantPalavras = palavras.length;
        int indiceSorteado = random.nextInt(quantPalavras); //�ndice Sorteado
        String sorteada = palavras[indiceSorteado]; //Palavra Sorteada
       
        char[] acertos = new char[sorteada.length()];
        for (int i = 0; i < acertos.length; i++){
            acertos[i] = 0;
        }
       
        String letrasUtulizadas = "";
       
        char letra;
        boolean ganhou = false;
        int vidas = sorteada.length(); //N�mero de tentativas
       
        //Dica da palavra
        System.out.println("\nDica: Bacharelado Sistemas de Informa��o");
       
        for (int i = 0; i < sorteada.length(); i++) {
                System.out.print(" _ "); //Exibi��o da quantidade de letras
            }
        System.out.println("\n");
       
        //Executa enquanto � verdadeiro
        while(!ganhou && vidas != 0){// !(Nega��o) !=(Diferen�a)
           
        System.out.print("\nQuantidade de tentativas: " + vidas );
        System.out.print("\nLetras utilizadas: " + letrasUtulizadas);
        System.out.print("\nQual letra voc� deseja tentar? ");
        letra = in.next().toUpperCase().charAt(0);
        letrasUtulizadas += " " + letra;
       
        boolean perdeVida = true;
        for (int i = 0; i < sorteada.length(); i++) {
            if(letra == sorteada.charAt(i)){
        //Verifica se a letra digitada � igual a letra da palavara sorteada na posi��o "i"
                acertos[i] = 1;
                perdeVida = false;
        }
     }
        if(perdeVida)
            vidas --;
       
        ganhou = true;
        for (int i = 0; i < sorteada.length(); i++) {
            if(acertos[i] == 0) {
                System.out.print(" _ ");
                ganhou = false;
            }
        else {
                System.out.print(" " + sorteada.charAt(i) + " ");
        }
      }
        System.out.println("\n\n");
    }
     if(vidas > 0){
        System.out.println("\nParab�ns, voc� ganhou!");
        System.out.println("\nAperte F6");
       
     } else {
        System.out.println("\nQue pena...voc� errou!");
        System.out.println("\n O\n-|-  ");
        System.out.println("/ \n");
        System.out.println("A palavra era: " + sorteada);
        System.out.println("Aperte F6");
     }
   }
}