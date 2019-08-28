package Lista06;

public class IntervaloMain {
    public static void main(String[] args) {
        
        Intervalo i = new Intervalo();
        
        i.setInicio(20);
        i.setFim(2);
        
        if(i.verificaNumeros()){
            System.out.println("Foi feita a inversão dos números!");
        }
        
        System.out.println("Números no intervalo: "+ i.intervalo());
    }
}
