package lista3;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        int digitado;
        String fatorial = "";
        
        System.out.println("Digite um número: ");
        num = entrada.nextInt();
        digitado = num;
        for(int x = num; x > 1; x-- ){
            num = num * (x-1);
            fatorial = fatorial + x + ".";
        }
        System.out.println(digitado + "!= " + fatorial + "1= "+ num);
    }
}
