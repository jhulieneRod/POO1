import java.util.Scanner;
import java.lang.Math;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float raio = 0;
        double area = 0;
        float pi = 3.14f;

        System.out.println("Digite o raio do círculo: ");
        raio = entrada.nextFloat();

        entrada.close();
        area = Math.pow(raio, 2)*pi;

        System.out.println("A area do círculo é: "+area);
    }
}