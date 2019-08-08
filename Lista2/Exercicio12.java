import java.util.Scanner;

public class Exercicio12{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float salario_atual = 0;
        double novo_salario = 0;
        double aumento = 0;
        String percentual = "";
        
        System.out.println("Digite o valor do seu salário: ");
        salario_atual = entrada.nextFloat();

        entrada.close();
        
        if(salario_atual <= 280){
            aumento = salario_atual * 0.2;
            novo_salario = salario_atual + aumento;
            percentual = "20%";
        }else if(salario_atual > 280 && salario_atual <= 700){
            aumento = salario_atual * 0.15;
            novo_salario = salario_atual + aumento;
            percentual = "15%";
        }else if(salario_atual > 700 && salario_atual <= 1500){
            aumento = salario_atual * 0.1;
            novo_salario = salario_atual + aumento;
            percentual = "10%";
        }else{
            aumento = salario_atual * 0.05;
            novo_salario = salario_atual + aumento;
            percentual = "5%";
        }
        System.out.println("Salário antes do reajuste: R$"+salario_atual+"\nPercentual de aumento: "+percentual+"\nValor do aumento: R$"+aumento+"\nNovo salário: R$"+novo_salario);
    }
}