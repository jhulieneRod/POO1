import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float lado = 0;
        float area = 0;

        System.out.println("Digite o lado do quadrado: ");
        lado = entrada.nextFloat();

        entrada.close();
        area = lado*lado;

        System.out.println("A area do quadrado é: "+area);
    }
}