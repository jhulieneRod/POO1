package Lista06;

public class SalarioMain {
    public static void main(String[] args) {
        
        Salario s = new Salario();
        
        s.setHt(50);
        s.setVh(10);
        
        System.out.println("Salário Bruto: R$ "+s.salarioBruto());
        System.out.println("Valor pago ao INSS: R$ "+s.inss());
        System.out.println("Valor pago ao Sindicato: R$ "+s.sindicato());
        System.out.println("Salário Líquido: R$ "+s.salarioLiquido());
    }
}
