import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float num1 = 0;
        float num2 = 0;
        float soma = 0;

        System.out.println("Digite o primeiro número: ");
        num1 = entrada.nextFloat();

        System.out.println("Digite o segundo número: ");
        num2 = entrada.nextFloat();

        entrada.close();

        soma = num1+num2;
        System.out.println("A soma dos dois números é: "+soma);
    }
}