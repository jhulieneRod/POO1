package lista3;
import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double preco = 1.99;
        System.out.println("Lojas Quase Dois - Tabela de preços");
        for (int i = 1; i <= 50; i++){
            System.out.printf(i + "- %.2f %n",  preco); 
            preco = preco + 1.99;
        }
    }
}