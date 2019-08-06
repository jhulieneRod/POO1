import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float altura = 0;
        double peso_ideal_H = 0;
        double peso_ideal_M = 0;

        System.out.println("Digite sua altura: ");
        altura = entrada.nextFloat();

        entrada.close();

        peso_ideal_H = (72.7*altura) - 58;
        peso_ideal_M = (62.1*altura) - 44.7;

        System.out.println("O peso ideal para homens de "+altura+"cm é: "+peso_ideal_H+"Kg");
        System.out.println("O peso ideal para mulheres de "+altura+"cm é: "+peso_ideal_M+"Kg");
    }
}