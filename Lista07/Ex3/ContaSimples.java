package Lista07.Ex3;

public class ContaSimples extends ContaBancaria{
    private double saldoPoupanca;

    public double getSaldoPoupanca() {
        return saldoPoupanca;
    }

    public void setSaldoPoupanca(double saldoPoupanca) {
        this.saldoPoupanca = saldoPoupanca;
    }
    
    public boolean depositoPoupanca(double valor){
        boolean result = false; 
        if(valor > 0){
            this.saldoPoupanca += valor;
            result = true;
        }
        return result;
    }
    
    public boolean saquePoupanca(double valor){
        boolean result = false; 
        if(valor > 0 && valor <= this.saldoPoupanca){
            this.saldoPoupanca -= valor;
            result = true;
        }
        return result;
    }

    @Override
    public String toString() {
        return "ContaSimples{" + "saldoPoupanca=" + saldoPoupanca + '}';
    }    
}
