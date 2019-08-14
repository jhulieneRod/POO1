package lista3;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int base;
        int expoente;
        int resultado = 1;
        
        System.out.println("Digite a base: ");
        base = entrada.nextInt();
        System.out.println("Digite o expoente: ");
        expoente = entrada.nextInt();
        
        for(int x = 1; x <= expoente; x++ ){
            resultado = resultado * base;
        }
        System.out.println("Resultado: " + resultado);
    }
}
