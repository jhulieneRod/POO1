package lista3;
import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float altura = 0, maior = 0, menor = 0, cmenor = 0, cmaior = 0;
		int codigo = 0;

		for (int i = 1; i <= 10; i++) {
                        
                        System.out.print("Insira o número do aluno: ");
			codigo = entrada.nextInt();
                        
			System.out.print("Insira a altura: ");
			altura = entrada.nextFloat();

			if (i == 1) {
				maior = altura;
				menor = altura;
				cmaior = codigo;
				cmenor = codigo;
			} else if (altura > maior) {
				maior = altura;
				cmaior = codigo;

			} else if (altura < menor) {
				menor = altura;
				cmenor = codigo;
			}
		}
                
		System.out.println("Mais alto: " + maior + " | Código do aluno: " + cmaior);
		System.out.println("Mais baixo: " + menor + " | Código do aluno: " + cmenor);

	}
}
