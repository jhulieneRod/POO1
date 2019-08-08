import java.util.Scanner;

public class Exercicio13{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salario_bruto = 0;
        double salario_liquido = 0; 
        float horas = 0;
        float valor_hora = 0;
        double ir = 0;
        double inss = 0;
        double fgts = 0;
        double total_descontos = 0;
        String percentual_ir = "";
        
        System.out.println("Digite o total de horas trabalhadas: ");
        horas = entrada.nextFloat();

        System.out.println("Digite o valor da hora trabalhada: ");
        valor_hora = entrada.nextFloat();

        entrada.close();
        
        salario_bruto = horas * valor_hora;

        if(salario_bruto <= 900){
            percentual_ir = "Isento";
            inss = salario_bruto * 0.1;
            fgts = salario_bruto * 0.11;
            total_descontos = ir + inss;
            salario_liquido = salario_bruto - total_descontos;
        }else if(salario_bruto <= 1500){
            percentual_ir = "5%";
            ir = salario_bruto * 0.05;
            inss = salario_bruto * 0.1;
            fgts = salario_bruto * 0.11;
            total_descontos = ir + inss;
            salario_liquido = salario_bruto - total_descontos;
        }else if(salario_bruto <= 2500){
            percentual_ir = "10%";
            ir = salario_bruto * 0.1;
            inss = salario_bruto * 0.1;
            fgts = salario_bruto * 0.11;
            total_descontos = ir + inss;
            salario_liquido = salario_bruto - total_descontos;
        }else{
            percentual_ir = "20%";
            ir = salario_bruto * 0.2;
            inss = salario_bruto * 0.1;
            fgts = salario_bruto * 0.11;
            total_descontos = ir + inss;
            salario_liquido = salario_bruto - total_descontos;
        }
        System.out.println("Salário Bruto : ("+valor_hora+" * "+horas+"): R$ "+salario_bruto);
        System.out.println("(-) IR ("+percentual_ir+"): R$ "+ir);
        System.out.println("(-) INSS (10%): R$ "+inss);
        System.out.println("FGTS (11%): R$ "+fgts);
        System.out.println("Total de descontos: R$ "+total_descontos);
        System.out.println("Salario líquido: R$ "+salario_liquido);
    }
}