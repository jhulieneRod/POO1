package lista3;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int termo;
        int x = 1;
        int y = 1;
        String s = "";
        System.out.println("Digite o termo: ");
        termo = entrada.nextInt();
        s = x + "/" + y;
        for(int i = 0; i < termo; i++){
            x++;
            y = y + 2;
            s = s + " + " + x + "/" + y;
        }
        System.out.println("S = " + s);
    }
}