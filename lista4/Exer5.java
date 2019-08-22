package lista1;
import java.util.Scanner;

public class Exer5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int TAM = 10, qtdc = 0;
		String consoantes = "";

		char  vet[] = new char[TAM];
		
		for (int i = 0; i < vet.length; i++) {
			System.out.println("Informe uma letra");
			vet[i] = entrada.next().charAt(0);
			
			if((vet[i]=='a')||(vet[i]=='e')||(vet[i]=='i')||(vet[i]=='o')||(vet[i]=='u')) {
				consoantes = consoantes+vet[i]+"|";
				qtdc++;
			}
		}
		
		System.out.println("Número de Consoantes:"+qtdc);	
		System.out.println("Consoantes lidas: "+consoantes);
	}
}
