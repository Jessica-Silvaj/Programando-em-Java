
package sistcontrolderestaurante.MenuComida;

import java.util.Scanner;


public class Sobremesas extends ItemdoCardapio {

    @Override
    public String getDescricao() {
         return "SOBREMESAS";
    }

    @Override
    public boolean executar() {
        Scanner scanner = new Scanner(System.in);
       
        double MousseVerde = 18;
        double BrownieComGlaceVerde = 18;
        double CheesecakDeAbacate = 20;
        double SorveteVegano = 18;
        double media;
        
         Scanner entrada = new Scanner(System.in);
        
        System.out.println("-----------------:------------------------------:--------------------\n");
        System.out.println("                       *** SOBREMESAS *** \n");
        System.out.println("-----------------:------------------------------:--------------------\n");
        System.out.println("                       *** CARDÁPIO ***\n");
        System.out.println("-----------------:------------------------------:--------------------\n");
        
        System.out.println("   ** PRATOS  **            |                          *** DESCRIÇOES DOS INGREDIENTES DOS PRATOS ***                                        |      TEMPO       |   VALOR  | ");
        
        System.out.println("1 - MOUSSE VERDE            | * MOUSSE CREMOSO DE PISTACHE E ABACATE                                                                         |      5 MINUTOS   | R$: 18,00|\n");
        System.out.println("2 - BROWNIE COM GLACÊ VERDE | * BROWNIE DE CHOCOLATE COM NOZES RECHEADOS COM UM DELICIOSO CREME DE ABACATE                                   |      10 MINUTOS  | R$: 18,00|\n");
        System.out.println("3 - CHEESECAKE DE ABACATE   | * CHEESECAKE CREMOSO DE LIMÃO COM ABACATE ASSENTADO NUMA MASSA DE BANANA COM AÇÚCAR MASCAVO. RECEITA DO CHEF!  |      5 MINUTOS   | R$: 20,00|\n");
        System.out.println("4 - SORVETE VEGANO          | * SORVETE DE MANTEIGA DE AMENDOIM E ABACATE VEGANOS SERVIDOS EM UM CONE PRETO                                  |     5 MINUTOS    | R$: 18,00|\n");
        
        System.out.println("-> ESCOLHA UMA DAS REFEIÇÕES: ");
        int opc = scanner.nextInt();
        System.out.print("-> QUANTIDADE: ");
        int qtd = entrada.nextInt();
        
        switch (opc){
            
            case 1:
                
                 media = MousseVerde * qtd;
               System.out.println("* NOME: MOUSSE VERDE");               
               System.out.println("* VALOR R$: "+ media ); 
               System.out.println("* DESCRIÇÃO: MOUSSE CREMOSO DE PISTACHE E ABACATE");
               System.out.println("* TEMPO DE PREPARO:  5 MINUTOS");
                break;
                
            case 2: 
                
                 media = BrownieComGlaceVerde * qtd;
                System.out.println("* NOME: BROWNIE COM GLACÊ VERDE");             
                System.out.println("* VALOR R$: "+ media);
                System.out.println("* DESCRIÇÃO:BROWNIE DE CHOCOLATE COM NOZES RECHEADOS COM UM DELICIOSO CREME DE ABACATE ");
                System.out.println("* TEMPO DE PREPARO: 10 MINUTOS");
                break;
            case 3:
            
                 media = CheesecakDeAbacate* qtd;
                System.out.println("* NOME: CHEESECAKE DE ABACATE ");                
                System.out.println("* VALOR R$: "+ media);
                System.out.println("* DESCRIÇÃO:CHEESECAKE CREMOSO DE LIMÃO COM ABACATE ASSENTADO NUMA MASSA DE BANANA COM AÇÚCAR MASCAVO. RECEITA DO CHEF! ");
                System.out.println("* TEMPO DE PREPARO: 5 MINUTOS");
                break;
            case 4:
                
                media = SorveteVegano* qtd;
                System.out.println("* NOME: SORVETE VEGANO ");
                System.out.println("* VALOR R$: "+ media);
                System.out.println("* DESCRIÇÃO:SORVETE DE MANTEIGA DE AMENDOIM E ABACATE VEGANOS SERVIDOS EM UM CONE PRETO  ");
                System.out.println("* TEMPO DE PREPARO: 5 MINUTOS");
                break;
        }
        System.out.println("-----------------:------------------------------:--------------------\n");
        System.out.println("           *** -> O  PEDIDO FOI REALIZADO COM SUCESSO!! <- *** \n");
        System.out.println("-----------------:------------------------------:--------------------\n");
         return false;
    }
    
}
