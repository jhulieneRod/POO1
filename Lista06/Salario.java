package Lista06;

public class Salario {
    private double vh,ht;

    public double getVh() {
        return vh;
    }

    public void setVh(double vh) {
        this.vh = vh;
    }

    public double getHt() {
        return ht;
    }

    public void setHt(double ht) {
        this.ht = ht;
    }
    
    public double salarioBruto(){
        double salario = ht * vh;
        
        return salario;
    }
    
    public double inss(){
        double inss = salarioBruto() * 0.08;
        
        return inss;
    }
    
    public double sindicato(){
        double sindicato = salarioBruto() * 0.05;
        
        return sindicato;
    }
    public double ir(){
        double ir = salarioBruto() * 0.11;
        return ir;
    }
    public double descontos(){
        double descontos = ir() + inss() + sindicato();
        
        return descontos;
    }
    
    public double salarioLiquido(){
        double salario = salarioBruto() - descontos();
        
        return salario;
    }
}
