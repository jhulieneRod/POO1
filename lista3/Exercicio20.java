package lista3;
import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        float nota;
        double soma = 0;
        double media;
        
        System.out.println("Digite a quantidade de notas a ser digitadas: ");
        n = entrada.nextInt();
        
        for(int i = 1; i <= n; i++){
            System.out.println("Digite a "+i+"° nota: ");
            nota = entrada.nextFloat();
            soma = soma + nota;
        }
        media = soma / n;
        System.out.println("A média das notas digitadas é: "+media);
    }
    
}
