package lista3;
import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float total = 0;
        float media = 0;

        System.out.println("Digite a quantidade de CDs: ");
        final int cds = entrada.nextInt();
        float vetor[] = new float[cds];
        
        for(int x = 0; x < cds; x++ ){
            
            do{
                int n = x+1;
                System.out.println("Digite o valor do "+n+"° CD");
                vetor[x] = entrada.nextFloat();
                if(vetor[x] <= 0){
                    System.out.println("Número Inválido . . . Digite Novamente . . .");
                }
            }while(vetor[x] <= 0);
            total = total + vetor[x];
        }
        media = total / cds;
        System.out.println("O valor totar investido nos CDs foi: "+total+"\nO valor médio gasto com cada CD foi: "+media);
    }
}