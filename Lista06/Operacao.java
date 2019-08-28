package Lista06;

public class Operacao {
    
    private int num1,num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    public int soma(){
        int soma = num1 + num2;
        
        return soma;
    }
    
    public double divisão(){
        double divisao;
        
        if(num1 > num2)
            divisao = num1 / num2;
        else
            divisao = num2 / num1;
        
        return divisao;
    }
    
    public int subtracao(){
        int subtracao;
        if(num1 > num2)
            subtracao = num1 - num2;
        else
            subtracao = num2 - num1;
        
        return subtracao;
    }
    
    public int multiplicacao(){
        int multiplicacao = num1 * num2;
        
        return multiplicacao;
    }
}
