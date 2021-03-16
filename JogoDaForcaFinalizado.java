package jogodaforcafinalizado;






import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

        
public class JogoDaForca {

    
public static void  iniciar(){
       
     System.out.println(""
     + "|----------------------------------------------------|"
     + "| SEJAM BEM VINDOS AO JOGO DA FORCA MARVÉL - 2019.2   |"
     + "|----------------------------------------------------|");
       System.out.println( "\n|----------------------------------------------|");
            System.out.println("   *********************");
            System.out.println("   ***               ***");
            System.out.println("   ***                *");
            System.out.println("   ***");
            System.out.println("   ***");
            System.out.println("   ***");
            System.out.println("   ***");
            System.out.println("   ***");
            System.out.println("   ***");
            System.out.println("   ***");
            System.out.println("   ***");
            System.out.println("   ***");
            System.out.println("   ***");
            System.out.println("   ***");
            System.out.println("   ***");
            System.out.println("   ***");
            System.out.println("   ***");
            System.out.println("*************");
            System.out.println("*************");
    
               System.out.println("\n");
               
 }
     
    public static void main(String[] args)  {
        //iniciar jogo
       JogoDaForca.iniciar();
       
       
      //serão palavras que iremos definir dentro da forca
       
    String [] palavras = {"HOMEM-ARANHA","HULK","THOR" ,"LOKI","CAPITAO-AMERICA",
      "DEADPOOL","HOMEM-DE-FERRO","DOUTOR-ESTRANHO","PANTERA-NEGRA","VIUVA-NEGRA",
      "FEITICEIRA-ESCARLATE","GALACTUS","GAVIAO-ARQUEIRO","TRIBUNAL-VIVO","PROFESSOR-CHARLES-XAVIER",
      "MAGNETO", "DEMOLIDOR","NICK-FURY","ADAM-WARLOCK","JEAN-GREY","VISAO" ,"MAR-VELL" ,
      "MULHER-HULK" ,"ANJO" ,"SURFISTA-PRATEADO" ,"QUARTETO-FANTASTICO" ,
      "HOMEM-FORMIGA" ,"THANOS" ,"LOGAN" ,"WOLVERINE" ,"SUPER-MAVEL","DOUTOR-DESTINO" ,
     "NAMOR" , "TEMPESTADE" , "ULTON" ,"HOMEM-GELO" ,"SENHOR-DAS-ESTRELAS" ,"PUNHO-DE-FERRO" 
     , "NOTURNO" ,"GAMORA" , "COLOSSUS" , "CAVALEIRO-DA-LUA" ,"GROOT" ,"NEBULOSA" ,"DRAX" ,"ROCKET" 
     ,"RONAN","GAVIAO-ARQUEIRO" ,"SAM-WILSON" ,"BUCKY-BARNES"  , "CAPITA-MARVEL" ,"MERCURIO" ,"VESPA"};
    
    
       // irá lista ser a palavra repetida já foi usada
    ArrayList listaDeLetrasUtilizadas = new ArrayList();
 
     /*Sorteador: Serve para sortear a palavra  que esta dentro do
    string.
    */
             Random random = new Random();
    
     // Lêr os dados que foi inserido pelo o usúario.
    Scanner letraDigitada = new Scanner(System.in);
    
      
   
     // declarar quantidade de palavras.
    int quantPalavras = palavras.length; // Esse ".length" significa que funciona com vetores.// pegar o tamanho do vetor.
    
     //Fazer com o que, o jogo sortei outras Palavras.
    int indiceSorteado = random.nextInt(quantPalavras); //Posição no vetor aonde a palavra sorteada esta.
         String sorteada = palavras[indiceSorteado];// A palavra sorteada.
                           //Palavras na posição indiceSorteado.
        
         
         /*Controla o acertos do usúario .... a idéia é que cada letra seja um acerto    
         exemplo: A M I G O
                  0 1 2 3 4 -> POSIÇÃO DE CADA LETRA
                  0 0 0 0 0 -> O "0" representa que o usúario ainda não acertou
                  Aí o usúario acerta o G
                  0 0 0 1 0 -> acertou*/
         
         
      char [] acertos = new char[sorteada.length()];
      for(int i = 0; i < acertos.length; i++){
          acertos[i] = 0; 
          
          if(sorteada.charAt(i)=='-')
              
              acertos[i]=1;
          
      }
     
    String letrasUtilizadas = " ";
   
    // Caracter de letras.
     
    char letras;
        boolean ganhou = false;
    int dicaletra = sorteada.length(); //O tamanho da palavra sorteada, ou seja, AMIGOS = 5 letras, CEU = 3 letras.
    int vidas = 6;// quantidade de vida
       
       
    // Aqui mostra o underlines com o tamanho da palavra e o hifen
    for (int i = 0; i < sorteada.length(); i++){
        // Verificar ser a letra é igual 
        //a palavra Sorteada
        //na aposição 
             if(acertos[1] == 1){
                 System.out.print(" - "); // é um hifén
             }
             else if (acertos[i] == 0)  { 
                
            System.out.print( " _ ");
           
           }
           else{
               System.out.print(" " + sorteada.charAt(i) + " ");               
           }
       
    }
        
      while(!ganhou && vidas > 0) {
           
            // ser ele não ganhou ou ainda tem vida repete{
            System.out.println(
                   "\n\n|----------------------------------------------|");
            System.out.println(""
                    + "|\t ** DICA : PERSONAGEM DA MÁVEL ** \n "
                    + "|\t ** A PALAVRA TEM: " + dicaletra + " LETRAS **\n"
                    + "|\t ** VOCÊ TEM: " + vidas + " VIDAS **"
                    + "\n|\t ** LETRAS UTILIZADAS: " + letrasUtilizadas
                    + "\n|----------------------------------------------|\n"
                    + "\n\t *** QUAL LETRA VOCÊ DESEJA TENTAR ?  ***\n");
            
        letras = letraDigitada.next().toUpperCase().charAt(0); /*Usa o scanner para ler... o To upper case 
                                                    para colocar as letras em maiusculo e depois o
                                                CharAT(0) para pegar a primeira letra.*/
     
        letrasUtilizadas += " " + letras;// junta a letra nas letras utilizadas
        
       boolean Perdevidas = true;
       
      
        for (int i = 0; i < sorteada.length(); i++){
        // Verificar ser a letra  digitada é igual a letra da palavra
        // Sorteada
        //na aposição i
            
   if (letras != sorteada.charAt(i)) {
         } else {
       acertos[i] = 1;
       Perdevidas = false;
       
         }
          
        }
         // Ser caso o jogado tentar a mesma letra, aparece essa mensagens
           if (listaDeLetrasUtilizadas.contains(letras)) {
                System.out.println("|\t ** A LETRA DIGITADA JÁ FOI UTILIZADA ANTERIORMENTE!!");
                System.out.println("\n");
                  Perdevidas = false;
            }else{
                listaDeLetrasUtilizadas.add(letras);
            } 
                       
            
   
        if(Perdevidas) {
            vidas--;
            
            System.out.println("\n\t ***VOCÊ ERROU, MAIS AINDA TEM " + vidas + " VIDAS ***\n");
             //vida.. só exercuta ser o usúario não acerta a letra nessa rodada
         } 
              
          
   
         // Desenho do boneco
          
         if(vidas == 5){
               
            System.out.println("   **************************");
            System.out.println("   ***                    ***");
            System.out.println("   ***                     *");
            System.out.println("   ***                   ****");
            System.out.println("   ***                  ******");
            System.out.println("   ***                  ******");
            System.out.println("   ***                   ****");
            System.out.println("   ***                     *");
            System.out.println("   ***");
            System.out.println("   ***");
            System.out.println("   ***");
            System.out.println("   ***");
            System.out.println("   ***");
            System.out.println("   ***");
            System.out.println("   ***");
            System.out.println("   ***");
            System.out.println("   ***");
            System.out.println("**********");
            System.out.println("**********");
         System.out.println("\n");
        } else if(vidas == 4){
           System.out.println("   **************************");
            System.out.println("   ***                    ***");
            System.out.println("   ***                     *");
            System.out.println("   ***                   ****");
            System.out.println("   ***                  ******");
            System.out.println("   ***                  ******");
            System.out.println("   ***                   ****");
            System.out.println("   ***                     *");
            System.out.println("   ***                     *");
            System.out.println("   ***                     *");
            System.out.println("   ***                     *");
            System.out.println("   ***                     *");
            System.out.println("   ***                     *");
            System.out.println("   ***                     *");
            System.out.println("   ***");
            System.out.println("   ***");
            System.out.println("   ***");
            System.out.println("**********");
            System.out.println("**********");
             System.out.println("\n");
        }else if(vidas == 3){
            System.out.println("   **************************");
            System.out.println("   ***                    ***");
            System.out.println("   ***                     *");
            System.out.println("   ***                   ****");
            System.out.println("   ***                  ******");
            System.out.println("   ***                  ******");
            System.out.println("   ***                   ****");
            System.out.println("   ***                     *");
            System.out.println("   ***                    ***");
            System.out.println("   ***                   * *");
            System.out.println("   ***                  *  *");
            System.out.println("   ***                 *   *");
            System.out.println("   ***                     *");
            System.out.println("   ***                     *");
            System.out.println("**********");
            System.out.println("**********");
            System.out.println("\n");
        } else if(vidas == 2){
            System.out.println("   **************************");
            System.out.println("   ***                    ***");
            System.out.println("   ***                     *");
            System.out.println("   ***                   ****");
            System.out.println("   ***                  ******");
            System.out.println("   ***                  ******");
            System.out.println("   ***                   ****");
            System.out.println("   ***                     *");
            System.out.println("   ***                    ***");
            System.out.println("   ***                   * * *");
            System.out.println("   ***                  *  *   *");
            System.out.println("   ***                 *   *     *");
            System.out.println("   ***                     *");
            System.out.println("   ***                     *");
            System.out.println("**********");
            System.out.println("**********");
            System.out.println("\n");
        } else if(vidas == 1){
            System.out.println("   **************************");
            System.out.println("   ***                    ***");
            System.out.println("   ***                     *");
            System.out.println("   ***                   ****");
            System.out.println("   ***                  ******");
            System.out.println("   ***                  ******");
            System.out.println("   ***                   ****");
            System.out.println("   ***                     *");
            System.out.println("   ***                    ***");
            System.out.println("   ***                   * * *");
            System.out.println("   ***                  *  *   *");
            System.out.println("   ***                 *   *     *");
            System.out.println("   ***                     *");
            System.out.println("   ***                    ***");
            System.out.println("   ***                   *");
            System.out.println("   ***                  *");
            System.out.println("   ***                 *");
            System.out.println("**********");
            System.out.println("**********");
            System.out.println("\n");
        }
      
        ganhou = true;// digo ao usúario que ele pode ter ganhado
        
        for(int i = 0; i < sorteada.length(); i++) {
            
            if (acertos[i] == 0){
                System.out.print(" _ ");
                
                ganhou = false; //se existe alguns acetos[i] == 0(alguma letra que ele não acertou)
                                // digo que ele não ganhou
            } else{
                System.out.print(" " + sorteada.charAt(i) + " "); //mostro a letra
            }
            
           
            
        }
            System.out.println("\n");
            
             
        } 
           
        
       // ser vida for diferente de 0 aparece  essa frase abaixo
         if(vidas != 0){
             
          System.out.println("\n"
                + "\n-------------------------------------------------------|"
                + "\n\t ***PARABÉNS!, VOCÊ GANHOU ***!! |"
                + "\n\t **HÁ UM SUPER-HEROI EM TODOS NÓS,"
                + "\n\t **SÓ PRECISAMOS DA CORAGEM PARA COLOCAR A CAPA - SUPERMAN***"
                + "\n\t *** A PALAVRA CERTA É: " + sorteada
                + "\n----------------------------------------------          |");
          
          
         }  else {
             System.out.println("\n");
             System.out.println("   **************************");
            System.out.println("   ***                    ***");
            System.out.println("   ***                     *");
            System.out.println("   ***                   ****");
            System.out.println("   ***                  ******");
            System.out.println("   ***                  ******");
            System.out.println("   ***                   ****");
            System.out.println("   ***                     *");
            System.out.println("   ***                    ***");
            System.out.println("   ***                   * * *");
            System.out.println("   ***                  *  *   *");
            System.out.println("   ***                 *   *     *");
            System.out.println("   ***                     *");
            System.out.println("   ***                    ***");
            System.out.println("   ***                   *   *");
            System.out.println("   ***                  *     *");
            System.out.println("   ***                 *        *");
            System.out.println("**********");
            System.out.println("**********");
              System.out.print("\n");
              
          System.out.println(""
                  +"\n|---------------------------------------------------------|"
                + "\n|***QUE DESASTRE, VOCÊ PERDEU. ***!!                      |"
                  + "\n|***EU SOU ÍNEVITAVÉL - THANOS.***                        "
                + "|\n|---------------------------------------------------------|");
                 System.out.println("\t **A PALAVRA CORRETA ERA: " + sorteada);
                 System.out.println(
                           "|---------------------------------------------------------|"
                         + "\n|        ** COMPONETES DO DESENCOLVIMENTO DO JOGO!!**   |"
                         + "\n|         *** GABRIELA MONTEIRO ***                     |"
                         + "\n|         *** ITALO NASCIMENTO ***                      |"
                         + "\n|         *** JÉSSICA SILVA DE JESUS ***                |"
                         + "\n\n|              ** ORIENTADO!!**                         |"
                         + "\n|             *** OTHON BATISTA ***                     |"
                         + "\n|-------------------------------------------------------|");
             
          
         }        
       
          
        }
}
   