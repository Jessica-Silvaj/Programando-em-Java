/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistcontrolderestaurante.MenuComida;

import java.util.Scanner;


public class Petiscos  extends ItemdoCardapio{

    @Override
    public String getDescricao() {
         return "PETISCOS";
    }

    @Override
    public boolean executar() {
        
        Scanner scanner = new Scanner(System.in);
        
        double FritasDeAbacate = 18;
        double MontanhaDeNachos = 25;  
        double VivasOsVegetarianos = 23;
         double media;
        
         Scanner entrada = new Scanner(System.in);
        
        System.out.println("-----------------:------------------------------:--------------------\n");
        System.out.println("                       *** PETISCOS *** \n");
        System.out.println("-----------------:------------------------------:--------------------\n");
        System.out.println("                       *** CARDÁPIO ***\n");
        System.out.println("-----------------:------------------------------:--------------------\n");
        
        System.out.println("   ** PRATOS  **           |                          *** DESCRIÇOES DOS INGREDIENTES DOS PRATOS ***                                            |        TEMPO       |   VALOR  | ");
        
        System.out.println("1 - FRITAS DE ABACATE      | * BATATAS FRITAS DE ABACATE  COM UMA CROSTA CROCANTE DE GERGELIM, SERVIDA COM MAIONESE CASEIRA                     |       10 MINUTOS   | R$: 18,00|\n");
        System.out.println("2 - MONTANHA DE NACHOS     | * CHIPS DE TORTILHAS SERVIDOS COM GUACAMOLE, FEIJÃO APIMENTADO, QUEIJO, CREME DE NATA E JALAPENÕS                  |       10 MINUTOS   | R$: 25,00|\n");
        System.out.println("3 - VIVAS OS VEGETARIANOS  | * LEGUMES ASSADOS E UMA FLOR DE ABACATE EM UMA CAMA DE VERDURAS COM GUINOA PRETA,PESTO,PISTACHE PICADO,QUEIJO FETA |       15 MINUTOS   | R$: 23,00|\n");
        
        System.out.print("-> ESCOLHA UMA DAS REFEIÇÕES: ");
        int opc = scanner.nextInt();
         System.out.print("-> QUANTIDADE: ");
        int qtd = entrada.nextInt();
 
        switch (opc){
            case 1:
                media = FritasDeAbacate* qtd;
               System.out.println("* NOME: FRITAS DE ABACATE  ");  
               System.out.println("* VALOR R$: "+ media ); 
               System.out.println("* DESCRIÇÃO:BATATAS FRITAS DE ABACATE  COM UMA CROSTA CROCANTE DE GERGELIM, SERVIDA COM MAIONESE CASEIRA");
               System.out.println("* TEMPO DE PREPARO: 10 MINUTOS");
                break;
            case 2: 
                media = MontanhaDeNachos* qtd;
                System.out.println("* NOME: MONTANHA DE NACHOS      ");
                
               System.out.println("* VALOR R$: "+ media ); 
                System.out.println("* DESCRIÇÃO:CHIPS DE TORTILHAS SERVIDOS COM GUACAMOLE, FEIJÃO APIMENTADO, QUEIJO, CREME DE NATA E JALAPENÕS   ");
                System.out.println("* TEMPO DE PREPARO: 10 MINUTOS");
                break;
            case 3:
            media = VivasOsVegetarianos* qtd;
                System.out.println("* NOME: VIVAS OS VEGETARIANOS ");
               System.out.println("* VALOR R$: "+ media ); 
                System.out.println("* DESCRIÇÃO:LEGUMES ASSADOS E UMA FLOR DE ABACATE EM UMA CAMA DE VERDURAS COM GUINOA PRETA,PESTO,PISTACHE PICADO,QUEIJO FETA ");
                System.out.println("* TEMPO DE PREPARO: 15 MINUTOS");
                break;
           
        }
        System.out.println("-----------------:------------------------------:--------------------\n");
        System.out.println("           *** -> O  PEDIDO FOI REALIZADO COM SUCESSO!! <- *** \n");
        System.out.println("-----------------:------------------------------:--------------------\n");  
         return false;
    }
    
}
