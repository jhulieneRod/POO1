package lista1;

import java.util.Scanner;

public class Exer2 {
	public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
		final int TAM = 5;
		int vet[] = new int[TAM];
		
		for (int i = 0; i < vet.length; i++) { 
			vet[i] = entrada.nextInt();
		}
		
		for (int i = (vet.length)-1; i >= 0; i--) { 
			System.out.println(vet[i]);
		}
		
	}

}
