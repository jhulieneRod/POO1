package Lista06;

public class Quadrado {
    private double lado;

    public double retornaLado() {
        return lado;
    }

    public void mudarLado(double lado) {
        this.lado = lado;
    }
    
    public double calculaArea(){
        double area = lado * lado;
        return area;
    }
    
}
