package lista3;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        int par = 0;
        int impar = 0;
        
        System.out.println("Digite 10 números inteiros: ");
        for(int x = 0; x < 10; x++ ){
            num = entrada.nextInt();
            if(num % 2 == 0){
                par = par + 1;
            }else{
                impar = impar + 1;
            }
        }
        System.out.println("Números pares: " + par);
        System.out.println("Números im1pares: " + impar);
    }
}
