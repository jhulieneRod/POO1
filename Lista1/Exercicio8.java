import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float valor_hora = 0;
        float horas_trabalhadas = 0;
        float salario_mes = 0;

        System.out.println("Digite o valor que você ganha por hora: ");
        valor_hora = entrada.nextFloat();
        
        System.out.println("Digite a quantidade de horas trabalhadas: ");
        horas_trabalhadas = entrada.nextFloat();
        
        entrada.close();
        salario_mes = valor_hora*horas_trabalhadas;

        System.out.println("O seu salário do mês é: R$"+salario_mes);
    }
}