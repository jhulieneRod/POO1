import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float num = 0;
        String resultado = "";

        System.out.println("Digite um número: ");
        num = entrada.nextFloat();

        if (num > 0) {
            resultado = "Positivo";
        }else if (num < 0){
            resultado = "Negativo";
        }else {
            resultado = "Zero";
        }

        System.out.println("O número informado é "+resultado);
    }
}