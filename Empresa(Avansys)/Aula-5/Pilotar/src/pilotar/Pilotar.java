package pilotar;

public class Pilotar {

    public static void main(String[] args) {
        Aviao a = new Aviao("PT01u5");
        Piloto p = new Piloto("Eustáquio");
        p.pilotar(a);
        if(a.isVoando()){
            System.out.println("Está voando");
        }else{
            System.out.println("Está em solo");
        }
    }
    
}
