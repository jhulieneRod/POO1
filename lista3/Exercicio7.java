package lista3;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int inicio;
        int fim;
        
        System.out.println("Digite dois números inteiros: ");
        inicio = entrada.nextInt();
        fim = entrada.nextInt();
        
        for(int x = inicio+1; x < fim; x++ ){
            System.out.print(x + " ");
        }
    }
}
