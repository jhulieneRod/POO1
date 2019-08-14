package lista3;
import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o preço do pão:");
        double preco = entrada.nextDouble();
        
        System.out.println("Preço do pão: "+preco);
        System.out.println("Panificadora Pão de Ontem - Tabela de preços");
        for (int i = 1; i <= 50; i++){
            System.out.printf(i + "- %.2f %n",  (preco * i)); 
        }
    }
}