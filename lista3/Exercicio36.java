package lista3;

import java.util.Scanner;

public class Exercicio36 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, c6 = 0, cont = 0;

		System.out.println("Candidatos: \n1 - Anthony \n2 - Benedict \n3 - Cameron \n4 - Daphne \n5 - Nulo \n6- Branco");
                System.out.println("------------------");
                System.out.print("Insira o seu voto: ");
		int n = entrada.nextInt();

		while (n > 0) {
			cont++;
			if (n == 1) {
				c1++;
			} else if (n == 2) {
				c2++;
			} else if (n == 3) {
				c3++;
			} else if (n == 4) {
				c4++;
			} else if (n == 5) {
				c5++;
			} else if (n == 6) {
				c6++;
			} else {
				System.out.println("Insira um voto válido ! ! !");
			}
                        System.out.println("------------------");
			System.out.print("Insira o seu voto: ");
			n = entrada.nextInt();
		}
		
                System.out.println("------------------");
		System.out.println("Votos do candidato 1: " + c1);
		System.out.println("Votos do candidato 2: " + c2);
		System.out.println("Votos do candidato 3: " + c3);
		System.out.println("Votos do candidato 4: " + c4);
		System.out.println("Porcentagem de votos nulos: " + ((c5 * 100) / cont) + "%.");
		System.out.println("Porcentagem de votos brancos: " + ((c6 * 100) / cont) + "%.");
	}
}