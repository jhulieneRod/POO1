package lista3;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1 = 1;
        int num2 = 0;
        int x;
        
        System.out.println("Digite o termo: ");
        x = entrada.nextInt();
        
        for(int i = 0; i < x; i++){
            System.out.println(num1);
            num1 = num1 + num2;
            num2 = num1 - num2;
        }
    }
}