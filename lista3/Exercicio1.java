import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int nota1;

        System.out.println("Digite um valor vÃ¡lido: ");
        nota1 = entrada.nextInt();

        while (nota1 < 0 || nota1 > 10) {
            System.out.println("Digite um valor vÃ¡lido: ");
            nota1 = entrada.nextInt();
        }
        System.out.println("Nota digitada: "+nota1);
    }
}