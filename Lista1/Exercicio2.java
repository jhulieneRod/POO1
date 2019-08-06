import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        float num = 0;

        System.out.println("Digite um número: ");
        num = entrada.nextFloat();

        entrada.close();
        System.out.println("O número informado foi: "+num);
    }
}