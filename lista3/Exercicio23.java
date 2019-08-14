package lista3;
import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int soma = 0;
        float media = 0;

        System.out.println("Digite a quantidade de turmas: ");
        final int turmas = entrada.nextInt();
        int vetor[] = new int[turmas];
        
        for(int x = 0; x < turmas; x++ ){
            
            do{
                int n = x+1;
                System.out.println("Quantidades de alunos da turma "+n);
                vetor[x] = entrada.nextInt();
                if(vetor[x] <= 0 || vetor[x] > 40){
                    System.out.println("Número Inválido . . . Digite Novamente . . .");
                }
            }while(vetor[x] <= 0 || vetor[x] > 40);
            soma = soma + vetor[x];
        }
        media = soma / turmas;
        System.out.println("A média de alunos por turmas é: "+media);
    }
}