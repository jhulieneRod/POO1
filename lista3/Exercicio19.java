package lista3;
import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int intervalo;
        
        System.out.println("Digite o intervalo: ");
        intervalo = entrada.nextInt();
        
        for (int i = 2; i < intervalo; i++) {
            boolean Primo = true;
            for (int x = 2; x <= i; x++) {
                if (((i % x) == 0) && (x != i)) {
                    Primo = false;
                    break;
                }
            }

            if (Primo) {
                System.out.print(i + " ");
            } 
        }

    }

}