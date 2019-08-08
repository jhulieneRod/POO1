import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num = 0;
        int nota100 = 0;
        int nota50 = 0;
        int nota10 = 0;
        int nota5 = 0;
        int nota1 = 0;
        int resto = 0;

        System.out.println("Digite o valor do saque (mínimo R$10): ");
        num = entrada.nextInt();

        entrada.close();

        if (num > 10) {
            nota100 = num / 100;
            if(num % 100 >= 50){
                nota50 = (num % 100) / 50;
                resto = (num % 100) % 50;
            }if(resto != 0){
                nota10 = resto / 10;
                resto = resto % 10;
            }
            if(resto != 0 && resto >= 5){
                nota5 = resto / 5;
                resto = resto % 5;
            }
            if(resto != 0){
                nota1 = resto / 1;
            }

        }else {
            System.out.println("Número inválido!");
        }
        System.out.println("Valor do Saque: "+num);
        System.out.println("Notas de 100: "+nota100);
        System.out.println("Notas de 50: "+nota50);
        System.out.println("Notas de 10: "+nota10);
        System.out.println("Notas de 5: "+nota5);
        System.out.println("Notas de 1: "+nota1);
    }
}