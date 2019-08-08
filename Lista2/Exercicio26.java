import java.util.Scanner;

public class Exercicio26{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num = 0;
        
        System.out.println("Digite um número: ");
        num = entrada.nextInt();

        if(num%2 == 0){
            System.out.println("Número par!");
        }else{
            System.out.println("Número ímpar!");
        }
    }
}