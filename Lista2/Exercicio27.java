import java.util.Scanner;

public class Exercicio27{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float num1 = 0;
        
        System.out.println("Digite um número: ");
        num1 = entrada.nextFloat();
        
        if(num1 % 1 == 0){
            System.out.println("Número Inteiro!");
        }else{
            System.out.println("Número Decimal!");
        }
    }
}