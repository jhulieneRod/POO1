import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float altura = 0;
        double peso_ideal = 0;

        System.out.println("Digite sua altura: ");
        altura = entrada.nextFloat();

        entrada.close();

        peso_ideal = (72.7*altura) - 58;

        System.out.println("Seu peso ideal é: "+peso_ideal+"Kg");
    }
}