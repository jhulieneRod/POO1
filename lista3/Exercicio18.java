package lista3;
import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        int divisivel = 0;
        String num_divisiveis = "";
        
        System.out.println("Digite um número: ");
        num = entrada.nextInt();
        
        for (int i = 1; i <= num; i++){
            if(num % i == 0 && i != num){
                divisivel++;
                num_divisiveis = num_divisiveis + i + " "; 
            }
        }
        if (divisivel >= 2){
            System.out.println("Divisível por: "+num_divisiveis);
        }else{
            System.out.println("Número primo!");
        }
    }
}