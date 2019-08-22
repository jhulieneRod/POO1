package lista1;
import java.util.Scanner;

public class Exer14 {
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
		
	final int TAM = 10;

	int vet1[] = new int[TAM];
        int vet2[] = new int[TAM];
        int vet3[] = new int[TAM];

		
	for (int i = 0; i < TAM; i++) {
            System.out.println("Insira o valor do Vetor A:");
            vet1[i] = entrada.nextInt();
                 
            System.out.println("Insira o valor do Vetor B:");
            vet2[i] = entrada.nextInt();
                 
            vet3[i] = vet1[i] + vet2[i];
	}
		
        System.out.println("Vetor C: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(vet3[i]);
        }
    }
}
