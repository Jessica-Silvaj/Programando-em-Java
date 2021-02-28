
package sistcontrolderestaurante.MenuComida;

import java.util.Scanner;
import sistcontrolderestaurante.dao.Dao;
import sistcontrolderestaurante.dao.DaoArrayList;


public class Bebidas extends ItemdoCardapio {

    @Override
    public String getDescricao() {
         return "BEBIDAS ";
    }

    @Override
    public boolean executar() {
         Scanner scanner = new Scanner(System.in);
       
        double CervejaHeineken = 8;
        double Caipirinha= 12;
        double RedLabel = 20;
        
        double Laranja = 8;
        double Limao= 8;
        double Melancia = 8;
        
        double Cocacola = 3.50;
        double Guarana = 3.50;
        double Fanta = 3.50;
        double media;
        
        
         Scanner entrada = new Scanner(System.in);
         
         Scanner continuar = new Scanner(System.in);
         
          int s;
          
         
         
        System.out.println("-----------------:------------------------------:--------------------\n");
        System.out.println("                       *** BEBIDAS*** \n");
        System.out.println("-----------------:------------------------------:--------------------\n");
        System.out.println("                       *** CARDÁPIO ***\n");
        System.out.println("-----------------:------------------------------:--------------------\n");
        
        System.out.println("   ** BEBIDAS ALCOÓLICA **  |                          *** DESCRIÇOES DAS BEBIDAS ***                                                       |   VALOR  | ");
        
        System.out.println("1 - CERVEJA HEINEKEN        | * CERVEAJA SUPER PREMIUM PURO MALTE, ELABORADA COM INGREDIENTES 100% NATURAIS  E SEM ADIÇÃO DE CONSERVANTES   | R$: 8,00|\n");
        System.out.println("2 - CAIPIRINHA              | * BEBIDA Á BASE DE CACHAÇA, LIMÃO E ACÚCAR                                                                    | R$: 12,00|\n");
        System.out.println("3 - DOSE DE WHISKY RED LABEL| * BEND SCOTCH  WHISKY,RICO E INCORPORADO, COM UMA SELEÇÃO INIGUALÁVEL DE MAIS  DE 35 MALTES NA SUA COMPOSIÇÃO | R$: 20,00|\n");
        System.out.println("-----------------:------------------------------:-------------------------------------:------------------------------:----------------------|----------|\n");
        System.out.println("   ** SUCOS **              |                          *** DESCRIÇOES DAS BEBIDAS ***                                                       |   VALOR  | ");
        System.out.println("4 - LARANJA                 | * 500 ML DE SUCO DA FRUTA, FEITO NA HORA                                                                      | R$: 8,00|\n");
        System.out.println("5 - LIMÃO                   | * 500 ML DE SUCO DA FRUTA, FEITO NA HORA                                                                      | R$: 8,00|\n");
        System.out.println("6 - MELÂNCIA                | * 500 ML DE SUCO DA FRUTA, FEITO NA HORA                                                                      | R$: 8,00|\n");
        System.out.println("-----------------:------------------------------:-------------------------------------:------------------------------:----------------------|----------|\n");
        System.out.println("   ** REFRIGERANTES **      |                          *** DESCRIÇOES DAS BEBIDAS ***                                                       |   VALOR  | ");
        System.out.println("7 - COCA - COLA             | * LATA DE REFRIGERANTE DE NOZ-DE-COLA                                                                         | R$: 3,50|\n");
        System.out.println("8 - GUARANÁ                 | * LATA DE REFRIGERANTE DE EXTRATO DE GUARANÁ                                                                  | R$: 3,50|\n");
        System.out.println("9 - FANTA                   | * LATA DE REFRIGERANTE Á BASE DE SUCO DE LARANJA E MAÇÃ                                                       | R$: 3,50|\n");
        
        
        System.out.println("-> ESCOLHA SUA BEBIDA: ");
        int opc = scanner.nextInt();
        System.out.print("-> QUANTIDADE: ");
        int qtd = entrada.nextInt();
        
        switch (opc){
            
            case 1:
                
                 media = CervejaHeineken * qtd;
               System.out.println("* NOME: CERVEJA HEINEKEN ");
               System.out.println("* VALOR R$: "+ media ); 
               System.out.println("* DESCRIÇÃO: CERVEAJA SUPER PREMIUM PURO MALTE, ELABORADA COM INGREDIENTES 100% NATURAIS  E SEM ADIÇÃO DE CONSERVANTES ");
               System.out.println("* TEMPO DE PREPARO:  0 MINUTOS");
                break;
                
            case 2: 
                
                 media = Caipirinha * qtd;
                System.out.println("* NOME: CAIPIRINHA");
                System.out.println("* VALOR R$: "+ media);
                System.out.println("* DESCRIÇÃO:BEBIDAA Á BASE DE CACHAÇA, LIMÃO E ACÚCAR");
                System.out.println("* TEMPO DE PREPARO: 0 MINUTOS");
                break;
            case 3:
            
                 media = RedLabel * qtd;
                System.out.println("* NOME: DOSE DE WHISKY RED LABEL ");
                System.out.println("* VALOR R$: "+ media);
                System.out.println("* DESCRIÇÃO:BEND SCOTCH  WHISKY,RICO E INCORPORADO, COM UMA SELEÇÃO INIGUALÁVEL DE MAIS  DE 35 MALTES NA SUA COMPOSIÇÃO ");
                System.out.println("* TEMPO DE PREPARO: 0 MINUTOS");
                
                break;
            case 4:
                
                media = Laranja* qtd;
                System.out.println("* NOME: LARANJA  ");
                System.out.println("* VALOR R$: "+ media);
                System.out.println("* DESCRIÇÃO: 500 ML DE SUCO DA FRUTA, FEITO NA HORA    ");
                System.out.println("* TEMPO DE PREPARO: 0 MINUTOS");
                
                break;
                case 5:
                
                media =  Limao * qtd;
                System.out.println("* NOME: LIMÃO  ");
                System.out.println("* VALOR R$: "+ media);
                System.out.println("* DESCRIÇÃO: 500 ML DE SUCO DA FRUTA, FEITO NA HORA    ");
                System.out.println("* TEMPO DE PREPARO: 0 MINUTOS");
                break;
                case 6:
                
                media =  Melancia* qtd;
                System.out.println("* NOME: MELÂNCIA ");
                System.out.println("* VALOR R$: "+ media);
                System.out.println("* DESCRIÇÃO: 500 ML DE SUCO DA FRUTA, FEITO NA HORA     ");
                System.out.println("* TEMPO DE PREPARO: 0 MINUTOS");
                break;
                case 7:
                
                media = Cocacola * qtd;
                System.out.println("* NOME: COCA - COLA  ");
                System.out.println("* VALOR R$: "+ media);
                System.out.println("* DESCRIÇÃO: LATA DE REFRIGERANTE DE NOZ-DE-COLA   ");
                System.out.println("* TEMPO DE PREPARO: 0 MINUTOS");
                break;
                case 8:
                
                media = Guarana* qtd;
                System.out.println("* NOME: GUARANÁ  ");
                System.out.println("* VALOR R$: "+ media);
                System.out.println("* DESCRIÇÃO: LATA DE REFRIGERANTE DE EXTRATO DE GUARANÁ    ");
                System.out.println("* TEMPO DE PREPARO: 0 MINUTOS");
                break;
                case 9:
                
                media = Fanta* qtd;
                System.out.println("* NOME:  FANTA ");
                System.out.println("* VALOR R$: "+ media);
                System.out.println("* DESCRIÇÃO: LATA DE REFRIGERANTE Á BASE DE SUCO DE LARANJA E MAÇÃ  ");
                System.out.println("* TEMPO DE PREPARO: 0 MINUTOS"); 
    
                break;       
        }
        
      
        
        System.out.println("-----------------:------------------------------:--------------------\n");
        System.out.println("           *** -> O  PEDIDO FOI REALIZADO COM SUCESSO!! <- *** \n");
        System.out.println("-----------------:------------------------------:--------------------\n");
       
        
         return false;
    }
}
    

