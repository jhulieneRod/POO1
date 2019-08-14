package lista3;
import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tabuada;
        int resultado;
        int inicio;
        int fim;
        
        System.out.println("Digite o número da tabuada: ");
        tabuada = entrada.nextInt();
        
        System.out.println("Digite o número de inicio: ");
        inicio = entrada.nextInt();
        
        System.out.println("Digite o número final: ");
        fim = entrada.nextInt();
        
        for(int x = inicio; x <= fim; x++ ){
            resultado = x * tabuada;
            System.out.println(tabuada + " x " + x + " = "+resultado);
        }
    }
}
