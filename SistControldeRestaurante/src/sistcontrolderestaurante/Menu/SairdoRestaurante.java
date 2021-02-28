
package sistcontrolderestaurante.Menu;

public class SairdoRestaurante extends ItemDeMenu{
    
     @Override
    public String getDescricao() {
       
        return "SAIR DO RESTAURANTE";
    }

    @Override
    public boolean executar() {
        //Adc os Patrocinadores dps
        System.out.println("\t\t OBRIGADO POR UTILIAR OS NOSSOS SERVIÇOS!!\n");
         System.out.println(
                           "|---------------------------------------------------------|"
                         + "\n     ** COMPONETES DO DESENVOLVIMENTO DO SISTEMA!!**   "
                         + "\n               ** ALVARO SILVA LIMA **                     "
                         + "\n               ** GABRIELA MONTEIRO **                     "
                         + "\n               ** ITALO NASCIMENTO **                      "
                         + "\n                 ** JÉSSICA SILVA**"
                         + "\n               ** ROBERTO SILVA **                     \"                "
                         + "\n\n         ** ORIENTADO DESSE PROJETO!!**                       "
                         + "\n                 ** OTHON BATISTA **                    "
                         + "\n|-------------------------------------------------------|");
        
        System.out.println("\t\t              VOLTE SEMPRE!!");
       
       return true; 
    }
}
    
