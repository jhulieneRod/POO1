package lista3;

import java.util.Scanner;

public class Exercicio38 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Insira um número: ");
		int num = entrada.nextInt();
                
		String conv = Integer.toString(num);
		String inv = "";
		for (int i = conv.length(); i > 0; i--) {
			inv += conv.substring(i - 1, i);
		}
		System.out.println("Número invertido: " + inv);
	}
}