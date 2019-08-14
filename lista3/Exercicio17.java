package lista3;
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        int divisivel = 0;
        
        System.out.println("Digite um número: ");
        num = entrada.nextInt();
        
        for (int i = 1; i <= num; i++){
            if(num % i == 0 && i != num){
                divisivel++;
            }
        }
        if (divisivel >= 2){
            System.out.println("Não é número Primo!");
        }else{
            System.out.println("Número primo!");
        }
    }
}