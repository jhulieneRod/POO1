import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float farenheit = 0;
        float celsius = 0;

        System.out.println("Digite a temperatura em Farenheit: ");
        farenheit = entrada.nextFloat();

        entrada.close();

        celsius = (5 * (farenheit-32) / 9);

        System.out.println("A temperatura em Celsius é "+celsius+"°C");

    }
}