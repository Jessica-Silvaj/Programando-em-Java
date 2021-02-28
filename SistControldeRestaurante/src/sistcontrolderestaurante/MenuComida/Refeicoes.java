
package sistcontrolderestaurante.MenuComida;

import java.util.Scanner;

public class Refeicoes extends ItemdoCardapio {

    @Override
    public String getDescricao() {
         return "REFEIÇÕES";
    }

    @Override
    public boolean executar() {
        
       Scanner scanner = new Scanner(System.in);
       
        double SalmaoDefumado = 42;
        double BurgerDeBeterraba = 35;
        double EspaguetedeAbacate = 40;
        double PokeManga = 45;
        double media;
        
         Scanner entrada = new Scanner(System.in);
        
        System.out.println("-----------------:------------------------------:--------------------\n");
        System.out.println("                       *** REFEIÇÕES *** \n");
        System.out.println("-----------------:------------------------------:--------------------\n");
        System.out.println("                       *** CARDÁPIO ***\n");
        System.out.println("-----------------:------------------------------:--------------------\n");
        
        System.out.println("   ** PRATOS  **           |                          *** DESCRIÇOES DOS INGREDIENTES DOS PRATOS ***                                               |         TEMPO      |   VALOR  | ");
        
        System.out.println("1 - SALMÃO DEFUMADO        | * SALMAO DEFUMADO, ABACATE, MOLHO HOLANDÊS CASEIRO, FOLHAS VARIADAS, FLORES E DOIS OVOS PORCHÉ                        |       20 MINUTOS   | R$: 42,00|)\n");
        System.out.println("2 - BURGER DE BETERRABA    | * ABACATE, PÃO DE BETERRABA, ALFACE, TOMATE, CEBOLA ROXA, MOSTARDA AMERICANA, SERVIDO COM NACHOS                      |       20 MINUTOS   | R$: 25,00|\n");
        System.out.println("3 - ESPAGUETE DE ABACATE   | * DELICIOSO ESPAGUETE COM MOLHO À BASE DE ABACATE, LIMÃO, AZEITE E MANJERICÃO SERVIDOS COM PARMESÃO E TOMATES CEREJA  |       20 MINUTOS   | R$: 35,00|\n");
        System.out.println("4 - POKE MANGA             | * ABACATE, MANGA,PEPINO EM CONSERVA,, SALMAO,SEMENTE DE GERGELIM, ARROZ DE SUSHI, SHOVO, MAIONESE DE MANGA            |       20 MINUTOS   | R$: 45,00|\n)");
        System.out.println("-> ESCOLHA UMA DAS REFEIÇÕES: ");
        int nome = scanner.nextInt();
        System.out.println("-> QUANTIDADE: ");
        int qtd = entrada.nextInt();
        
        switch (nome){
            case 1:
                
                media = SalmaoDefumado * qtd;
               System.out.println("* NOME: SALMÃO DEFUMADO");
               System.out.println("* VALOR R$: "+ media );  
               System.out.println("* DESCRIÇÃO:SALMAO DEFUMADO, ABACATE, MOLHO HOLANDÊS CASEIRO, FOLHAS VARIADAS, FLORES E DOIS OVOS PORCHÉ ");
               System.out.println("* TEMPO DE PREPARO:  20 MINUTOS");
                break;
            case 2: 
                
                 media = BurgerDeBeterraba * qtd;
                System.out.println("* NOME: BURGER DE BETERRABA");                
               System.out.println("* VALOR R$: "+ media);
                System.out.println("* DESCRIÇÃO:ABACATE, PÃO DE BERRABA, ALFACE, TOMATO, CEBOLA ROXA, MOSTARDA AMERICANA, SERVIDO COM NACHOS ");
                System.out.println("* TEMPO DE PREPARO: 20 MINUTOS");
                break;
            case 3:
            
                 media = EspaguetedeAbacate* qtd;
                System.out.println("* NOME: ESPAGUETE DE ABACATE");              
               System.out.println("* VALOR R$: "+ media);
                System.out.println("* DESCRIÇÃO:DELICIOSO ESPAGUETE COM MOLHO À BASE DE ABACATE, LIMÃO, AZEITE E MANJERICÃO SERVIDOS COM PARMESÃO E TOMATES CEREJA ");
                System.out.println("* TEMPO DE PREPARO: 20 MINUTOS");
                break;
            case 4:
                
                media = PokeManga* qtd;
                System.out.println("* NOME: POKE MANGA");               
               System.out.println("* VALOR R$: "+media);
                System.out.println("* DESCRIÇÃO:ABACATE, MANGA,PEPINO EM CONSERVA,, SALMAO,SEMENTE DE GERGELIM, ARROZ DE SUSHI, SHOVO, MAIONESE DE MANGA  ");
                System.out.println("* TEMPO DE PREPARO: 20 MINUTOS");
                break;
        }
        System.out.println("-----------------:------------------------------:--------------------\n");
        System.out.println("           *** -> O  PEDIDO FOI REALIZADO COM SUCESSO!! <- *** \n");
        System.out.println("-----------------:------------------------------:--------------------\n");  
         return false;
    }
     
    
}
    

