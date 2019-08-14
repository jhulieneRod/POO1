package lista3;
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        int maior;
        int menor;
        float soma;
        int num;
   
        System.out.println("Digite a quantidade de números desejado: ");
        n = entrada.nextInt();
        
        System.out.println("Digite o 1° número: ");
        num = entrada.nextInt();
        maior = num;
        menor = num;
        soma = num;
        for(int i = 2; i <= n; i++){
            System.out.println("Digite o "+i+"° número: ");
            num = entrada.nextInt();
            if(num > maior){
                maior = num;
            }
            if (num < menor){
                menor = num;
            }
            soma = soma + num;
        }
        System.out.println("Maior: "+maior+"\nMenor: "+menor+"\nSoma Total: "+soma);
    }
}