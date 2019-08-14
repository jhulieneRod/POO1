package lista3;

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
	float menor = 0; 
        float maior = 0; 
        float soma = 0;
        float temperatura;
        float media;

        System.out.print("Insira a quantidade de temperaturas: ");
	int n = entrada.nextInt();

	for (int i = 1; i <= n; i++) {
            System.out.print("Insira a "+i+"ª temperatura: ");
            temperatura = entrada.nextFloat();
            soma = soma + temperatura;
            if(i == 1){
                maior = temperatura;
                menor = temperatura;
            }
            if (temperatura > maior) {
                maior = temperatura;
            }
            if (temperatura < menor) {
                menor = temperatura;
            }
        }
        media = soma / n;
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Média: " + media);

	}
}