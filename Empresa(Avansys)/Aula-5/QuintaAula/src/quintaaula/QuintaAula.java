package quintaaula;

public class QuintaAula {

    public static void main(String[] args) {
        /*Produto[] lista = new Produto[4];
        int i;
        
        lista[0] = new Produto(1, "Computador");
        lista[1] = new Produto(2, "Teclado");
        lista[2] = new Produto(3, "Mouse");
        lista[3] = new Produto(4, "Plada de Rede");
        
        for(Produto p : lista){
            System.out.println(p.getId());
            System.out.println(p.getNome());
        }
*/
        Carro c = new Carro("Ford K", 1.0f);
        System.out.println(c.getModelo());
        
        Motorista m = new Motorista();
        m.dirige(c);
        m.dirige(c);
        m.dirige(c);
        
        System.out.println(c.getVelocidade());
                
    }
    
}
