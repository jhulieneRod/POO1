package lista3;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tabuada;
        int resultado;
        
        System.out.println("Digite o número da tabuada: ");
        tabuada = entrada.nextInt();
        
        for(int x = 1; x <= 10; x++ ){
            resultado = x * tabuada;
            System.out.println(tabuada + " x " + x + " = "+resultado);
        }
    }
}
