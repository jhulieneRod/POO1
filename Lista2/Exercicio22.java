import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num = 0;
        int centenas = 0;
        int dezenas = 0;
        int unidades = 0;

        System.out.println("Digite um número até 1000: ");
        num = entrada.nextInt();

        entrada.close();

        if (num <= 1000) {
            centenas = num / 100;
            dezenas = (num % 100) / 10;
            unidades = (num  % 100) % 10;
            System.out.println("Centenas: "+centenas+" - Dezenas: "+dezenas+" - Unidades: "+unidades);
        }else {
            System.out.println("Número inválido!");
        }
    }
}