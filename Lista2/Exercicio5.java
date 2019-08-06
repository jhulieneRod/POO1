import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        char letra = 'a';

        System.out.println("Informe uma letra: ");
        letra = entrada.nextLine().toUpperCase().charAt(0);

        entrada.close();

        if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
            System.out.println("A letra digitada é vogal!");
        }else {
            System.out.println("A letra digitada não é vogal!");
        }
    }
}