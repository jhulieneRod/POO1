import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float metros = 0;
        float centimetros = 0;

        System.out.println("Digite a quantidade de metros: ");
        metros = entrada.nextFloat();

        entrada.close();

        centimetros = metros*100;

        System.out.println("A quantidade de metros em centímetros é: "+centimetros);
    }
}