package lista3;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int inicio;
        int fim;
        int soma = 0;
        
        System.out.println("Digite dois números inteiros: ");
        inicio = entrada.nextInt();
        fim = entrada.nextInt();
        
        for(int x = inicio+1; x < fim; x++ ){
            System.out.print(x + " ");
            soma = soma + x;
        }
        System.out.println("\nSoma: "+soma);
    }
}
