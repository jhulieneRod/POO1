package Lista06;

public class OperacaoMain {
    public static void main(String[] args) {
        
        Operacao o = new Operacao();
        
        o.setNum1(5);
        o.setNum2(3);
        
        System.out.println("Soma: "+o.soma());
        System.out.println("Subtração: "+o.subtracao());
        System.out.println("Divisão: "+o.divisão());
        System.out.println("Multiplicação: "+o.multiplicacao());
    }
}
