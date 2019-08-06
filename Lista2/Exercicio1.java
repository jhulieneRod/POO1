import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float num1 = 0;
        float num2 = 0;
        float maior = 0;

        System.out.println("Digite o primeiro número: ");
        num1 = entrada.nextFloat();

        System.out.println("Digite o segundo número: ");
        num2 = entrada.nextFloat();

        entrada.close();

        if(num1 > num2){
            maior = num1;
        } else if(num2 > num1) {
            maior = num2;
        } else {
            System.out.println("Os números informados são iguais!");
        }

        System.out.println("O maior dos dois números é: "+maior);
    }
}