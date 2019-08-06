import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int ano = 0;

        System.out.println("Digite um ano: ");
        ano = entrada.nextInt();

        entrada.close();

        if (ano%4 == 0) {
            if(ano%100 > 0)
                System.out.println("Ano bissexto!");
        }else 
            System.out.println("Ano não bissexto!");
    }
}