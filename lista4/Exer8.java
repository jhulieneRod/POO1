package lista1;
import java.util.Scanner;

public class Exer8 {
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
		
		final int TAM = 5;
		int soma = 0, prod = 1;

		int vet[] = new int[TAM];
		
		for (int i = 0; i < vet.length; i++) {
			vet[i] = entrada.nextInt();
			soma = soma + vet[i];
			prod = prod * vet[i];
		}
		System.out.println("Soma: "+soma);
		System.out.println("Produto: "+prod);
	}
}
