import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float horas_trabalhadas = 0;
        float valor_hora = 0;
        double salario_bruto = 0;
        double ir = 0;
        double inss = 0;
        double sindicato = 0;
        double salario_liquido = 0;
        double descontos = 0;

        System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
        horas_trabalhadas = entrada.nextFloat();

        System.out.println("Digite quanto você ganha por hora: ");
        valor_hora = entrada.nextFloat();

        entrada.close();

        salario_bruto = horas_trabalhadas * valor_hora;
        ir = salario_bruto * 0.11;
        inss = salario_bruto * 0.08;
        sindicato = salario_bruto * 0.05;
        descontos = ir + inss + sindicato;
        salario_liquido = salario_bruto - descontos;

        System.out.println("O seu salário do mês referido é: R$ "+salario_liquido);
        System.out.println("Salario bruto: R$ "+salario_bruto+"\nTotal de descontos : R$ "+descontos);
    }
}