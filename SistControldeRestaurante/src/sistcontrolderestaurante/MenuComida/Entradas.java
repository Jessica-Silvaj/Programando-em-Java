
package sistcontrolderestaurante.MenuComida;

import java.util.Scanner;
import sistcontrolderestaurante.dao.Dao;
import sistcontrolderestaurante.dao.DaoArrayList;

public class Entradas extends ItemdoCardapio{

    @Override
    public String getDescricao() {
      return "ENTRADA";
    }

    @Override
    public boolean executar() {
        
        
        Scanner scanner = new Scanner(System.in);
        
        double AssadoVegano = 22;
        double CremeVerde = 18;  
        double SaladaJulioCesar = 20;
        double JardimDeAbacates = 24;
        double media;
        
         Scanner entrada = new Scanner(System.in);
        System.out.println("-----------------:------------------------------:--------------------\n");
        System.out.println("                       *** ENTRADA *** \n");
        System.out.println("-----------------:------------------------------:--------------------\n");
        System.out.println("                       *** CARDÁPIO ***\n");
        System.out.println("-----------------:------------------------------:--------------------\n");
        
        System.out.println("   ** PRATOS  **         |                          *** DESCRIÇOES DOS INGREDIENTES DOS PRATOS ***                                   |         TEMPO      |   VALOR  | ");
        
        System.out.println("1 - ASSADO VEGANO        | * ABOBRINHA ASSADA, BERINJELA E PIMENTÃO COM FLOR DE ABACATE E PESTO                                      |       15 MINUTOS   | R$: 22,00|\n");
        System.out.println("2 - CREME VERDE          | * SABOROSO CREME DE ABACATE  COM ABOBRINHA E ALHO PORÓ                                                    |       10 MINUTOS   | R$: 18,00|\n");
        System.out.println("3 - SALADA JULIO CESAR   | * FRANGO EM CUBOS, ABACATE, BACON CROCANTE, ALFACE, PARMESÃO, CROUTONS, GERGELIM, SEMENTES E MOLHO CÉSAR  |       15 MINUTOS   | R$: 20,00|\n");
        System.out.println("4 - JARDIM DE ABACATES   | * ABACATE, HOMUS, ESPECIARIAS, ERVAS E FLORES SERVIDOS COM PALITOS DE PÃO TORRADOS                        |       15 MINUTOS   | R$: 24,00|\n");
        System.out.print(" -> ESCOLHA UMA DAS REFEIÇÕES: ");
        int opc = scanner.nextInt();
        
         System.out.print("-> QUANTIDADE: ");
        int qtd = entrada.nextInt();
         
        
        switch (opc){
            case 1:
                media = AssadoVegano* qtd;
               System.out.println("* NOME: ASASSADO VEGANO  ");
               
               System.out.println("* VALOR R$: "+ media ); 
               System.out.println("* DESCRIÇÃO:ABOBRINHAN ASSADA, BERINJELA E PIMENTÃO COM FLOR DE ABACATR E PESTO ");
               System.out.println("* TEMPO DE PREPARO: 15 MINUTOS");
                break;
            case 2: 
                media = CremeVerde* qtd;
                System.out.println("* NOME:CREME VERDE ");
               System.out.println("* VALOR R$: "+ media ); 
                System.out.println("* DESCRIÇÃO:SABOROSO CREME DE ABACATE  COM ABOBRINHAE ALHO PORÓ   ");
                System.out.println("* TEMPO DE PREPARO: 10 MINUTOS");
                break;
            case 3:
            media = SaladaJulioCesar* qtd;
                System.out.println("* NOME: SALADA JULIO CESAR");
               System.out.println("* VALOR R$: "+ media ); 
                System.out.println("* DESCRIÇÃO:FRANGO EM CUBOS, ABACATE, BACON CROCANTE, ALFACE, PARMESÃO, CROUTONS, GERGELIM, SEMENTES E MOLHO CÉSAR ");
                System.out.println("* TEMPO DE PREPARO: 15 MINUTOS");
                break;
            case 4:
                media = JardimDeAbacates* qtd;
                System.out.println("* NOME:JARDIM DE ABACATES");
               System.out.println("* VALOR R$: "+ media ); 
               System.out.println("* DESCRIÇÃO:ABACATE, HOMUS, ESPECIARIAS, ERVAS E FLORES SERVIDOS COM PALITOS DE PÃO TORRADOS");
               System.out.println("* TEMPO DE PREPARO: 15 Á 20 MINUTOS");
                break;
        }
        
       
        System.out.println("-----------------:------------------------------:--------------------\n");
        System.out.println("           *** -> O  PEDIDO FOI REALIZADO COM SUCESSO!! <- *** \n");
        System.out.println("-----------------:------------------------------:--------------------\n");  
        
        return false;
    }
    
}
