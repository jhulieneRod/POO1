import java.util.Scanner;
import java.lang.Math;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        float num3 = 0;
        double a = 0;
        float b = 0;
        double c = 0;

        System.out.println("Digite o primeiro número inteiro: ");
        num1 = entrada.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        num2 = entrada.nextInt();

        System.out.println("Digite um número real: ");
        num3 = entrada.nextFloat();

        a = (num1*2)*(num2/2);
        b = (num1*3)+num3;
        c = Math.pow(num3, 3);

        System.out.println("O produto do dobro do primeiro com metade do segundo: "+a);
        System.out.println("A soma do triplo do primeiro com o terceiro: "+b);
        System.out.println("O terceiro elevado ao cubo: "+c);
    }

}